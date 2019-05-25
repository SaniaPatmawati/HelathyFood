package com.saniapatmawati12.healthyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class healthyFood4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy_food4);
    }

    public void button4(View view) {
        Intent intent = new Intent(healthyFood4.this, healthyFood5.class);
        startActivity(intent);
    }

}


