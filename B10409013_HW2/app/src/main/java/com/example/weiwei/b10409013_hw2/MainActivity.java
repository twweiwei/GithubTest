package com.example.weiwei.b10409013_hw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.b10409013,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem weiwei) {
        int id= weiwei.getItemId();
        if (id == R.id.wei){
            Intent i1 = new Intent();
            i1.setClass(MainActivity.this,activity2.class);
            startActivity(i1);
        }
        return  super.onOptionsItemSelected(weiwei);
    }
}

