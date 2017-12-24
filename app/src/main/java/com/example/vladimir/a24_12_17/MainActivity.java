package com.example.vladimir.a24_12_17;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button startSecond = findViewById(R.id.start_second_btn);
        startSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("telran.java17.first.action");
                Intent chooser = Intent.createChooser(intent, "Choise app");
                startActivity(chooser);
            }
        });

        Button startThird = findViewById(R.id.start_third_btn);
        startThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent("telran.java17.second.action");
                startActivity(intent);
            }
        });

        Button openLink = findViewById(R.id.open_link_btn);
        openLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://google.com");
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);
            }
        });
    }
}
