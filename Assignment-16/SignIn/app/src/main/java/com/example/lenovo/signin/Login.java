package com.example.lenovo.signin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button btn = (Button) findViewById(R.id.button);








        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Bundle extras = getIntent().getExtras();

                String name = extras.getString("name");
                String userid = extras.getString("userid");
                String password = extras.getString("password");
                String mobile = extras.getString("mobile");

                EditText id = (EditText) findViewById(R.id.userid);
                EditText pwd = (EditText) findViewById(R.id.password);
                TextView message = (TextView) findViewById(R.id.message);
                if(id.getText().toString().compareTo(userid) == 0 &&
                        pwd.getText().toString().compareTo(password) == 0) {

                    message.setText("");
                    Intent intent = new Intent(getApplicationContext(), Final.class);
                    intent.putExtra("name", name);
                    startActivity(intent);
                }else {

                    message.setText("Invalid Details....");
                }
            }
        });
    }
}
