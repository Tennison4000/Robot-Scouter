package com.supercilex.robotscouter.ui;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

@SuppressLint("Registered")
public class AppCompatActivityBase extends AppCompatActivity {
    private ActivityHelper mHelper;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mHelper = new ActivityHelper(this);
    }

    public ActivityHelper getHelper() {
        return mHelper;
    }
}
