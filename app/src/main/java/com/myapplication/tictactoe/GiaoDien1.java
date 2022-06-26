package com.myapplication.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GiaoDien1 extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giao_dien1);
    }

    @Override
    public void onClick(View view) {
        int id = view.getId();
        if(id == R.id.pvp){
           startActivity(new Intent(GiaoDien1.this,MainActivity.class));
        }
    }
}