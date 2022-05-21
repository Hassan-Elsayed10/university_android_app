package com.example.university;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);
        Button bb = (Button) findViewById(R.id.b);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click4();
            }
        });
    }
    public void click4(){
        Intent intent = new Intent(MainActivity10.this,MainActivity8.class);
        startActivity(intent);
    }

    }
