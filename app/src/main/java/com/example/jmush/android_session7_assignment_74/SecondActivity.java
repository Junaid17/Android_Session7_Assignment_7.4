package com.example.jmush.android_session7_assignment_74;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by jmush on 8/23/17.
 */
public class SecondActivity extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView= (TextView) findViewById(R.id.textview);

        Intent i= getIntent();
        String value=i.getStringExtra("user");
        textView.setText("Welcome "+value);

    }
}
