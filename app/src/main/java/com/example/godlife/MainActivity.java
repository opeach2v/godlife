package com.example.godlife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textTitle;
    EditText inputID, inputPW;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textTitle = (TextView) findViewById(R.id.TextTitle);
        inputID = (EditText) findViewById(R.id.InputID);
        inputPW = (EditText) findViewById(R.id.InputPW);
        btnLogin = (Button) findViewById(R.id.BtnLogin);
        btnRegister = (Button) findViewById(R.id.BtnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), HomeActivity.class); startActivity(intent);
            }
        });
    }
}