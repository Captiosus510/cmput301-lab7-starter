package com.example.androiduitesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        TextView cityNameView = findViewById(R.id.textView_cityName);
        Button backButton = findViewById(R.id.button_back);

        // Get the Intent that started this activity
        Intent intent = getIntent();
        // Get the string data from the Intent, with a default value
        String cityName = intent.getStringExtra("cityName");

        // Set the city name in the TextView
        if (cityName != null) {
            cityNameView.setText(cityName);
        }

        // Set a click listener for the back button
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Finish the current activity and go back to the previous one
                finish();
            }
        });
    }
}
