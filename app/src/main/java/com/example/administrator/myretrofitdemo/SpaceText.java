package com.example.administrator.myretrofitdemo;

import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;

public class SpaceText implements TextWatcher {
    private String TAG = "SpaceText";
    private EditText etSpace;
    int beforeTextLength = 0;
    int onTextLength = 0;
    private  String realStr = "";

    public SpaceText(EditText etSpace) {
        super();
        this.etSpace = etSpace;
    }

    public String removeAllSpace(String str) {
        String tmpstr = str.replace(" ", "");
        return tmpstr;
    }
    public  String getRealStr() {
        return realStr;
    }

    @Override
    public void afterTextChanged(Editable s) {
        // TODO Auto-generated method stub
        String str = etSpace.getText().toString();
        realStr = removeAllSpace(str);
        Log.e(TAG, "mEditText = " + removeAllSpace(str) + ".");
        onTextLength = str.length();
        Log.e(TAG, "beforeLen = " + beforeTextLength + "afterLen = " + onTextLength);
        if (onTextLength > beforeTextLength) {
            if (str.length() == 5 || str.length() == 10 || str.length() == 15 || str.length() == 20) {
                etSpace.setText(new StringBuffer(str).insert(
                        str.length() - 1, " ").toString());
                etSpace.setSelection(etSpace.getText()
                        .length());
                Log.e(TAG, "selection = " + etSpace.getText()
                        .length());
            }
        } else {
            if (str.startsWith(" ")) {
                etSpace.setText(new StringBuffer(str).delete(
                        onTextLength - 1, onTextLength).toString());
                etSpace.setSelection(etSpace.getText()
                        .length());
                Log.e(TAG, "else start space");
            }
        }
    }


    @Override
    public void beforeTextChanged(CharSequence s, int start, int count,
                                  int after) {
        // TODO Auto-generated method stub
        beforeTextLength = s.length();

    }


    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        // TODO Auto-generated method stub

    }


}

