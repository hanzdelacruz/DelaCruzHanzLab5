package com.delacruz.hanz;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Screen2Activity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);
    }

    public void display1(View v){
        Intent c = new Intent(this,MainActivity.class);
        startActivity(c);
    }
}
