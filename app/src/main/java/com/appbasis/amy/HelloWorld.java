package com.appbasis.amy;

/**
 * Created by nhajime on 2015/09/24.
 * Main Activity定義
 */
import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

//HelloWorld
public class HelloWorld extends Activity {
    //アクティビティ起動時に呼ばれる
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(new HelloView(this));
    }
}
