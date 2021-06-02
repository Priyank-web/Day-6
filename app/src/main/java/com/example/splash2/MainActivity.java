package com.example.splash2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Thread thread = new Thread(){
            public void run() {
                try {
                    sleep(millis 3000);
                }catch (Exception e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent( packageContext: SplashActivity.this, MainActivity.class);
                    startActivity(intent);
                }
            }
        };
        thread.start();
    }
    @Override
    protected void onPause(){
        super. onPause();
        finish ();
    }
}