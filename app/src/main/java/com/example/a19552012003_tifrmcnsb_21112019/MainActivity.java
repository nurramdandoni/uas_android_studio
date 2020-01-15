package com.example.a19552012003_tifrmcnsb_21112019;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = (EditText)findViewById(R.id.str_username);
        final EditText password = (EditText)findViewById(R.id.str_password);

        Button b_login = (Button)findViewById(R.id.btn_login);
        TextView signUp = (TextView)findViewById(R.id.text_question);

        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(username.getText().length()==0){
                    Toast.makeText(getApplicationContext(),"Username tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }else if(password.getText().length()==0){
                    Toast.makeText(getApplicationContext(),"Password tidak boleh Kosong",Toast.LENGTH_LONG).show();
                }else if(username.getText().toString().equals("admin") && password.getText().toString().equals("admin") ){
                    Intent i = new Intent(MainActivity.this,HomeActivity.class);
                    startActivity(i);
                }else{
                    Toast.makeText(getApplicationContext(),"Login Gagal",Toast.LENGTH_LONG).show();
                }
            }
        });

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(j);
            }
        });


    }
}
