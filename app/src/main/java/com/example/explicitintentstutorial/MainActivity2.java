package com.example.explicitintentstutorial;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText fullNames;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        fullNames = findViewById(R.id.etName);
        submit = findViewById(R.id.submit);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String FullNames = fullNames.getText().toString().trim();
                if (FullNames.isEmpty()){
                    fullNames.setError("Enter your full names!");
                    fullNames.requestFocus();
                }
                else {
                    Intent intent = new Intent();
                    intent.putExtra("FullNames", FullNames);
                    setResult(RESULT_OK, intent);
                    finish();
                }
            }
        });
    }
}