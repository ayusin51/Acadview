package com.example.lenovo.signin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Final extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final);

        Bundle extras = getIntent().getExtras();
        if(extras != null) {
            String name = extras.getString("name");
            TextView show = (TextView) findViewById(R.id.show);
            show.setText("Welcome " + name + "!!");
        }
    }
}
