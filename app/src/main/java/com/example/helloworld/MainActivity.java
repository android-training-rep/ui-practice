package com.example.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button constrantLayoutBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        constrantLayoutBtn = findViewById(R.id.constraint_layout);
        constrantLayoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNewActivity();
            }
        });
    }

    private void openNewActivity() {
        Intent intent = new Intent(this, ConstraintActivity.class);
        startActivity(intent);
    }
}