package com.example.bmiclassactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btnCalc;
    private EditText edtHeight;
    private EditText edtWeight;
    private Switch Gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }

    private void setupViews() {
        btnCalc = findViewById(R.id.button);
        edtHeight = findViewById(R.id.edtHeight);
        edtWeight = findViewById(R.id.edtWeight);
        Gender = findViewById(R.id.gender);

        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double height = Double.parseDouble(edtHeight.getText().toString());
                double weight = Double.parseDouble(edtWeight.getText().toString());

                double BMI = height * weight;
                if (Gender.isChecked()){
                    BMI = BMI * 0.05;
                }
                Toast toast = Toast.makeText(getApplicationContext()
                            , "Your BMI is: " + BMI
                            , Toast.LENGTH_SHORT);
                toast.show();


            }
        });
    }
}