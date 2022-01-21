package com.etwge.customui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author LiuBei
 * @date 2022/1/21 11:38
 * @describe
 */
public class CustomUi extends View {
    Paint mPaint = new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        // 1.设置背景色
        // canvas.drawColor(Color.WHITE);

        // 2.画一个圆 x轴 300 Y轴 300 半径 200
        // canvas.drawCircle(300, 300, 200, mPaint);

        // 3.画一个红色的实心圆
        // mPaint.setColor(Color.RED);
        // canvas.drawCircle(300, 300, 200, mPaint);

        // 4.画一个空心圆
        // Style具体来说三种：FILL(默认 填充模式)，STROKE(画线模式)，FILL_AND_STROKE(既画线又填充)
        // Paint.setStrokeWidth() 在STROKE和FILL_AND_STROKE下来设置线条宽度
        // new Paint(Paint.ANTI_ALIAS_FLAG) 或 Paint.setAntiAlias(boolean aa) 动态开启抗锯齿
        // mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        // mPaint.setStyle(Paint.Style.STROKE);
        // mPaint.setStrokeWidth(50);
        // canvas.drawCircle(300, 300, 200, mPaint);

        // 5.drawRect(float left,float top,float right,float bottom,Paint paint) 画矩形
        // mPaint.setStyle(Paint.Style.FILL);
        // mPaint.setStyle(Paint.Style.STROKE);
        // canvas.drawRect(100, 200, 200, 100, mPaint);

        // 6.drawPoint(float x,float y,Paint paint)画点
        // x y是点的坐标点
        // 点的大小可以通过paint.setStrokeWidth(width)来设置
        // 点的形状可通过paint.setStrokeCap(cap)来设置



    }

    public CustomUi(Context context) {
        super(context);
    }

    public CustomUi(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomUi(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public CustomUi(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}
