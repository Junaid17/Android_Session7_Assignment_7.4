package com.example.jmush.android_session7_assignment_74;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText etUername,etPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin= (Button) findViewById(R.id.btnSave);
        etPassword= (EditText) findViewById(R.id.etPassword);
        etUername= (EditText) findViewById(R.id.etUsername);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username=etUername.getText().toString();
                String Password=etPassword.getText().toString();
                if(username.equalsIgnoreCase("Junaid") && Password.equalsIgnoreCase("Junaid")){
                    Intent intent=new Intent(MainActivity.this,SecondActivity.class);
                    intent.putExtra("user",username);
                    startActivity(intent);
                }
                else {
                    Toast.makeText(MainActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
