package com.example.alc4phase1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoAboutAlc (View view) {
        Intent i = (new Intent(this, AboutAlc.class) );
        startActivity (i);
    }

    public void gotoMyProfile (View view)  {

        Intent i = (new Intent(this, MyProfile.class));
        startActivity (i);
    }
}
