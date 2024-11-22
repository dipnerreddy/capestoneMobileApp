package com.example.bloodlinks.Activities;

import static android.opengl.ETC1.isValid;

import android.content.Intent;
import android.content.SyncRequest;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bloodlinks.R;

public class LoginActivity extends AppCompatActivity {
    EditText numberEt, passwordEt;
    Button submit_button;
    TextView Register_text;
    TextView fp_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_login);
        numberEt = findViewById(R.id.number);
        passwordEt = findViewById(R.id.password);
        submit_button = findViewById(R.id.submit_button);
        submit_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(LoginActivity.this,"Unable to fetch data from backend",Toast.LENGTH_SHORT).show();
            }
        });
        Register_text = findViewById(R.id.Register_text);
        Register_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
            }
        });
        fp_text = findViewById(R.id.fp_text);
        fp_text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LoginActivity.this, Fp1.class));
            }
        });

    }
}




