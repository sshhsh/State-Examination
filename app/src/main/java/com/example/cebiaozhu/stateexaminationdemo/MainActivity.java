package com.example.cebiaozhu.stateexaminationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.daimajia.numberprogressbar.NumberProgressBar;

public class MainActivity extends AppCompatActivity {
    NumberProgressBar x,y,z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = findViewById(R.id.x_progress_bar);
        y = findViewById(R.id.y_progress_bar);
        z = findViewById(R.id.z_progress_bar);
    }
}
