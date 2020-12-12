package com.hariselfian.submission_fundamental;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class KontakActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About Me");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
     }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}


