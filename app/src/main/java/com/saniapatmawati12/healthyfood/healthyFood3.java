package com.saniapatmawati12.healthyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class healthyFood3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy_food3);
    }

    public void button3(View view) {
        Intent intent = new Intent(healthyFood3.this, healthyFood4.class);
        startActivity(intent);
    }

}


