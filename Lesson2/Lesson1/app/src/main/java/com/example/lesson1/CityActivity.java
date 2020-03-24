package com.example.lesson1;


import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.app.Activity;


public class CityActivity extends Activity {
         final String[] Cities = new String[]{
           "Алматы", "Москва","Санкт - Петербург","Новосибирск","Шымкент", "Ванкувер", "Нью - Йорк", "Париж"
    };

    AutoCompleteTextView AutoC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city);

        AutoC = findViewById(R.id.AutoC);
        AutoC.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, Cities));
    }
}