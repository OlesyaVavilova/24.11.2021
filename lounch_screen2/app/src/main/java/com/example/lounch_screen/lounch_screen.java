package com.example.lounch_screen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class lounch_screen extends AppCompatActivity {
    private static int SPLASH_SCREEN=3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setContentView(R.layout.lounch_screen);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(lounch_screen.this,onboarding.class);
                startActivity(intent);
                finish();
            }
        } ,SPLASH_SCREEN );
        setContentView(R.layout.lounch_screen);

    }
}