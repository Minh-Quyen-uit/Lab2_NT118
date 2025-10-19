package com.example.lab02;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnBai01, btnBai02, btnBai03, btnBai04, btnBai05;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnBai01 = findViewById(R.id.btnBai01);
        btnBai02 = findViewById(R.id.btnBai02);
        btnBai03 = findViewById(R.id.btnBai03);
        btnBai04 = findViewById(R.id.btnBai04);
        btnBai05 = findViewById(R.id.btnBai05);

        btnBai01.setOnClickListener(view -> {
            Intent Bai01Intent = new Intent(MainActivity.this, Bai01.class);
            startActivity(Bai01Intent);
        });
        btnBai02.setOnClickListener(view -> {
            Intent Bai02Intent = new Intent(MainActivity.this, Bai02.class);
            startActivity(Bai02Intent);
        });
        btnBai03.setOnClickListener(view -> {
            Intent Bai03Intent = new Intent(MainActivity.this, Bai03.class);
            startActivity(Bai03Intent);
        });
        btnBai04.setOnClickListener(view -> {
            Intent Bai04Intent = new Intent(MainActivity.this, Bai04.class);
            startActivity(Bai04Intent);
        });
    }
}