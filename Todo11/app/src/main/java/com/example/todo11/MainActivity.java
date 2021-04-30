package com.example.todo11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView msg;
    private String[] color = {"red","orange","blue","black","purple_200"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = findViewById(R.id.hello);
    }

    public void Change(View view) {
        Random obj = new Random();
        String colorname = color[obj.nextInt(4)];

        int colorResName = getResources().getIdentifier(colorname,"color",getApplicationContext().getPackageName());
        int colorRes = ContextCompat.getColor(this,colorResName);
        msg.setTextColor(colorRes);
    }
}