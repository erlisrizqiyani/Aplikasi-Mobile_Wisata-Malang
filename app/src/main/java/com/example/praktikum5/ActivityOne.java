package com.example.praktikum5;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ActivityOne extends AppCompatActivity {

    ImageView hair, eyebrow, moustache, beard;
    CheckBox CheckBoxHair, CheckBoxEyebrow, CheckBoxMoustache, CheckBoxBeard;
    Button contactus;
    TextView teks1, teks2;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);

        hair = findViewById(R.id.imgHair);
        eyebrow = findViewById(R.id.imgEyebrow);
        moustache = findViewById(R.id.imgMoustache);
        beard = findViewById(R.id.imgBeard);

        CheckBoxHair = findViewById(R.id.cbHair);
        CheckBoxEyebrow = findViewById(R.id.cbEyebrow);
        CheckBoxMoustache = findViewById(R.id.cbMoustache);
        CheckBoxBeard = findViewById(R.id.cbBeard);

        teks1 = findViewById(R.id.teks1);
        teks2 = findViewById(R.id.teks2);

        Intent login = getIntent();
        teks1.setText("welcome back brokk! "+ login.getStringExtra("uname") );
        teks2.setText(login.getStringExtra("password"));

        contactus = findViewById(R.id.contact);
        contactus.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                Intent contactus = new Intent(ActivityOne.this, ActivityTwo.class);
                startActivity(contactus);
            }
        });

        CheckBoxHair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckBoxHair.isChecked()){
                    hair.setVisibility(View.VISIBLE);
                } else {
                    hair.setVisibility(View.INVISIBLE);
                }
            }
        });
        CheckBoxBeard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckBoxBeard.isChecked()){
                    beard.setVisibility(View.VISIBLE);
                } else {
                    beard.setVisibility(View.INVISIBLE);  }
            }
        });
        CheckBoxMoustache.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckBoxMoustache.isChecked()){
                    moustache.setVisibility(View.VISIBLE);
                } else {
                    moustache.setVisibility(View.INVISIBLE);  }
            }
        });

        CheckBoxEyebrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (CheckBoxEyebrow.isChecked()){
                    eyebrow.setVisibility(View.VISIBLE);
                } else {
                    eyebrow.setVisibility(View.INVISIBLE);  }
            }
        });
    }
}