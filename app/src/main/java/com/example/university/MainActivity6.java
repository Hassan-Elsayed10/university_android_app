package com.example.university;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity6 extends AppCompatActivity {
    TextView textView;
    EditText number;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main6 );
        configureNextButton();
        textView = findViewById(R.id.UserText);
    }
    private void configureNextButton(){
        button = findViewById(R.id.login);
        number = findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double num = Double.parseDouble(number.getText().toString());
                SharedPreferences s = getSharedPreferences("store",MODE_PRIVATE);
                SharedPreferences.Editor editor = s.edit();
                editor.putString("id",number.getText().toString());
                editor.commit();
                Intent intent = new Intent(getApplicationContext(), MainActivity7.class);

                if (num == 20191) {
                    String str = ("Name: Esraa \nLast name: Wael \nYou are in level: 2 \nTotal hours that you passed: 38 \nYour CGPA is: 3.871");
                    intent.putExtra("key", str);
                    startActivity(intent);
                } else if (num == 20192) {
                    String str = ("Name: Mohammed \nLast name: Zakaria \nYou are in level: 3 \nTotal hours that you passed: 44 \nYour CGPA is: 2.96");
                    intent.putExtra("key", str);
                    startActivity(intent);
                } else if (num == 20193) {
                    String str = ("Name: Alyaa \nLast name: Mahmoud \nYou are in level: 1 \nTotal hours that you passed: 28 \nYour CGPA is: 3.54");
                    intent.putExtra("key", str);
                    startActivity(intent);
                } else if (num == 20194) {
                    String str = ("Name: Ahmed \nLast name: Roshdy \nYou are in level: 3 \nTotal hours that you passed: 40 \nYour CGPA is: 2.47");
                    intent.putExtra("key", str);
                    startActivity(intent);
                } else if (num == 20195) {
                    String str = ("Name: Yousry \nLast name: Gomaa \nYou are in level: 4 \nTotal hours that you passed: 64 \nYour CGPA is: 2.36");

                    intent.putExtra("key", str);
                    startActivity(intent);
                }else if (num == 20196) {
                    String str = ("Name: Youssef \nLast name: Karem \nYou are in level: 1 \nTotal hours that you passed: 27 \nYour CGPA is: 2.91");
                    intent.putExtra("key", str);
                    startActivity(intent);
                } else if (num == 20197) {
                    String str = ("Name: Asmaa \nLast name: Ahmed \nYou are in level: 2 \nTotal hours that you passed: 35 \nYour CGPA is: 3.21");
                    intent.putExtra("key", str);
                    startActivity(intent);
                }else if (num == 20198) {
                    String str = ("Name: Habiba \nLast name: Mostafa \nYou are in level: 2 \nTotal hours that you passed: 30 \nYour CGPA is: 2.63");
                    intent.putExtra("key", str);
                    startActivity(intent);
                } else if (num == 20199) {
                    String str = ("Name: Youmna \nLast name: Hassan \nYou are in level: 4 \nTotal hours that you passed: 70 \nYour CGPA is: 3.69");
                    intent.putExtra("key", str);
                    startActivity(intent);
                }else if (num == 20190) {
                    String str = ("Name: Amr \nLast name: Magdy \nYou are in level: 3 \nTotal hours that you passed: 45 \nYour CGPA is: 3.11");
                    intent.putExtra("key", str);
                    startActivity(intent);
                }else {
                    Toast.makeText(getApplicationContext(), "Please enter the right ID number", Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}
