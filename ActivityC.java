package com.example.lerndomeworkprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c);

        Button butCa = findViewById(R.id.buttonThatOpenActivityA);
        butCa.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityA.class);
            startActivity(intent);
        });

        Button butCa1 = findViewById(R.id.buttonThatOpenActivity_B);
        butCa.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityB.class);
            startActivity(intent);
        });

        Button butCa2 = findViewById(R.id.buttonThatOpenActivityD);
        butCa.setOnClickListener(view -> {
            Intent intent = new Intent(this, ActivityD.class);
            finishAffinity();
            startActivity(intent);
        });

        Button butCa3 = findViewById(R.id.buttonThatCloseStack);
        butCa.setOnClickListener(view -> finishAffinity());
    }
}