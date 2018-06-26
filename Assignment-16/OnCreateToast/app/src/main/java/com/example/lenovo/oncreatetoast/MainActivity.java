package com.example.lenovo.oncreatetoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       Toast t =  Toast.makeText(getApplicationContext(), "App Created!!", Toast.LENGTH_LONG);
       t.show();
       t.setGravity(Gravity.CENTER, 0, 0);    }
}
