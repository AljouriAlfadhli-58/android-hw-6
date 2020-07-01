package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movie m =new movie("nimu","suad","10.0","11","drama");
        movie m1 = new movie("malfecient","angliena","9,4","8","action");
    }
}