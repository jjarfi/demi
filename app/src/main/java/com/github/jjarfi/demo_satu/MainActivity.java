package com.github.jjarfi.demo_satu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.jjarfi.demo_satu.Controller.WindowActivity;
import com.github.jjarfi.demo_satu.Controller.SignupActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvJudul, desk,signup;
    Button signin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);
        setContentView(R.layout.activity_main);
        font();
        initLogin();
        initSignup();
    }

    private void font(){
        tvJudul = findViewById(R.id.tvjudul);
        desk = findViewById(R.id.tvdesk);
        signin = findViewById(R.id.btnlogin);
        signup = findViewById(R.id.signup);
        Typeface face = Typeface.createFromAsset(getAssets(), "Matiz.ttf");
        tvJudul.setTypeface(face);
        signup.setTypeface(face);
        signin.setTypeface(face);

    }

    private void initLogin(){
        try{
            signin.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    startActivity(new Intent(MainActivity.this, WindowActivity.class));
                }
            });
        }catch (Exception e){

        }
    }
    private void initSignup(){
        try {
           signup.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                   startActivity(new Intent(MainActivity.this, SignupActivity.class));
               }
           });
        }catch (Exception e){

        }
    }
}