package com.etwge.customui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author LiuBei
 * @date 2022/1/21 11:38
 * @describe
 */
public class CustomUi extends View {
    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

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
        // 点的形状可通过paint.setStrokeCap(cap)：ROUND 圆点；SQUARE或BUTT 方点
        // mPaint.setStrokeWidth(20);
        // mPaint.setStrokeCap(Paint.Cap.BUTT);
        // canvas.drawPoint(50,50,mPaint);

        //7.drawPoints(float[] pts,int offset,int count,Paint paint)
        //  drawPoints(float[] pts,Paint paint)画点 批量
        //  pts:这个数组是点的坐标，每两个成一对；offset 跳过数据的前几个数开始记录坐标；count表示一共要绘制几个点
        // mPaint.setStrokeWidth(20);
        // mPaint.setStrokeCap(Paint.Cap.BUTT);
        // float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100};
        // canvas.drawPoints(points, 2, 8, mPaint);
        // 8.绘制椭圆
        // drawOval(canvas);

        // 9.绘制线段
        // drawLine(canvas);

        // 10.批量画线
        // drawLines(canvas);

        // 11.圆角矩形
        // drawRoundRect(canvas);

        //12.绘制扇形或圆弧
        // drawArc(canvas);

        // 13.画自定义图形
        drawPath(canvas);

