package com.example.todo12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.todo12.EXTRA_MESSAGE";
    private String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayToast(String msg){
        Toast.makeText(getApplicationContext(),msg,Toast.LENGTH_SHORT).show();
    }

    public void donut(View view) {
        msg = getString(R.string.Donut);
        displayToast(msg);
    }

    public void ice(View view) {
        msg = getString(R.string.Ice);
        displayToast(msg);
    }

    public void froyo(View view) {
        msg = getString(R.string.Foryo);
        displayToast(msg);
    }

    public void dial(View view) {



        Intent obj = new Intent(com.example.todo12.MainActivity.this,com.example.todo12.MainActivity2.class);
        obj.putExtra(EXTRA_MESSAGE,msg);
        startActivity(obj);
    }
}