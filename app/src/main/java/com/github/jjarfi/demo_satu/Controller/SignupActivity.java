package com.github.jjarfi.demo_satu.Controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.jjarfi.demo_satu.MainActivity;
import com.github.jjarfi.demo_satu.R;

public class SignupActivity extends AppCompatActivity {
    TextView tv;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initSignup();
    }

    private void initSignup(){
        tv = findViewById(R.id.textView1);
        img = findViewById(R.id.imageView2);
        try{
            Typeface face = Typeface.createFromAsset(getAssets(), "Matiz.ttf");
            tv.setTypeface(face);
        }catch (Exception e){

        }
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SignupActivity.this, MainActivity.class));
            }
        });

    }
}