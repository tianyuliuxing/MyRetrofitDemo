package com.example.administrator.myretrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String nam = "郑州分行/建设路支行";
        nam = nam.replaceAll("/", "\\.");
        Log.e("sss",nam);
        et = (EditText) findViewById(R.id.et);
        TextWatcher SpaceText = new SpaceText(et);
        et.addTextChangedListener(SpaceText);

    }
}
