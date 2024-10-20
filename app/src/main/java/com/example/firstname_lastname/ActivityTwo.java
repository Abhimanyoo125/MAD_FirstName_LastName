package com.example.firstname_lastname;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityTwo extends AppCompatActivity {

    private TextView greetingTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        greetingTextView = findViewById(R.id.textViewGreeting);

        // Get the data passed from the first activity
        String firstName = getIntent().getStringExtra("FIRST_NAME");
        String lastName = getIntent().getStringExtra("LAST_NAME");

        // Set the greeting message
        String greetingMessage = "Hello Mr./Mrs. " + firstName + " " + lastName;
        greetingTextView.setText(greetingMessage);
    }
}

