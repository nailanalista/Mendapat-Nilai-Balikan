package com.example.nilaibalik;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText name, number;
    Button btn_nilaibalik;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.nameET);
        number = findViewById(R.id.numberET);
        btn_nilaibalik = findViewById(R.id.btn_nilaibalik);

        btn_nilaibalik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nameS = name.getText().toString();
                String numberS = number.getText().toString();

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("name", nameS);
                intent.putExtra("number", numberS);
                startActivity(intent);
            }
        });
    }
}