        // 14:drawBitmap 画Bitmap
        drawBitmap(canvas);
    }

    /**
     * 绘制Bitmap对象，也就是把这个Bitmap中的像素内容贴过来
     * drawBitmap(Bitmap bitmap,float left,float top,Paint paint)
     * left top 是bitmap绘制到的坐标
     */
    private void drawBitmap(Canvas canvas) {

    }

    /**
     * drawPath()绘制自定义图形 两类方法：一类直接描述路径 二类：辅助的设置或计算
     *
     * @param canvas
     */
    private void drawPath(Canvas canvas) {
        /**
         * 第一类：直接描述路径：两组：添加子图形和画线(直线或曲线)
         * 第一组：addXxx() -- 添加子图形
         * addCirCle(float x,float y,float radius,Direction dir) 添加圆
         * x y radius是圆的基本信息 最后一个参数dir是画圆的路径的方向
         * 路径的方向有两种：顺时针(cw clockwise)和逆时针(ccw counter-clockwise)，普通情况使用哪个没有区别。
         * 在需要填充图形(Paint.Style为FULL或FILL_AND_STROKE),并且图形出现相交时用于判断填充范围
         */
        // Path path = new Path();
        // path.addCircle(300,300,200,Path.Direction.CW);
        // canvas.drawPath(path,mPaint);
        /**
         * 第二组：xxxTo() --画线(直线或曲线)
         * 与第一组的区别是 第一组添加的是完整的封闭图形(除了addPath()),而这一组添加的只是一条线
         * lineTo(float x,float y)/rLine(float x,float y)画直线
         * lineTo():从当前位置向目标画一条线
         * rLineTo():
         */
        // Path path = new Path();
        // mPaint.setStyle(Paint.Style.STROKE);
        // //由当前位置(0,0)向(100,100)画一条线
        // path.lineTo(100,100);
        // // 由当前位置(100,100)向其相对位置(100,0)画一条线

        // path.rLineTo(100,0);
        // canvas.drawPath(path,mPaint);

        /**
         * 画二次贝塞尔曲线
         * 起点是当前位置 参数中的x1,y1和x2,y2分别是控制点和终点的坐标
         * quadTo(float x1,float x2,float y1,float y2) 绝对位置
         * rQuadTo(float x1,float x2,float y1,float y2) 相对位置
         * 画三次贝塞尔曲线
         * cubicTo(float x1, float y1, float x2, float y2, float x3, float y3)
         * rCubicTo(float x1, float y1, float x2, float y2, float x3, float y3)
         */
        // Path path = new Path();
        // // path.quadTo(80,80,100,200);
        // path.cubicTo(50, 50, 200, 0, 250, 150);
        // canvas.drawPath(path, mPaint);

        /**
         * 移动到目标位置
         * moveTo(float x,float y)/rMoveTo(float x,float y)
         * 不论是直线还是贝塞尔曲线都是以当前的位置为起点，而不能指定位置；
         * 但是你可以通过moveTo(x,y) rMoveTo()来改变当前位置从而间接设置这些方法的起点
         * moveTo(x,y) 虽然不添加图形 但它会设置图形的起点 所以是非常重要的方法
         */
        // Path path = new Path();
        // mPaint.setStyle(Paint.Style.STROKE);
        // // path.lineTo(100,100);
        // path.moveTo(200,100);
        // path.lineTo(200,10);
        // canvas.drawPath(path,mPaint);

        /**
         * arcTo()和addArc()
         * 他们也是用来画线的 但并不使用当前位置作为弧线的起点
         * arcTo(RectF oval, float startAngle, float sweepAngle, boolean forceMoveTo)
         * arcTo(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean forceMoveTo)
         * arcTo(RectF oval, float startAngle, float sweepAngle) 画弧形
         * 这个方法和Canvas.drawArc()比起来，少了一个参数useCenter,而多了一个参数forceMoveTo
         * 少了useCenter,是因为arcTo()只是用来画弧形而不是扇形，所以不需要useCenter();
         * 而多出来的这个forceMoveTo参数的意思是，绘制要抬笔移动过去 还是直接拖笔过去 区别在于是否留下移动痕迹
         * addArc()是forceMoveTo = true 的简化版
         */
        // mPaint.setStyle(Paint.Style.STROKE);
        // Path path = new Path();
        // path.lineTo(100, 100);
        // path.arcTo(0, 100, 300, 300, -90, 350, false);
        // canvas.drawPath(path, mPaint);

        /**
         * close()封闭当前子图形
         * 它的作用是把当前的子图形封闭，即由当前位置向子图像的起点画一条直线
         */
        // mPaint.setStyle(Paint.Style.FILL);
        // Path path = new Path();
        // path.moveTo(100, 100);
        // path.lineTo(200, 100);
        // path.lineTo(150, 150);
        // path.close();
        // canvas.drawPath(path, mPaint);

        /**
         * Path方法第二类：辅助的设置或计算
         * 这类方法的使用场景比较少，只讲其中一个方法：setFillType(FillType fillType)
         * Path.setFillType(Path.FillType ft)设置填充方式
         * FillType取值有四个：EVEN_ODD WINDING INVERSE_EVEN_ODD INVERSE_WINDING
         * 带INVERSE_前缀的是前两个的反版本
         * WINDING是全填充 EVEN_ODD是交叉填充
         * EVEN_ODD 奇偶原则
         * 对于平面中的任意一点 随意向任意方向射出一条射线
         * 如果和图形相交的次数是奇数：则这点被认为在图形内部需要被涂色
         * 如果和图形相交的次数是偶数：则认为在图形的外部 是不被涂色的区域
         * WINDING 首先它需要你图形中的所有线条都是有绘制方向的
         * 同样是从平面中的点向任意方向射出一条射线，但计算规则不一样：以0为初始值，遇到每个顺时针＋1
         * 遇到每个逆时针－1 最终把所有的交点都算上 如果得到的结果不是0 则认为这个点在图形的内部是涂色的区域
         * 如果结果是0 则这个点在图形的外部是不被涂色的区域
         * 图形的方向：
         * 对于添加子图形类方法(如：Path.addCircle() Path.addRect())的方向，由方法的dir参数来控制
         */

    }

    /**
     * 12.绘制扇形或圆弧
     * drawArc(float left,float top,float right,float bottom,float startAngle,float sweepAngle,boolean useCenter,Paint paint)
     * drawArc()是使用一个椭圆来描述弧形的；left,top,right,bottom，描述的是这个弧形所在的椭圆
     * startAngle是弧度的起始角度(X轴的正向,即正右的方向,是0度的位置，顺时针是正角度，逆时针是负角度)
     * sweepAngle是弧形划过的角度
     * useCenter表示是否连接到圆心，如果不连接到圆心就是弧形，如果连接到圆心就是扇形
     *
     * @param canvas
     */
    private void drawArc(Canvas canvas) {
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, mPaint);
        canvas.drawArc(200, 100, 800, 500, 20, 140, false, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(200, 100, 800, 500, -120, -40, false, mPaint);
    }


    /**
     * 11.drawRoundRect(float left,float top,float right,float bottom,float rx,float ry,Paint paint)
     *
     * @param canvas
     */
    private void drawRoundRect(Canvas canvas) {
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRoundRect(100, 250, 300, 350, 50, 50, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawRoundRect(100, 100, 300, 200, 50, 50, mPaint);
    }

    /**
     * 10.drawLines(float[] pts,int offset,int count,Paint paint)
     * drawLines(float[] pts,Paint paint)
     *
     * @param canvas
     */
    private void drawLines(Canvas canvas) {
        float[] points = {20, 20, 200, 20, 110, 20, 110, 200, 20, 200, 200, 200,
                220, 20, 420, 20, 230, 30, 230, 200, 220, 200, 420, 200, 410, 200, 410, 10};
        mPaint.setStrokeWidth(20);
        canvas.drawLines(points, mPaint);

    }

    /**
     * 9.绘制线段drawLine(float startX,float startY,float stopX,float stopY,Paint paint)
     * startX startY stopX stopY分别是线的起点和终点坐标
     *
     * @param canvas
     */
    private void drawLine(Canvas canvas) {
        mPaint.setStrokeWidth(20);
        canvas.drawLine(50, 50, 200, 200, mPaint);
        mPaint.setStrokeWidth(30);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(50, 50, mPaint);
        mPaint.setStrokeCap(Paint.Cap.BUTT);
        mPaint.setStrokeWidth(30);
        canvas.drawPoint(200, 200, mPaint);
    }

    /**
     * 8.绘制椭圆
     * drawOval(float left,float top,float right,float bottom,Paint paint)
     * 只能绘制横着或者竖着的椭圆
     */
    private void drawOval(Canvas canvas) {
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawOval(50, 50, 200, 100, mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawOval(50, 200, 300, 300, mPaint);
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
