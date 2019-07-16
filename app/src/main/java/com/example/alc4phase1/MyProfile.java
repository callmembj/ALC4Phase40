package com.example.alc4phase1;

import android.os.Bundle;
import android.widget.Toolbar;

import androidx.appcompat.app.AppCompatActivity;

public class MyProfile extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        toolbar = findViewById(R.id.toolbar);

        //toolbar.setNavigationOnClickListener(view -> onBackPressed());
    }
}
