package com.bwie.guoshitong1111;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("xxx","MainActivity====onCreate");
        setContentView(R.layout.activity_main);
    }
    public void shuaxin(View view){

    }
    public void faxian(View view){

    }
    public void xiaoxi(View view){

    }
    public void gouwuche(View view){

    }
    public void wode(View view){

    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("xxx","MainActivity====onRestart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("xxx","MainActivity====onPause");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("xxx","MainActivity====onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("xxx","MainActivity====onResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("xxx","MainActivity====onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("xxx","MainActivity====onDestroy");
    }
}
