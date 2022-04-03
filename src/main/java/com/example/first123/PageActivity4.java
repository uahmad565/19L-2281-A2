package com.example.first123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageActivity4 extends AppCompatActivity implements View.OnClickListener{
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page4);
        bt1=(Button)findViewById(R.id.button_next4);
        bt1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i =new Intent(getApplicationContext(),PageActivity5.class);
        startActivity(i);
    }
}