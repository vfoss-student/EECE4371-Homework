package com.example.hw1;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String Emessage = "Hello";
    public static final String TAG = "TagMsg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate()");
    }
    public void pressGo(View view) {
        Intent intent = new Intent(this, ActivityResult.class);
        EditText editText = (EditText) findViewById(R.id.editText2);
        String message = editText.getText().toString();
        intent.putExtra(Emessage, message);
        startActivity(intent);
    }

    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");
    }

    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause()");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart()");
    }

    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }
}
