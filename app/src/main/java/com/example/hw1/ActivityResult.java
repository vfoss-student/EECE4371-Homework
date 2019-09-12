package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Emessage);

        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
    }
}
