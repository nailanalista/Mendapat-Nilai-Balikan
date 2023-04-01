package com.example.nilaibalik;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView name, number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        name =  findViewById(R.id.getNama);
        number =  findViewById(R.id.getNim);

        Intent intent = getIntent();
        String nameS = intent.getStringExtra("name");
        String numberS = intent.getStringExtra("number");

        name.setText(nameS);
        number.setText(numberS);
    }
}