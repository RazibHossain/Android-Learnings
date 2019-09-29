package com.example.demoprantik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static int SPLASH_TIME_OUT=2000;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent HomeIntent=new Intent(MainActivity.this,HomeActivity.class);
                startActivity(HomeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);


    }
  /*  public void openClientActivity(){
        Intent clientIntent=new Intent(MainActivity.this,Client.class);
        startActivity(clientIntent);
    }*/
}
