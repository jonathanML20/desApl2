package com.utng.jonaml.evaluationunit1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calcActivity(View view) {
        startActivity(new Intent(this, CalculatorActivity.class));
    }

    public void formActivity(View view) {
        startActivity(new Intent(this, FormActivity.class));
    }

}

