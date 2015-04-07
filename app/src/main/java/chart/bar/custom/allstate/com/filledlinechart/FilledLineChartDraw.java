package chart.bar.custom.allstate.com.filledlinechart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;

import java.util.ArrayList;

/*
 * Created by ofaro on 3/11/2015.
 */
public class FilledLineChartDraw extends View {
    ArrayList<BillInfo> dataList;
    int width;
    int height;
    int[] color;
    public FilledLineChartDraw(Context context) {
        super(context);
        dataList=new ArrayList<BillInfo>();
        init();
    }
    private void init() {
        WindowManager windowManager= (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
        Display display=windowManager.getDefaultDisplay();
        Point point=new Point();
        display.getSize(point);
        width=point.x;
        height=point.y;
        color= new int[]{Color.GREEN, Color.RED, Color.MAGENTA, Color.BLUE, Color.CYAN};
        Log.d("Width:", String.valueOf(width));
        dataList.add(new BillInfo(170,50,60,60));
        dataList.add(new BillInfo(200,40,80,80));
        dataList.add(new BillInfo(140,40,40,60));
        dataList.add(new BillInfo(240,90,60,90));
    }
    public FilledLineChartDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int[] total=new int[dataList.size()];
        for(int i=0;i<dataList.size();i++){
            Path polyPath=new Path();
            polyPath.moveTo(10,500);
            int space=10;
            for(int j=0;j<dataList.size();j++){
                int end=0;
                switch (i){
                    case 0:
                        end=500-dataList.get(j).getTotal();
                        break;
                    case 3:
                        end=dataList.get(j).getCar1();
                        break;
                    case 2:
                        end=dataList.get(j).getCar2();
                        break;
                    case 1:
                        end=dataList.get(j).getCar3();
                        break;
                }
                total[j]=total[j]+end;
                polyPath.lineTo(space,total[j]);
                space=space+width/dataList.size();
            }
            polyPath.lineTo(space-width/dataList.size(),500);
            Paint paint1=new Paint();
            paint1.setStyle(Paint.Style.FILL);
            paint1.setColor(color[i]);
            canvas.drawPath(polyPath,paint1);
        }

    }
}
