package com.example.sendinformation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText etNames, etLastNames, etAge, etEmail;
    Button btnSend;
    String names, lastNames, age, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etNames = findViewById(R.id.etNames);
        etLastNames = findViewById(R.id.etLastNames);
        etAge = findViewById(R.id.etAge);
        etEmail = findViewById(R.id.etEmail);
        btnSend = findViewById(R.id.btnSend);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                names = etNames.getText().toString();
                lastNames = etLastNames.getText().toString();
                age = etAge.getText().toString();
                email = etEmail.getText().toString();

                Intent intentSend = new Intent(getApplicationContext(), ActivityInformation.class);

                Bundle bundleDates = new Bundle();
                bundleDates.putString("names", names);
                bundleDates.putString("lastNames", lastNames);
                bundleDates.putString("age", age);
                bundleDates.putString("email", email);

                intentSend.putExtras(bundleDates);
                startActivity(intentSend);
            }
        });
    }
}