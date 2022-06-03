package com.example.unitconvertor;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class area extends AppCompatActivity {
    EditText editText;
    TextView textView, textView2, textView4, valueinsqf;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_area);

        textView =findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
        textView4=findViewById(R.id.textView4);
        valueinsqf=findViewById(R.id.valueinsqf);

        editText = findViewById(R.id.editText);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ConvertFromsqmtosqf();
            }
        });





    }

    private void ConvertFromsqmtosqf() {
        String valueEnteredinsqm = editText.getText().toString();

        double sqm = Double.parseDouble(valueEnteredinsqm);

        double sqf = sqm * 10.764;

        valueinsqf.setText("" +sqf);
    }
}