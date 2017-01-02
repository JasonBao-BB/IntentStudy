package com.example.administrator.intentstudy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import static android.content.Intent.ACTION_VIEW;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.goSecondActivity).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.ACT);
                startActivity(intent);
            }
        });
    }
}
