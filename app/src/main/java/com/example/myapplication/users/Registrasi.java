package com.example.myapplication.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.admin.HomeAdmin;
import com.ornach.nobobutton.NoboButton;

public class Registrasi extends AppCompatActivity {

    Button btnnregistrasi;
    NoboButton btnnlogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrasi);

        getSupportActionBar().hide();

        btnnregistrasi = (Button) findViewById(R.id.registrasibtnn);
        btnnlogin = (NoboButton) findViewById(R.id.loginbtnn);

        btnnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Registrasi.this, HomeAdmin.class);
                startActivity(i);
                finish();
            }
        });

        btnnregistrasi.setOnClickListener((v) -> {
            Intent i = new Intent(Registrasi.this,Registrasi.class);
            startActivity(i);
            finish();
        });
    }
}