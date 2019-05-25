package com.saniapatmawati12.healthyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class healthyFood extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy_food);
    }

    public void buttonn(View view) {
        Intent intent = new Intent(healthyFood.this, healthyFood1.class);
        startActivity(intent);
    }

}


