package com.example.esercitazione_0712;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String stati_europei[] = {
            "Italia",
            "Francia",
            "Germania",
            "Olanda",
    };

    ListView lvstati;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvstati = (ListView) findViewById(R.id.listView);
        ArrayAdapter<String> aaStati = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.textView, stati_europei);
        lvstati.setAdapter(aaStati);
    }
}