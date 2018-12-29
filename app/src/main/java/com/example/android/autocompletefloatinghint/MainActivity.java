package com.example.android.autocompletefloatinghint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView etfirstname,etlastname;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etfirstname=(AutoCompleteTextView) findViewById(R.id.textView);
        String [] names={"Tanya","Jai","Amitesh","Elements","Bello","Shaswat","John"};
        ArrayAdapter<String> adapter=
                new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,names);
        etfirstname.setThreshold(1);
        etfirstname.setAdapter(adapter);

        etlastname=(AutoCompleteTextView) findViewById(R.id.textView1);
        String [] names1={"Tanya","Jai","Amitesh","Elements","Bello","Shaswat","John"};
        ArrayAdapter<String> adapter1=
                new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,names1);
        etlastname.setThreshold(1);
        etlastname.setAdapter(adapter1);

    }
}
