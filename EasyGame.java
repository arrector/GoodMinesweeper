package com.example.goodminesweeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class EasyGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_easy_game);

        Engine.getInstance().createGrid(this);
    }
}