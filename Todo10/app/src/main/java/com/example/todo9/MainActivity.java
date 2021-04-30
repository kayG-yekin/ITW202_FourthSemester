package com.example.todo9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
        private EditText x;
        private EditText y;
        private TextView res;
        private calculator mcal = new calculator();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        x = findViewById(R.id.value1);
        y = findViewById(R.id.value2);
        res = findViewById(R.id.result);
    }

    public void add(View view) {
        String a = x.getText().toString();
        String b = y.getText().toString();
        double Res = mcal.add(Double.valueOf(a),Double.valueOf(b));
        res.setText(String.valueOf(Res));
    }

    public void sub(View view) {
        String a = x.getText().toString();
        String b = y.getText().toString();
        double Res = mcal.sub(Double.valueOf(a),Double.valueOf(b));
        res.setText(String.valueOf(Res));
    }

    public void mul(View view) {
        String a = x.getText().toString();
        String b = y.getText().toString();
        double Res = mcal.mul(Double.valueOf(a),Double.valueOf(b));
        res.setText(String.valueOf(Res));
    }

    public void div(View view) {
        String a = x.getText().toString();
        String b = y.getText().toString();
        double Res = mcal.div(Double.valueOf(a),Double.valueOf(b));
        res.setText(String.valueOf(Res));
    }
}