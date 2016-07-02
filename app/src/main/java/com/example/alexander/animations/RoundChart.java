package com.example.alexander.animations;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class RoundChart extends View
{
    public RoundChart(Context context, AttributeSet attrs)
    {
        super(context, attrs);
    }

    public RoundChart(Context context)
    {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);

        RectF rectF360 = new RectF(0,0, 240,240);
        Paint greenCircle = new Paint();
        greenCircle.setColor(Color.GREEN);
        canvas.drawArc(rectF360,0,360,true,greenCircle);

        RectF rectF = new RectF(0,0,240,240);
        Paint redCircle = new Paint();
        redCircle.setColor(Color.RED);
        canvas.drawArc(rectF,0,90,true,redCircle);

        Paint whiteCircle = new Paint();
        whiteCircle.setColor(Color.WHITE);
        canvas.drawCircle(120,120,90,whiteCircle);

        Paint darkText = new Paint();
        darkText.setColor(Color.DKGRAY);
        darkText.setTextSize(24);
        canvas.drawText("25%",90,150,darkText);
    }
}
