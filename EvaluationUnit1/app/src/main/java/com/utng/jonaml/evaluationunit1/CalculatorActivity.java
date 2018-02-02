package com.utng.jonaml.evaluationunit1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CalculatorActivity extends AppCompatActivity {


    EditText edt_data;
    Button btn_seven, btn_eight, btn_nine, btn_mult, btn_four, btn_five, btn_six, btn_sub,
            btn_one, btn_two, btn_three, btn_add, btn_div, btn_zero, btn_dot, btn_equal, btn_clear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
    }
}
