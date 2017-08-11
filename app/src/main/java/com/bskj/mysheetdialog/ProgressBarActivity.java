package com.bskj.mysheetdialog;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.bskj.mysheetdialog.view.CustomProgressBar;

public class ProgressBarActivity extends AppCompatActivity {

    private CustomProgressBar mProgressBar ;
    private CustomProgressBar mProgressBar2 ;
    private CustomProgressBar mProgressBarMy ;
    private Context ctx;

    private int num = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress_bar);
        ctx = this;

        mProgressBar = (CustomProgressBar) findViewById(R.id.cpb_progresbar);
        mProgressBar.setOnFinishedListener(new CustomProgressBar.OnFinishedListener() {
            @Override
            public void onFinish() {
                Toast.makeText(ctx,"done!",Toast.LENGTH_SHORT).show();
            }
        });
        mProgressBar.setProgressDesc("剩余");
        mProgressBar.setMaxProgress(50);
        mProgressBar.setProgressColor(Color.parseColor("#F6CB82"));
        mProgressBar.setCurProgress(50);


        mProgressBar2 = (CustomProgressBar) findViewById(R.id.cpb_progresbar2);
        mProgressBar2.setOnAnimationEndListener(new CustomProgressBar.OnAnimationEndListener() {
            @Override
            public void onAnimationEnd() {
                Toast.makeText(ctx,"animation end!",Toast.LENGTH_SHORT).show();
            }
        });
        mProgressBar2.setProgressDesc("剩余");
        mProgressBar2.setMaxProgress(100);
        mProgressBar2.setProgressColor(Color.parseColor("#79aa6b"));
        mProgressBar2.setCurProgress(80,4000);



        mProgressBarMy = (CustomProgressBar) findViewById(R.id.cpb_progresbarMy);
        mProgressBarMy.setOnFinishedListener(new CustomProgressBar.OnFinishedListener() {
            @Override
            public void onFinish() {
                mProgressBarMy.setProgressDesc("已售罄");
                Toast.makeText(ctx,"done!",Toast.LENGTH_SHORT).show();
            }
        });
        num = 90;
        mProgressBarMy.setProgressDesc("已售");
        mProgressBarMy.setMaxProgress(100);
        mProgressBarMy.setProgressColor(Color.parseColor("#F6CB82"));
        mProgressBarMy.setCurProgress(num);



        findViewById(R.id.cpb_btnAdd).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num++;
                mProgressBarMy.upDateCurProgress(num);
            }
        });
    }
}
