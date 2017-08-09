package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText spec = (EditText) findViewById(R.id.fish_species);
        final EditText weath = (EditText) findViewById(R.id.weather);
        final EditText temp = (EditText) findViewById(R.id.temperature);
        final EditText water_color = (EditText) findViewById(R.id.water_color);
        final EditText lure_used = (EditText) findViewById(R.id.lure);
        final Button submitButton = (Button) findViewById(R.id.submit);
        final TextView resultView = (TextView) findViewById(R.id.result);

        submitButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                String species = spec.getText().toString().trim();
                String weather = weath.getText().toString().trim();
                String temperature = temp.getText().toString().trim();
                String water = water_color.getText().toString().trim();
                String lure = lure_used.getText().toString().trim();

                String combine = species + ", " + weather + ", " + temperature + ", " + water + ", " + lure;

                resultView.setText(combine);

            }
        });


    }

}
