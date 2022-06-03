package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class temperature extends AppCompatActivity {
    EditText editText;
    TextView textView, textView2, textView4, valueinfeh;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);

        textView =findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        valueinfeh=findViewById(R.id.valueinfeh);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromceltofeh();
            }
        });





    }

    private void ConvertFromceltofeh() {
        String valueEnteredincel = editText.getText().toString();

        double cel = Double.parseDouble(valueEnteredincel);

        double feh = cel * 1.8 + 32;

        valueinfeh.setText("" +feh);
    }
}