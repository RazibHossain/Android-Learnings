package com.example.usernamepassword;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    public void SubmitTask(View view){
        EditText usernameEditText =(EditText)findViewById(R.id.usernameEditText);
        EditText passwordEditText=(EditText)findViewById(R.id.passwordEditText);
        Log.i("Username", usernameEditText.getText().toString());
        Log.i("Password",passwordEditText.getText().toString());
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
