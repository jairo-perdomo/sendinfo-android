package com.example.sendinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityInformation extends AppCompatActivity {
    String names, lastNames, age, email;
    TextView tvNames, tvLastNames, tvAge, tvEmail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        Bundle bundleDates = getIntent().getExtras();
        names = bundleDates.getString("names");
        lastNames = bundleDates.getString("lastNames");
        age = bundleDates.getString("age");
        email = bundleDates.getString("email");

        tvNames = findViewById(R.id.names);
        tvLastNames = findViewById(R.id.lastNames);
        tvAge = findViewById(R.id.age);
        tvEmail = findViewById(R.id.email);

        tvNames.setText(names);
        tvLastNames.setText(lastNames);
        tvAge.setText(age);
        tvEmail.setText(email);
    }
}