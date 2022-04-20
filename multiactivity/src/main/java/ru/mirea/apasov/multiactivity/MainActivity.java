package ru.mirea.apasov.multiactivity;

import static android.content.ContentValues.TAG;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onStart(){
        super.onStart();
        Log.i(TAG,"onStart()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState){
        super.onRestoreInstanceState(savedInstanceState);
        Log.i(TAG, "onRestoreInstanceState");
    }

    @Override
    public void onPostCreate(Bundle savedInstanceState, PersistableBundle persistentState){
        super.onPostCreate(savedInstanceState,persistentState);
        Log.i(TAG,"onPostCreate");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"onResume()");
    }

    @Override
    protected void onPostResume(){
        super.onPostResume();
        Log.i(TAG,"onPostResume");
    }

    @Override
    public void onAttachedToWindow(){
        super.onAttachedToWindow();
        Log.i(TAG,"onAttachedToWindow");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        Log.i(TAG,"onSaveInstanceState");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"onDestroy");
    }

    @Override
    public void onDetachedFromWindow(){
        super.onDetachedFromWindow();
        Log.i(TAG,"onDetachedFromWindow");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.i(TAG,"onRestart");
    }

    public void onClickNewActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("key", "MIREA - АПАСОВ ВАСИЛИЙ ИГОРЕВИЧ");
        startActivity(intent);
    }

}