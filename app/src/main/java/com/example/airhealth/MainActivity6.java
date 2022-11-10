package com.example.airhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

import java.util.Random;

public class MainActivity6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        Button btn06 = (Button) findViewById(R.id.button6);
        Random rnd = new Random();
        int random = rnd.nextInt(9999);

        btn06.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finishAffinity();
            }
        });

        TextView textView19 = (TextView) findViewById(R.id.textView19);
        textView19.setText("AP" + random);
    }
}