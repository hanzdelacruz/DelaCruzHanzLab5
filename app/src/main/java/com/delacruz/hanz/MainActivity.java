package com.delacruz.hanz;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("4itf","onCreate has executed...");
        Intent i = new Intent(this, MyService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4itf","onStart has executed..");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("4itf","onResume has executed..");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("4itf","onPause has executed..");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("4itf","onStop has executed");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("4itf","onRestart is again executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("4itf","object is deallocated");
    }

    public void display2(View v){
        Intent i = new Intent(this,Screen2Activity.class);
        startActivity(i);
    }

    public void displayMap(View v){
        Intent i = null, chooser=null;
        if (v.getId()==R.id.btnmap){
            i=new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:14.582919,120.979683"));
            chooser=Intent.createChooser(i, "Select your map app");
            startActivity(i);
        }
    }
}