package com.example.tresbotoes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.tresbotoes.R;
import com.example.tresbotoes.SecondActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    public static final String EXTRA_BUTTON_ID = "com.example.tresbotoes.extra.button_id";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchSecondActivity(View view) {
        int id = view.getId();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(EXTRA_BUTTON_ID, id);
        Log.d(TAG, "lauchSecondActivity: Pressionado o botão com id: " + id);
        startActivity(intent);
    }
}