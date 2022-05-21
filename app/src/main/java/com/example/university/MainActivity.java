package com.example.university;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Button policy= (Button) findViewById(R.id.policy);
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click0();            }
        });
        configureImageButton1();
        configureImageButton2();
        configureImageButton3();
        configureImageButton4();
        configureImageButton5();
        Button b = (Button) findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                click();            }
        });
    }
    public void click0(){
        Intent intent = new Intent(this,MainActivity10.class);
        startActivity(intent); }

    public void click(){
        Intent intent = new Intent(this,MainActivity9.class);
        startActivity(intent); }

    private void configureImageButton5(){
        ImageButton ImageButton5 = (ImageButton) findViewById( R.id.imageButton5);
        ImageButton5.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this,MainActivity6.class) );
            }
        } );
    }
    private void configureImageButton4(){
        ImageButton ImageButton4 = (ImageButton) findViewById( R.id.imageButton4);
        ImageButton4.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this,MainActivity5.class) );
            }
        } );

    }
    private void configureImageButton3(){
        ImageButton ImageButton3 = (ImageButton) findViewById( R.id.imageButton3);
        ImageButton3.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this,MainActivity4.class) );
            }
        } );

    }

    private void configureImageButton2(){
        ImageButton ImageButton2 = (ImageButton) findViewById( R.id.imageButton2);
        ImageButton2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this,MainActivity3.class) );
            }
        } );

    }
    private void configureImageButton1(){
        ImageButton ImageButton1 = (ImageButton) findViewById( R.id.imageButton1);
        ImageButton1.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity( new Intent(MainActivity.this,MainActivity2.class) );
            }
        } );
    }
}