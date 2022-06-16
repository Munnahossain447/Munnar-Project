package com.munna.car;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    LinearLayout bmw;
    LinearLayout ford;
    LinearLayout lam;
    LinearLayout ferrari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bmw = findViewById(R.id.bmw);
        ford = findViewById(R.id.ford);
        lam = findViewById(R.id.lam);
        ferrari = findViewById(R.id.ferrari);

        bmw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent bmw = new Intent(MainActivity.this,BMWActivity.class);
                startActivity(bmw);

            }
        });

        ford.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent ford = new Intent(MainActivity.this, FordActivity.class);
                startActivity(ford);

            }
        });

        lam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent lam = new Intent(MainActivity.this, LamborghiniActivity.class);
                startActivity(lam);

            }
        });


        ferrari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent fer = new Intent(MainActivity.this, FerrariActivity.class);
                startActivity(fer);

            }
        });






    }


}