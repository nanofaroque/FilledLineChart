package chart.bar.custom.allstate.com.filledlinechart;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by ofaro on 3/11/2015.
 */
public class FilledLineChartDraw extends View {
    public FilledLineChartDraw(Context context) {
        super(context);
    }

    public FilledLineChartDraw(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.GREEN);
        Point p1=new Point(10,10);
        Point p2=new Point(20,400);
        Point p3=new Point(400,250);
        Point p4=new Point(350,30);

        Path polyPath=new Path();
        polyPath.moveTo(p1.getX(),p1.getY());
        polyPath.lineTo(p2.getX(),p2.getY());
        polyPath.lineTo(p3.getX(),p3.getY());
        polyPath.lineTo(p4.getX(),p4.getY());
        polyPath.lineTo(p1.getX(),p1.getY());

        canvas.drawPath(polyPath,paint);


    }
}
