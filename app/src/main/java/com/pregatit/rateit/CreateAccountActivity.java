package com.pregatit.rateit;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class CreateAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);
    }

    public void OnCreateAccountClicked(View view) {
        EditText password = (EditText) findViewById(R.id.editTextEmailCreateAcc);
        Toast.makeText(this, password.getText(), Toast.LENGTH_LONG).show();
    }
    public void onCheckboxClicked(View v) {
        CheckBox checkBox = (CheckBox)v;
        if(checkBox.isChecked()){
        Toast.makeText(this,"It's ok", Toast.LENGTH_LONG).show();
        }
    }
}