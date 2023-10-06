package com.example.lerndomeworkprj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ActivityA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity);
        Button butCa = findViewById(R.id.buttonThatOpenActivityB);
        butCa.setOnClickListener(view -> {
            Intent intent =new Intent(this, ActivityB.class);
            startActivity(intent);
        });
    }
}