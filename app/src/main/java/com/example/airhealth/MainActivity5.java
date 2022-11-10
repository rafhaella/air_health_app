package com.example.airhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        Random rnd = new Random();
        int random = rnd.nextInt(9999);


        TextView textView15 = (TextView) findViewById(R.id.textView15);
        textView15.setText("SE" + random);

        Button btn05 = (Button) findViewById(R.id.button5);

        btn05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                finishAffinity();
            }
        });
    }

}