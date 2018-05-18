//package com.example.ragnar.prototypingappv300.views;
//
//import android.content.Context;
//import android.graphics.Canvas;
//import android.graphics.Color;
//import android.graphics.Paint;
//import android.graphics.Rect;
//import android.support.annotation.Nullable;
//import android.util.AttributeSet;
//
//import java.util.Random;
//
///**
// * Created by YimingYang on 11/27/17.
// */
//
//public class CustomView {
//    private static final int SQUARE_SIZE = 100;
//
//    private Rect mRectSquare;
//    private Paint mPaintSquare;
//    Paint paint_black = new Paint();
//    Paint paint_red = new Paint();
//    Paint paint_green = new Paint();
//    Paint paint_blue = new Paint();
//
//    public CustomView(Context context) {
//        super(context);
//        init(null);
//    }
//
//    public CustomView(Context context, @Nullable AttributeSet attrs) {
//        super(context, attrs);
//        init(attrs);
//    }
//
//    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
//        super(context, attrs, defStyleAttr);
//        init(attrs);
//    }
//
//    public CustomView(Context context, @Nullable AttributeSet attrs, int defStyleAttr, int defStyleRes) {
//        super(context, attrs, defStyleAttr, defStyleRes);
//        init(attrs);
//    }
//
//
//    private void init (@Nullable AttributeSet set){
//        mRectSquare = new Rect();
//        mPaintSquare = new Paint(Paint.ANTI_ALIAS_FLAG);
//        mPaintSquare.setColor(Color.GREEN);
//    }
//    public void read_input(){
//
//    }
//    public void swapColor(){
//        // missing input file
//
//        Random ran = new Random();
//        int x = ran.nextInt(7);
//        switch (x){
//            case 1: mPaintSquare.setColor(Color.GREEN); break;
//            case 2: mPaintSquare.setColor(Color.RED); break;
//            case 3: mPaintSquare.setColor(Color.YELLOW); break;
//            case 4: mPaintSquare.setColor(Color.BLUE); break;
//            case 5: mPaintSquare.setColor(Color.CYAN); break;
//            case 6: mPaintSquare.setColor(Color.MAGENTA); break;
//        }
////        mPaintSquare.setColor(mPaintSquare.getColor() == Color.GREEN ? Color.RED:Color.GREEN);
////        invalidate();
////        postInvalidate();
//    }
//
//    @Override
//    protected void onDraw(Canvas canvas) {
//        // four corners black
////        Rect rect_upleft = new Rect();
////        rect_upleft.left = 0;
////        rect_upleft.top = 0;
////        rect_upleft.right = rect_upleft.left + 40;
////        rect_upleft.bottom = rect_upleft.top + 40;
////
////        Rect rect_upright = new Rect();
////        rect_upright.left = 1040;
////        rect_upright.top = 0;
////        rect_upright.right = rect_upright.left + 40;
////        rect_upright.bottom = rect_upright.top + 40;
////
////        Rect rect_bottomleft = new Rect();
////        rect_bottomleft.left = 0;
////        rect_bottomleft.top = 1040;
////        rect_bottomleft.right = rect_bottomleft.left + 40;
////        rect_bottomleft.bottom = rect_bottomleft.top + 40;
////
////        Rect rect_bottomright = new Rect();
////        rect_bottomright.left = 1040;
////        rect_bottomright.top = 1040;
////        rect_bottomright.right = rect_bottomright.left + 40;
////        rect_bottomright.bottom = rect_bottomright.top + 40;
//
//
//        paint_black.setColor(Color.BLACK);
//        paint_red.setColor(Color.RED);
//        paint_green.setColor(Color.GREEN);
//        paint_blue.setColor(Color.BLUE);
//        paint_black.setStrokeWidth(10);
//        paint_black.setStyle(Paint.Style.STROKE);
////        canvas.drawRect(rect_upleft,paint_black);
////        canvas.drawRect(rect_upright,paint_black);
////        canvas.drawRect(rect_bottomleft,paint_black);
////        canvas.drawRect(rect_bottomright,paint_black);
//
//
//        // stroke black outter
////        canvas.drawRect(0,0,40,40,paint_black);
////        canvas.drawRect(1040,0,1080,40,paint_black);
////        canvas.drawRect(0,1040,40,1080,paint_black);
//
////        canvas.drawRect(10,10,30,30,paint_red);
////        canvas.drawRect(1050,10,1070,30,paint_green);
////        canvas.drawRect(10,1050,30,1070,paint_blue);
//
//        canvas.drawRect(0,0,50,50,paint_red);
//        canvas.drawRect(1050,0,1100,50,paint_green);
//        canvas.drawRect(50,1050,50,1100,paint_blue);
////        super.onDraw(canvas);
////        canvas.drawColor(Color.RED);
////        Rect rect = new Rect();
//        mRectSquare.left = 40;
//        mRectSquare.top = 40;
//        mRectSquare.right = 40;
//        mRectSquare.bottom = 40;
//
////        canvas.drawRect(mRectSquare, mPaintSquare);
//
//        for (int i = 0; i < 100; i++){
//            if (i % 10 == 0){
//                mRectSquare.top = mRectSquare.bottom;
//                mRectSquare.left = 40;
//            }
//            else{
//                mRectSquare.left = mRectSquare.right;
//            }
//
//            mRectSquare.right = mRectSquare.left + SQUARE_SIZE;
//            mRectSquare.bottom = mRectSquare.top + SQUARE_SIZE;
//            swapColor();
//            canvas.drawRect(mRectSquare, mPaintSquare);
//
//        }
//
////        Paint paint = new Paint();
//
//    }
//}
