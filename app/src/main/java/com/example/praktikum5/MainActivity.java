package com.example.praktikum5;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button login;
    EditText uname, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login    = findViewById(R.id.btLogin);
        password = findViewById(R.id.txtPass);
        uname    = findViewById(R.id.txtUname);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String Uname = uname.getText().toString();
                String Password = password.getText().toString();

                if (Uname.isEmpty() || Password.isEmpty()) {
                    Toast.makeText(MainActivity.this, "username dan password gabole kosong! " , Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Berhasil login", Toast.LENGTH_SHORT).show();

                    Intent activity_one = new Intent(MainActivity.this, ActivityOne.class);
                    activity_one.putExtra("uname", Uname);
                    startActivity(activity_one);
                }
            }
        });
    }
}