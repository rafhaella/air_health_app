package com.example.airhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        RadioButton radioButton3 = (RadioButton) findViewById(R.id.radioButton3);
        RadioButton radioButton4 = (RadioButton) findViewById(R.id.radioButton4);
        RadioButton radioButton5 = (RadioButton) findViewById(R.id.radioButton5);
        RadioButton radioButton6 = (RadioButton) findViewById(R.id.radioButton6);

        radioButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (radioButton3.isChecked())
                    radioButton4.setChecked(false);
                radioButton5.setClickable(true);
                radioButton6.setClickable(true);
            }
        });
        radioButton4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (radioButton4.isChecked())
                    radioButton3.setChecked(false);
                radioButton5.setClickable(false);
                radioButton5.setChecked(false);
                radioButton6.setClickable(false);
                radioButton6.setChecked(false);
                Pergunta01Fragment alert = new Pergunta01Fragment();
                alert.show(getSupportFragmentManager(), "misseles");
            }
        });

        radioButton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (radioButton5.isChecked())
                    radioButton6.setChecked(false);
            }
        });
        radioButton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (radioButton6.isChecked())
                    radioButton5.setChecked(false);
            }
        });

        Button btn03 = (Button) findViewById(R.id.btn03);

        btn03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (radioButton4.isChecked()) {
                    Pergunta01Fragment alert = new Pergunta01Fragment();
                    alert.show(getSupportFragmentManager(), "misseles");
                } else if (radioButton5.isChecked()) {
                    Pergunta02Dialog alert = new Pergunta02Dialog();
                    alert.show(getSupportFragmentManager(), "misseles");
                } else if (!radioButton3.isChecked() && !radioButton4.isChecked() && !radioButton5.isChecked() && !radioButton6.isChecked()){
                    AlertPage02 alert = new AlertPage02();
                    alert.show(getSupportFragmentManager(), "misseles");
                }
                else if (radioButton3.isChecked() && !radioButton4.isChecked() && radioButton5.isChecked()){
                    AlertPage02 alert = new AlertPage02();
                    alert.show(getSupportFragmentManager(), "misseles");
                }
                else if (radioButton3.isChecked() && radioButton6.isChecked()) {
                    Intent it = new Intent(getApplicationContext(), MainActivity6.class);
                    startActivity(it);
                }



            }
        });
    }
}