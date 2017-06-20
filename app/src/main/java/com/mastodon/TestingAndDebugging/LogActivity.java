package com.mastodon.TestingAndDebugging;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.mastodon.R;

// Use the system log to output debug information
// Given a problem description, replicate the failure
// Debug and fix an application crash (uncaught exception)

public class LogActivity extends AppCompatActivity {

    String word = null;
    char[] letters = word.toCharArray();

    String[] names = {"Joe", "Bob", "Lily"};
    private static final String TAG = "LogActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.log_activity);

        Log.e(TAG, "This is error");
        Log.w(TAG, "This is warning");
        Log.i(TAG, "This is info");
        Log.d(TAG, "This is debug");
        Log.v(TAG, "This is verbose");
        Log.wtf(TAG, "What a Terrible Failure!");

        Toast.makeText(getApplicationContext(), names[5], Toast.LENGTH_LONG).show();
    }
}
