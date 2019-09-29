package com.example.demoprantik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Worker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker);

        Button login=(Button) findViewById(R.id.login);
        Button signup=(Button) findViewById(R.id.signup);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent=new Intent(Worker.this,Login.class);
                startActivity(loginIntent);

                //openClientActivity();
            }
        });
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent singupIntent=new Intent(Worker.this,Signup.class);
                startActivity(singupIntent);

                //openClientActivity();
            }
        });







    }
}
