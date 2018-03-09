package com.helloworld.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HelloWorldActivity extends AppCompatActivity {

    EditText firstNameText;
    EditText lastNameText;
    TextView fullNameText;
    Button displayBtn;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);


        fullNameText = findViewById(R.id.fullNameView);
        firstNameText = findViewById(R.id.firstNameText);
        lastNameText = findViewById(R.id.lastNameText);
        displayBtn = findViewById(R.id.displayBtn);



        displayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                fullNameText.setText(firstNameText.getText().toString() + " " + lastNameText.getText().toString());
            }
        });
    }
}
