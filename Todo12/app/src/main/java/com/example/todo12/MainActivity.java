package com.example.todo12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void donut(View view) {
        Toast.makeText(this, "You have ordered Donut!", Toast.LENGTH_SHORT).show();
    }

    public void ice(View view) {
        Toast.makeText(this, "You have ordered Ice Cream!", Toast.LENGTH_SHORT).show();
    }

    public void froyo(View view) {
        Toast.makeText(this, "You have ordered Froyo!", Toast.LENGTH_SHORT).show();
    }

    public void dial(View view) {
        Intent obj = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:93498234"));
        startActivity(obj);
    }
}