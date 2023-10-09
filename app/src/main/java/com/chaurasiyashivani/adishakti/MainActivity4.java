package com.chaurasiyashivani.adishakti;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Thread thread = new Thread(){
          public void run(){
              try{
                   sleep(3000);
              }
              catch(Exception e){
                      e.printStackTrace();
              }
              finally {

                Intent intent = new Intent(MainActivity4.this, MainActivity.class);
                startActivity(intent);

              }
          }
        };thread.start();
    }
}