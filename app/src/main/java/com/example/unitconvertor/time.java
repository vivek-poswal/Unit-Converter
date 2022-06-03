package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class time extends AppCompatActivity {
    EditText editText;
    TextView textView, textView2, textView4, valueinsec;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time);

        textView =findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        valueinsec=findViewById(R.id.valueinsec);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromHoursToSeconds();
            }
        });





    }

    private void ConvertFromHoursToSeconds() {
        String valueEnteredinHours = editText.getText().toString();

        double Hours = Double.parseDouble(valueEnteredinHours);

        double Seconds = Hours * 3600;

        valueinsec.setText("" +Seconds);
    }
}