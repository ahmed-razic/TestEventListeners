package com.example.android.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView toNumbers = findViewById(R.id.toNumbers);
        toNumbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openNumbers = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(openNumbers);
            }
        });
    }
}






