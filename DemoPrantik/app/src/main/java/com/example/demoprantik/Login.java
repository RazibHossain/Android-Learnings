package com.example.demoprantik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button enterhome=(Button) findViewById(R.id.enterhome);

        enterhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent enterhomeIntent=new Intent(Login.this,Homepage.class);
                startActivity(enterhomeIntent);


            }
        });
    }
}
