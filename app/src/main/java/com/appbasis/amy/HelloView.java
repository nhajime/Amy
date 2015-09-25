package com.appbasis.amy;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by nhajime on 2015/09/24.
 * View定義
 */
public class HelloView extends View {
    //コンストラクタ
    public HelloView(Context context){
        super(context);
        setBackgroundColor(Color.WHITE);
    }

    //描画
    @Override
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        paint.setTextSize(48);
        canvas.drawText("Hello World!",0,48,paint);
    }
}
