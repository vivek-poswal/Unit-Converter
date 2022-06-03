package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class weight extends AppCompatActivity {
    EditText editText;
    TextView textView, textView2, textView4, valueinpound;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);

        textView =findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        valueinpound=findViewById(R.id.valueindollar);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromkiloTopound();
            }
        });





    }

    private void ConvertFromkiloTopound() {
        String valueEnteredKilo = editText.getText().toString();

        double Kilo = Double.parseDouble(valueEnteredKilo);

        double Pound = Kilo * 2.205;

        valueinpound.setText("" +Pound);
    }

}