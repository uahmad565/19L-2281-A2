package com.example.first123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageActivity7 extends AppCompatActivity implements View.OnClickListener{
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page7);
        bt1=(Button)findViewById(R.id.button_next7);
        bt1.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        Intent i =new Intent(getApplicationContext(),PageActivity8.class);
        startActivity(i);
    }
}