package com.example.todo_4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    public static final String Log_Tag = "My Activity";
    public static final String REPLY_MESSAGE ="com.example.todo_4";
    private TextView mDisplay;
    private EditText mType;
    private TextView mMsgReceived;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.d("MainActivity2", "onCreate");

        mDisplay = findViewById(R.id.DisplayMsg);
        Intent obj = getIntent();
        String message = obj.getStringExtra("EXTRA_MESSAGE");
        mDisplay.setText(message);

        mMsgReceived = findViewById(R.id.MsgReceived);
    }

    public void reply(View view) {
        mType = findViewById(R.id.recieve);
        String message = mType.getText().toString();
        Intent obj = new Intent(this,MainActivity.class);
        obj.putExtra("REPLY_MESSAGE",message);
        setResult(RESULT_OK,obj);
        finish();
    }
    @Override
    public void onStart(){
        super.onStart();
        Log.d("MainActivity2", "onStart");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d("MainActivity2", "onResume");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("MainActivity2", "onPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("MainActivity2", "onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("MainActivity2", "onDestroy");
    }
}