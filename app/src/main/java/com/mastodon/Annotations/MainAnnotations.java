package com.mastodon.Annotations;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.mastodon.R;

import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

@EActivity(R.layout.activity_main_annotations)
public class MainAnnotations extends AppCompatActivity {

    @ViewById(R.id.name)
    EditText name;

    @ViewById(R.id.address)
    EditText address;

    @ViewById(R.id.numberAddress)
    EditText numberAddress;

    @ViewById(R.id.telephone)
    EditText telephone;

    @ViewById(R.id.birthday)
    TextView birthday;

    @ViewById(R.id.saveButton)
    Button saveButton;

    @Click
    public void saveButton() {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;

        String my_name = name.getText().toString();
        Toast toast = Toast.makeText(context, my_name, duration);
        toast.show();
    }
}