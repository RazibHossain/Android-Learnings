package com.example.demoprantik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button client=(Button) findViewById(R.id.client);
        Button worker=(Button) findViewById(R.id.worker);

        client.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent clientIntent=new Intent(HomeActivity.this,Client.class);
                startActivity(clientIntent);

                //openClientActivity();
            }
        });
        worker.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent workerIntent=new Intent(HomeActivity.this,Worker.class);
                startActivity(workerIntent);

                //openClientActivity();
            }
        });
    }
}
