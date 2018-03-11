package com.example.lenovo.miwoks;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView number = (TextView) findViewById(R.id.numbers);

        number.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, numbers_activity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
   TextView family = (TextView) findViewById(R.id.family);

        family.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, family_activity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
   TextView color = (TextView) findViewById(R.id.colors);

        color.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, colors_activity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });
   TextView phrases = (TextView) findViewById(R.id.phrases);

        phrases.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, phrases_activity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

    }

}
