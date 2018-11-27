package com.example.florian.arduback;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by Florian on 27.11.2018.
 */

public class HistoryActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_history);

        LineGraphSeries<DataPoint> series = new LineGraphSeries<>();
        GraphView graph = (GraphView) findViewById(R.id.graph);

        graph.getViewport().setMinX(0);
        graph.getViewport().setMaxX(10000);
        graph.getViewport().setMinY(100);
        graph.getViewport().setMaxY(600);

        graph.getViewport().setYAxisBoundsManual(true);
        graph.getViewport().setXAxisBoundsManual(true);


        double x = 0;
        double y = 0;
        for(int i = 0; i < BluetoothActivity.historyContent.size(); i++) {
            x += 2;
            try {
                y = Double.parseDouble(BluetoothActivity.historyContent.get(i));
            } catch (Exception e) {
                y = 260;
            }
            series.appendData(new DataPoint(x, y), true, BluetoothActivity.historyContent.size());
        }
        graph.addSeries(series);

    }

}
