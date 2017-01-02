package com.example.administrator.intentstudy;

import android.app.Activity;
import android.os.Bundle;

public class SecondActivity extends Activity {
    static final String ACT = "com.example.administrator.intentstudy.SecondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
}
