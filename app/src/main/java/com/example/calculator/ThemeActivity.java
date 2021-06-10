package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThemeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theme);

        findViewById(R.id.light_button).setOnClickListener(v -> {
            Intent intent = new Intent(ThemeActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra(MainActivity.LIGHT_THEME, R.style.Theme_Calculator);
            startActivity(intent);
        });

        findViewById(R.id.dark_button).setOnClickListener(v -> {
            Intent intent = new Intent(ThemeActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.putExtra(MainActivity.DARK_THEME, R.style.Theme_Calculator_Dark);
            startActivity(intent);
        });
    }
}