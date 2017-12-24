package com.example.vladimir.a24_12_17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);


        Intent intent = getIntent();
        if(intent.getAction().contains("second")){
            Toast.makeText(this, "Was start with second Action", Toast.LENGTH_LONG).show();
        }
        else if(intent.getAction().contains("first")){
            Toast.makeText(this, "Was start with first action", Toast.LENGTH_LONG).show();
        }
    }
}
