package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class M2 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button button = findViewById(R.id.button);
        Button button1 = findViewById(R.id.button2);
        Button button2 = findViewById(R.id.button3);
        Button button3 = findViewById(R.id.button4);
        Button button4 = findViewById(R.id.button5);

        button.setOnClickListener(v -> {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
            finish();

        });
        button1.setOnClickListener(v -> {
            Intent intent = new Intent(this, M1.class);
            startActivity(intent);
            finish();

        });
        button2.setOnClickListener(v -> {

        });
        button3.setOnClickListener(v -> {
            Intent intent = new Intent(this, M3.class);
            startActivity(intent);
            finish();

        });
        button4.setOnClickListener(v -> {
            Intent intent = new Intent(this, M4.class);
            startActivity(intent);
            finish();
        });
    }
}
