package com.example.first123;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PageActivity1 extends AppCompatActivity implements View.OnClickListener{
    private Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1);
        bt1=(Button)findViewById(R.id.button_next1);
        bt1.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Intent i =new Intent(getApplicationContext(),PageActivity2.class);
        startActivity(i);
    }
}