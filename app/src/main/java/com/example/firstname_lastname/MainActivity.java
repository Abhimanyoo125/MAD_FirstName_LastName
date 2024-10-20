package com.example.firstname_lastname;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText firstNameEditText, lastNameEditText;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNameEditText = findViewById(R.id.editTextFirstName);
        lastNameEditText = findViewById(R.id.editTextLastName);
        submitButton = findViewById(R.id.buttonSubmit);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String firstName = firstNameEditText.getText().toString().trim();
                String lastName = lastNameEditText.getText().toString().trim();

                if (firstName.isEmpty() || lastName.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Please enter both First and Last name", Toast.LENGTH_SHORT).show();
                } else {
                    // Pass the data to the next activity
                    Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                    intent.putExtra("FIRST_NAME", firstName);
                    intent.putExtra("LAST_NAME", lastName);
                    startActivity(intent);
                }
            }
        });
    }
}

