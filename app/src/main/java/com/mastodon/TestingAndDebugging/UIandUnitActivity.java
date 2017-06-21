package com.mastodon.TestingAndDebugging;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.mastodon.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import jp.wasabeef.blurry.Blurry;

//Write and execute a local JVM unit test
//Write and execute a device UI test

public class UIandUnitActivity extends AppCompatActivity {

    @BindView(R.id.changeText) Button changeText_btn;
    @BindView(R.id.textView)  TextView text_change;
    @BindView(R.id.inputField) EditText input_et;
    @BindView(R.id.switchActivity) Button switch_button;
    @BindView(R.id.teste) ImageView teste_sds;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ui_unit);
        ButterKnife.bind(this);



        changeText_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                text_change.setText(input_et.getText().toString());

            }
        });

        switch_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(UIandUnitActivity.this, LogActivity.class);
                startActivity(intent);
            }
        });

    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public static float convertFahrenheitToCelsius(float fahrenheit) {
        return ((fahrenheit - 32) * 5 / 9);
    }

    public int getStatusBarHeight() {
        int result = 0;
        int resourceId = getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (resourceId > 0) {
            result = getResources().getDimensionPixelSize(resourceId);
        }
        return result;
    }

    public static float convertCelsiusToFahrenheit(float celsius) {
        return ((celsius * 9) / 5) + 32;
    }
}
