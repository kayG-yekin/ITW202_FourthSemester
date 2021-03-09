package com.example.hellotoast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int isiCount = 0;
    private int  data = 10;
    private int a = 10;
    private TextView Hcount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Hcount = (TextView) findViewById(R.id.textView);

    }

    public void view(View view) {
        Toast isi = Toast.makeText(this,"hello Toast",Toast.LENGTH_LONG);
        isi.show();
    }

    public void reset(View view) {
        isiCount =0;
        data= 10;
        Toast reset = Toast.makeText(this, " cleared",Toast.LENGTH_LONG);
        reset.show();
        if(Hcount!=null){
            Hcount.setText(Integer.toString(isiCount));
        }
    }

    public void count(View view) {
        isiCount++;
        if(isiCount == data){
            Toast count = Toast.makeText(this,"Data = "+data+"",Toast.LENGTH_LONG);
            count.show();
        }if(Hcount!=null){
            Hcount.setText(Integer.toString(isiCount));
        }
    }
}