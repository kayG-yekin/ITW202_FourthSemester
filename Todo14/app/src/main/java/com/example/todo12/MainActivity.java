package com.example.todo12;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.todo12.EXTRA_MESSAGE";
    private String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_settings:
                Toast.makeText(this, "You selected settings", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_contact:
                Toast.makeText(this, "you selected contact", Toast.LENGTH_SHORT).show();
                break;
            case R.id.action_order:
                Intent intent = new Intent(com.example.todo12.MainActivity.this,com.example.todo12.MainActivity2.class);
                intent.putExtra(EXTRA_MESSAGE,msg);
                startActivity(intent);
        }
        return super.onOptionsItemSelected(item);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return super.onCreateOptionsMenu(menu);

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