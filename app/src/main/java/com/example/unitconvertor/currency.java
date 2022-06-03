package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class currency extends AppCompatActivity {
    EditText editText;
    TextView textView, textView2, textView4, valueindollar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);

        textView =findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        valueindollar=findViewById(R.id.valueindollar);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromRupeesToDollars();
            }
        });





    }

    private void ConvertFromRupeesToDollars() {
        String valueEnteredinRupees = editText.getText().toString();

        double Rupees = Double.parseDouble(valueEnteredinRupees);

        double Dollars = Rupees * 0.013;

        valueindollar.setText("" +Dollars);
    }
}