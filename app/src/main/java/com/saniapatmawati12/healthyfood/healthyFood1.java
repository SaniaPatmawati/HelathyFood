package com.saniapatmawati12.healthyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class healthyFood1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy_food1);
    }

    public void button1(View view) {
        Intent intent = new Intent(healthyFood1.this, healthyFood2.class);
        startActivity(intent);
    }

}


