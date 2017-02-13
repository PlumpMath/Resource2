package com.catherine.resource2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // You can's just use setContentView(@LayoutRes int layoutResID), you must use setContentView(View view)
        // setContentView(R.layout.activity_main);
        setContentView(View.inflate(getApplicationContext(), R.layout.activity_main, null));
    }
}
