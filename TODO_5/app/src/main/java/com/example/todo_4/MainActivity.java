package com.example.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.todo_4";
    public static final String Log_Tag = "My Activity";
    private EditText MessageEditText;
    private TextView displayReply;
    private TextView mRecieved;
    private static final int TEXT_REQUEST = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "onCreate");

        displayReply = findViewById(R.id.display_reply);
        mRecieved = findViewById(R.id.MessageRecieved);

    }

    public void view(View view) {
        MessageEditText =findViewById(R.id.sender);
        String message =MessageEditText.getText().toString();
        Intent obj =new Intent(this,MainActivity2.class);
        obj.putExtra("EXTRA_MESSAGE",message);
        startActivityForResult(obj,TEXT_REQUEST);
    }
    @Override

    public void onActivityResult(int requestCode, int resultCode,Intent obj){
        super.onActivityResult(requestCode,resultCode,obj);
        if(requestCode == TEXT_REQUEST){
            if(resultCode == RESULT_OK){
                String message = obj.getStringExtra("REPLY_MESSAGE");
                displayReply.setText(message);
                displayReply.setVisibility(View.VISIBLE);
                mRecieved.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d("MainActivity", "onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("MainActivity", "onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("MainActivity", "onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("MainActivity", "onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity", "onDestroy");
    }
}