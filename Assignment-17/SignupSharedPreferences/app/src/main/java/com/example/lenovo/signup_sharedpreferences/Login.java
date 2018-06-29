package com.example.lenovo.signup_sharedpreferences;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        final SharedPreferences sharedPreferences = this.getSharedPreferences("prefs", Context.MODE_PRIVATE);

        Button btn = findViewById(R.id.button);
        final TextView message = (TextView) findViewById(R.id.message);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText userid = findViewById(R.id.userid);
                EditText password = findViewById(R.id.password);
                String password_actual = sharedPreferences.getString(userid.getText().toString(), "");

                //Toast.makeText(getApplicationContext(), password.getText().toString() + " -> " + password_actual, Toast.LENGTH_SHORT).show();

                if(password.getText().toString().compareTo(password_actual) == 0) {

                    Intent intent = new Intent(getApplicationContext(), Final.class);
                    intent.putExtra("id", userid.getText().toString());
                    userid.setText("");
                    password.setText("");
                    startActivity(intent);
                }else {
                    message.setText("Invalid Details");
                }
            }
        });
       // sharedPreferences.getString(userid);
    }
}
