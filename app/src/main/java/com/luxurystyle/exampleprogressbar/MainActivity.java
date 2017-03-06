package com.luxurystyle.exampleprogressbar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.luxurystyle.timerprogressbar.ProgressTimer;

public class MainActivity extends AppCompatActivity {

    ProgressTimer progressTimer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        progressTimer = ((ProgressTimer) findViewById(R.id.progressTimer));
        progressTimer.setCircleColor(R.color.colorAccent);
        progressTimer.setProgress(360, 0);
        progressTimer.setDuration(5000);
        progressTimer.startAnimation();
    }
}
