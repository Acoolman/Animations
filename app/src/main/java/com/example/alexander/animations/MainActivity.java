package com.example.alexander.animations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, Animation.AnimationListener {

    Animation animationFadeOut;
    RoundChart roundChart;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        roundChart = (RoundChart) findViewById(R.id.rcDiagram);
        //Animation animationFadeIn = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        animationFadeOut = AnimationUtils.loadAnimation(this,R.anim.fade_out);
        roundChart.setAnimation(animationFadeOut);
        animationFadeOut.setAnimationListener(this);
    }

    @Override
    public void onClick(View view) {

    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation)
    {
        if(animation == animationFadeOut)
        {
            roundChart.setVisibility(View.INVISIBLE);
        }
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
