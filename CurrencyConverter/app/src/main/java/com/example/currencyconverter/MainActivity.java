package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public  void D2B (View view){
        EditText dolText= (EditText)findViewById(R.id.dolText);
        Double  tk= Double.parseDouble(dolText.getText().toString());
        Double ttk=tk*80;

        Toast.makeText(MainActivity.this,ttk.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
