package com.example.airhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Switch;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Switch switch1 = (Switch) findViewById(R.id.switch1);
        Switch switch2 = (Switch) findViewById(R.id.switch2);
        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton);
        RadioButton radioButton2 = (RadioButton) findViewById(R.id.radioButton2);

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switch1.isChecked() || radioButton2.isChecked())
                    switch2.setChecked(false);
                    radioButton2.setChecked(false);
                    radioButton.setChecked(true);
            }
        });
        switch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (switch2.isChecked() || radioButton.isChecked())
                    switch1.setChecked(false);
                    radioButton2.setChecked(true);
                    radioButton.setChecked(false);
            }
        });

        radioButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (radioButton.isChecked())
                    radioButton2.setChecked(false);
            }
        });
        radioButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (radioButton2.isChecked())
                    radioButton.setChecked(false);
            }
        });

        Button btn02 = (Button) findViewById(R.id.btn02);

        btn02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (!switch1.isChecked() && !switch2.isChecked()) {
                    AlertPage01 alert = new AlertPage01();
                    alert.show(getSupportFragmentManager(), "misseles");
                }
                else if(switch1.isChecked() || switch2.isChecked()) {
                    Intent it = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(it);
                }
            }
        });
    }
}
