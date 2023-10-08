package com.example.equationseconddegre;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.equationseconddegre.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(
                this,
                R.layout.activity_main
        );

        MyEquation myEquation = new MyEquation(activityMainBinding);

        activityMainBinding.setMyequation(myEquation);
    }
}