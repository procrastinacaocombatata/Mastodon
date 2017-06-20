package com.mastodon.TestingAndDebugging;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.mastodon.R;

//Debug and fix an activity lifecycle issue

//When app starts: onCreate onStart onResume
//When home button clicked: onPause onStop
//On reopening app: onRestart onStart onResume
//When back button clicked: onPause onStop onDestroy

public class LifecycleActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_activity);
        Log.i(TAG,"On Create");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG,"On Start");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG,"On Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG,"On Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG,"On Stop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG,"On Restart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG,"On Destroy");
    }
}
