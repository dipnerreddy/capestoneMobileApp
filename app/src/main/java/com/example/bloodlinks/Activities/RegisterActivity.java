package com.example.bloodlinks.Activities;

import static android.app.ProgressDialog.show;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.bloodlinks.R;

public class RegisterActivity extends AppCompatActivity {
    private EditText nameEt, passwordEt, mobileEt, confirmEt ;
    private Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_register);
        nameEt = findViewById(R.id.name);

        passwordEt = findViewById(R.id.password);
        confirmEt = findViewById(R.id.confirmpassword);
        mobileEt = findViewById(R.id.number);
        submitButton = findViewById(R.id.submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name, confirmpassword, password, mobile;
                name = nameEt.getText().toString();
                confirmpassword = confirmEt.getText().toString();
                password = passwordEt.getText().toString();
                mobile = mobileEt.getText().toString();
                showMessage(name+"\n"+confirmpassword+"\n"+password+"\n"+mobile);
            }
        });
    }
    private void showMessage (String msg){
        Toast.makeText(RegisterActivity.this, "Unable to fetch data from backend", Toast.LENGTH_SHORT) .show();
    }
}