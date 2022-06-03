package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class length extends AppCompatActivity {
    EditText editText;
    TextView textView, textView2, textView4, valueininches;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        textView =findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        valueininches=findViewById(R.id.valueininches);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromKilometersToInches();
            }
        });





    }

    private void ConvertFromKilometersToInches() {
        String valueEnteredinKilometers = editText.getText().toString();

        double Kilometers = Double.parseDouble(valueEnteredinKilometers);

        double Inches = Kilometers * 39370;

        valueininches.setText("" +Inches);
    }
}