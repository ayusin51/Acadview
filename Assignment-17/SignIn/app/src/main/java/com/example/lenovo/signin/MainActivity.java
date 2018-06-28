package com.example.lenovo.signin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                TextView message = (TextView) findViewById(R.id.message);
                EditText name = (EditText) findViewById(R.id.name);
                EditText userid = (EditText) findViewById(R.id.userid);
                EditText password = (EditText) findViewById(R.id.password);
                EditText mobile = (EditText) findViewById(R.id.mobile);

                if(name.getText().toString().compareTo("") != 0 &&
                        userid.getText().toString().compareTo("") != 0 &&
                        password.getText().toString().compareTo("") != 0 &&
                        mobile.getText().toString().compareTo("") != 0) {

                    message.setText("");
                    Intent intent = new Intent(getApplicationContext(), Login.class);
                    intent.putExtra("Name", name.getText());
                    intent.putExtra("Name", userid.getText());
                    intent.putExtra("Name", password.getText());
                    intent.putExtra("Name", mobile.getText());
                    startActivity(intent);



                }else {

                   message.setText("Invalid Details...");
                }
            }
        });
    }
}
