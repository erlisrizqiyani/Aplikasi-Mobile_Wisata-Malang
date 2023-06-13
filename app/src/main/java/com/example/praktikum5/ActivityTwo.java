package com.example.praktikum5;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActivityTwo extends AppCompatActivity{
    Button btncall, btnemail, btnwhatsapp, btninstagram;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        btncall = findViewById(R.id.call);
        btnemail = findViewById(R.id.email);
        btnwhatsapp = findViewById(R.id.whatsapp);
        btninstagram = findViewById(R.id.instagram);

        btncall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent call = new Intent(Intent.ACTION_DIAL);
                call.setData(Uri.parse("tel:+6281977315119"));
                startActivity(call);
            }
        });

        btnemail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String namaemail = "mirreltambing@student.ub.ac.id";
                Intent email = new Intent(Intent.ACTION_SENDTO);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{(namaemail)});
                email.putExtra(Intent.EXTRA_SUBJECT, "Hello saya butuh bantuan!");
                email.setData(Uri.parse("mailto:"));
                startActivity(email);
            }
        });
        btnwhatsapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://web.whatsapp.com/";
                Intent whatsapp = new Intent(Intent.ACTION_VIEW);
                whatsapp.setData(Uri.parse(url));
                startActivity(whatsapp);
            }
        });
        btninstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.instagram.com/";
                Intent instagram = new Intent(Intent.ACTION_VIEW);
                instagram.setData(Uri.parse(url));
                startActivity(instagram);
            }
        });
    }
}