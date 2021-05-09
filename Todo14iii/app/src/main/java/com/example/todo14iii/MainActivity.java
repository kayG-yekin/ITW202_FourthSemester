package com.example.todo14iii;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private TextView Tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Tv = findViewById(R.id.tv);
    }

    public void date(View view) {
        DialogFragment obj = new datePickerFragment();
        obj.show(getSupportFragmentManager(),"DatePicker");


    }
    public void datePickerResult(int year, int month, int day){
        String month_string = Integer.toString(month+1);
        String year_string = Integer.toString(year);
        String day_string = Integer.toString(day);
        String date_msg= (month_string+"/"+ day_string+"/"+year_string);
        Tv.setText(date_msg);
        Toast.makeText(this, "Date: "+date_msg, Toast.LENGTH_SHORT).show();
    }
}