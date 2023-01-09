package com.henie.finalproject;

import static com.henie.heniefont.MainActivity.getRetryBtn;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getRetryBtn(this, new Intent(this, MainActivity2.class), getString(R.string.fail) + BuildConfig.APPLICATION_ID);

    }
}