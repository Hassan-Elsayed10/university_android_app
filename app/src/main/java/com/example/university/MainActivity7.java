package com.example.university;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity7 extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        TextView tv_id = (TextView) findViewById(R.id.tv_id);
        Button logout =(Button) findViewById(R.id.logout);
        SharedPreferences s = getSharedPreferences("store",MODE_PRIVATE);
        String id = s.getString("id","Not Found");
        tv_id.setText("Your ID is: " +id);

        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String str = intent.getStringExtra("key");
        textView.setText(str);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity7.this,MainActivity.class));
            }
        });

    }
}