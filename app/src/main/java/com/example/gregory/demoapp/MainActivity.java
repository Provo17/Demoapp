package com.example.gregory.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void newCar (View view) {

        ImageView image = (ImageView) findViewById(R.id.porsche1);
        image.setImageResource(R.drawable.porsche2);

        Log.i("Test", "Button clicked!!");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
