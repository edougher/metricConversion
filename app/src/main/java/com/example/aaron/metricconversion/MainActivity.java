package com.example.aaron.metricconversion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText inches = findViewById(R.id.inches);
        final EditText feet = findViewById(R.id.feet);
        final EditText pounds = findViewById(R.id.pounds);
        final EditText faherenheit = findViewById(R.id.faherenheit);

        final TextView cm = findViewById(R.id.cm);
        final TextView meters = findViewById(R.id.meters);
        final TextView kilos = findViewById(R.id.kilos);
        final TextView celsius = findViewById(R.id.celcius);

        Button convert = findViewById(R.id.convert_btn);
        Button convert2 = findViewById(R.id.convert_btn2);
        Button convert3 = findViewById(R.id.convert_btn3);
        Button convert4 = findViewById(R.id.convert_btn4);

        final DecimalFormat currency = new DecimalFormat("###,###.##");

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double value1 ;
                value1 = Double.valueOf(inches.getText().toString());
                Double result1 = value1 / 0.39;
                cm.setText(currency.format(result1));

            }
        });

        convert2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double value2 ;
                value2 = Double.valueOf(feet.getText().toString());
                Double result2 = value2 / 3.2808;
                meters.setText(currency.format(result2));

            }
        });

        convert3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double value3;
                value3 = Double.valueOf(pounds.getText().toString());
                Double result3 = value3 / 2.2046;
                kilos.setText(currency.format(result3));


            }
        });

        convert4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double value4;
                value4 = Double.valueOf(faherenheit.getText().toString());
                Double result4 = (value4 - 32.0) / 1.8;
                celsius.setText(currency.format(result4));

            }
        });


    }

}

