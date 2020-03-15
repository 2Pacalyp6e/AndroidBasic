package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.widget.TextView;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        setColorOfTextView();
    }

    private void initViews(){
        textView = findViewById(R.id.hellotextView);
    }

    private void setColorOfTextView(){

        textView.setTextColor(ContextCompat.getColor(getApplicationContext(), R.color.colorPrimary));
    }
}
