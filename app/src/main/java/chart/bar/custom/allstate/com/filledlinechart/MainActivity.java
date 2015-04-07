package chart.bar.custom.allstate.com.filledlinechart;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {
    ArrayList<BillInfo> dataList;
    int[] color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dataList=makeYourOwnDataList();
        color=makeYourOwnColor();
        RelativeLayout relativeLayout=(RelativeLayout)findViewById(R.id.relativeLayout);
        //relativeLayout.addView(new FilledLineChartDraw(this,dataList,color));
        relativeLayout.addView(new FilledLineChartDraw(this,dataList));
    }

    private int[] makeYourOwnColor() {
        color= new int[]{Color.GREEN, Color.BLACK, Color.MAGENTA, Color.BLUE, Color.CYAN};
        return color;
    }

    private ArrayList<BillInfo> makeYourOwnDataList() {
        ArrayList<BillInfo> dataList=new ArrayList<BillInfo>();
        dataList.add(new BillInfo(170,50,60,60));
        dataList.add(new BillInfo(200,40,80,80));
        dataList.add(new BillInfo(140,40,40,60));
        dataList.add(new BillInfo(240,90,60,90));
        return dataList;
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
