package com.example.todo12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private TextView mt;
    private Spinner spinner;
    private String msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mt = findViewById(R.id.order);

        Intent obj = getIntent();
        String msg = obj.getStringExtra(MainActivity.EXTRA_MESSAGE);
        mt.setText(msg);

        Spinner spinner =findViewById(R.id.spin);

        if(spinner != null){
            spinner.setOnItemSelectedListener(this);
            ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.label_array,android.R.layout.simple_spinner_dropdown_item);
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

            if(spinner != null){
                spinner.setAdapter(adapter);
            }
        }
    }
    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(),msg,
                Toast.LENGTH_SHORT).show();
    }

    public void radio(View view) {
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.sameday:
                msg = "Same day";
                displayToast(msg);
                break;
            case R.id.nextday:
                msg = "Next Day";
                displayToast(msg);
                break;
            case R.id.pickUp:
                msg = "Pick Up";
                displayToast(msg);
                break;
            default:
                break;
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String SpinnerMessage = parent.getItemAtPosition(position).toString();
        displayToast(SpinnerMessage);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
    //
    }
}