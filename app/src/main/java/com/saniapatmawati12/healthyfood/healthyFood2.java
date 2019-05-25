package com.saniapatmawati12.healthyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class healthyFood2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy_food2);
    }

    public void button2(View view) {
        Intent intent = new Intent(healthyFood2.this, healthyFood3.class);
        startActivity(intent);
    }

}


