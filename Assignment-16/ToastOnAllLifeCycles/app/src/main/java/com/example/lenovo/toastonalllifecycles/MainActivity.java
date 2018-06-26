package com.example.lenovo.toastonalllifecycles;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "App Created", dur);
        t.show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "App Paused", dur);
        t.show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "App Restarted", dur);
        t.show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "App Resumed", dur);
        t.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "App Started", dur);
        t.show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "App Stopped", dur);
        t.show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        int dur = Toast.LENGTH_SHORT;
        Toast t = Toast.makeText(getApplicationContext(), "App Destroyed", dur);
        t.show();
    }
}
