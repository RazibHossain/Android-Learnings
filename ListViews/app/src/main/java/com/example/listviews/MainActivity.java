package com.example.listviews;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView mylistview=(ListView) findViewById(R.id.mylistview);
        final ArrayList<String> myFamily=new ArrayList<String>(); //creating a arraylist of strings

        myFamily.add("Razib"); //adding elements
        myFamily.add("Mom");
        myFamily.add("Dad");
        myFamily.add("Sister");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String >(this,android.R.layout.simple_list_item_1,myFamily);
                /*creating a array adapter which convert the contents of arraylist to
                  the list view. in parenthesis convert list from myFamilily to simplelistitem1 style to this context
                 */

        mylistview.setAdapter(arrayAdapter);

        mylistview.setOnItemClickListener(new AdapterView.OnItemClickListener() { //function which work on the list view item elements
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*AdapterView ? represent the generic view it can be listview,gridview etc.
                parent is same as muListView which is tabbed
                the view which is actually tabbed on list actually its represent row
                position N id is the same which is tabbed the order number

                *
                */

                Log.i("Person Tabbed", myFamily.get(position));
                Toast.makeText(getApplicationContext(),"Hello " + myFamily.get(position),Toast.LENGTH_LONG).show();

            }
        });

    }
}
