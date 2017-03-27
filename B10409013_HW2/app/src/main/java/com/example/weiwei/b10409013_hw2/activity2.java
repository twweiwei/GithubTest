package com.example.weiwei.b10409013_hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.b10409013_2,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem back) {
        int id= back.getItemId();
        if (id == R.id.back){
            Intent i1 = new Intent();
            i1.setClass(activity2.this,MainActivity.class);
            startActivity(i1);
        }
        return  super.onOptionsItemSelected(back);
    }
}

