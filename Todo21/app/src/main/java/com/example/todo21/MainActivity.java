package com.example.todo21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private TextView tv;
        private Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = findViewById(R.id.textView);
        bt = findViewById(R.id.button);

    }

    public void StartTask(View view) {
        tv.setText("Napping......");
        simpleAsyncTask obj = new simpleAsyncTask(tv);
        obj.execute();
    }
}