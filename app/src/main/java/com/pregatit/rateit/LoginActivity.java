package com.pregatit.rateit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void OnLoginClicked(View view) {
        EditText password = (EditText) findViewById(R.id.editTextUsernameLogin);
        Toast.makeText(this, password.getText(), Toast.LENGTH_LONG).show();
    }
}