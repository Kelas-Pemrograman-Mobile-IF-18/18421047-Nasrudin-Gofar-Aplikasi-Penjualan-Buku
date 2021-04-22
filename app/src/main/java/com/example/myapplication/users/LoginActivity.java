package com.example.myapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.admin.HomeAdmin;
import com.ornach.nobobutton.NoboButton;

public class LoginActivity extends AppCompatActivity {

    Button btnregistrasi;
    NoboButton btnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        getSupportActionBar().hide();

        btnregistrasi = (Button) findViewById(R.id.registrasibtn);
        btnlogin = (NoboButton) findViewById(R.id.loginbtn);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, HomeAdmin.class);
                startActivity(i);
                finish();
            }
        });

        btnregistrasi.setOnClickListener((v) -> {
            Intent i = new Intent(LoginActivity.this,Registrasi.class);
            startActivity(i);
            finish();
        });

    }
}