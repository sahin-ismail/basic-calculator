package com.intertech.basithesapmakinesi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView sonuc = (TextView) findViewById(R.id.textViewsonuc);

         final EditText sayı1 = (EditText) findViewById(R.id.editTextsayı1);
         final EditText sayı2 = (EditText) findViewById(R.id.editTextsayı2);

        Button carp = (Button) findViewById(R.id.buttoncarp);
        Button bol = (Button) findViewById(R.id.buttonbol);
        Button topla = (Button) findViewById(R.id.buttontopla);
        Button cıkar = (Button) findViewById(R.id.buttoncıkar);

        carp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(sayı1.getText().toString());
                int b = Integer.parseInt(sayı2.getText().toString());
                int c = a*b;


                sonuc.setText(String.valueOf(c));

            }
        });

        topla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(sayı1.getText().toString());
                int b = Integer.parseInt(sayı2.getText().toString());
                int c = a+b;


                sonuc.setText(String.valueOf(c));
            }
        });

        bol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(sayı1.getText().toString());
                int b = Integer.parseInt(sayı2.getText().toString());
                float c = (float) a/b;


                sonuc.setText(String.valueOf(c));
            }
        });

        cıkar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(sayı1.getText().toString());
                int b = Integer.parseInt(sayı2.getText().toString());
                int c = a-b;


                sonuc.setText(String.valueOf(c));
            }
        });
    }
}
