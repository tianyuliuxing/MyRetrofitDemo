package com.example.administrator.myretrofitdemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextWatcher;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    private EditText et;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String nam = "郑州分行/建设路支行";
        nam = nam.replaceAll("/", "\\.");
        Log.e("sss",nam);
        tv = (TextView) findViewById(R.id.tv);
        et = (EditText) findViewById(R.id.et);
        SpaceText spaceText = new SpaceText(et);
        et.addTextChangedListener(spaceText);
        tv.setText(spaceText.getRealStr());

        String time = "1535595263000";

        String times = stampToDate(time);
        String times2 = stampTo(time);
        Log.e("---",times);
        Log.e("---",times2);
        String  value = "data:image/png;base64,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";
        String[] url = value.split(",");
        final String imageUrlBase64 = url[1];
        findViewById(R.id.tv).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bitmap bitmaps = base64ToBitmap(imageUrlBase64);
            }
        });

    }
    public static Bitmap base64ToBitmap(String base64Data) {
        byte[] bytes = Base64.decode(base64Data, Base64.DEFAULT);
        return BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    }
    public static String stampToDate(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }

    public static String stampTo(String s){
        String res;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd");
        long lt = new Long(s);
        Date date = new Date(lt);
        res = simpleDateFormat.format(date);
        return res;
    }



}
