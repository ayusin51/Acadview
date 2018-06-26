package com.example.lenovo.demo;

import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    /*Button btn = (Button) findViewById(R.id.button);*/

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {

               // Toast t = new Toast(getApplicationContext());
            }
        });*/
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("onPause", "Paused");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("onRestart", "Restarted");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("OnStart", "Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("onResume", "Resumed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("onDestroy", "Destroyed");
    }

}
