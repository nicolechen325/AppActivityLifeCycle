package com.lifecycle.launchmode.life;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.lifecycle.launchmode.TagLog;
import com.lifecycle.launchmode.R;

//生命周期-Activity-B
public class BActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TagLog.TAG, getClass().getSimpleName() + " onCreate");
        setContentView(R.layout.activity_b);

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TagLog.TAG, getClass().getSimpleName() + " onRestart");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TagLog.TAG, getClass().getSimpleName() + " onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TagLog.TAG, getClass().getSimpleName() + " onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TagLog.TAG, getClass().getSimpleName() + " onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TagLog.TAG, getClass().getSimpleName() + " onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TagLog.TAG, getClass().getSimpleName() + " onDestroy");
    }

}