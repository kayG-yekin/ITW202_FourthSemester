package com.example.todo18;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recview;
    private SportsAdapter mAdapter;
    private ArrayList<Sport> mSport;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recview = findViewById(R.id.recview);
        recview.setLayoutManager(new LinearLayoutManager(this));

        mSport = new ArrayList<>();
        mAdapter = new SportsAdapter(this,mSport);

        img = findViewById(R.id.sportImg);
        recview.setAdapter(mAdapter);

        initializeData();
    }

    private void initializeData() {
        TypedArray sportsImgRes = getResources().obtainTypedArray(R.array.sport_image);
        String[] sportslist = getResources().getStringArray(R.array.Sport_titles);
        String[] sportinfo = getResources().getStringArray(R.array.Sport_info);

        mSport.clear();

        for(int i=0;i<sportslist.length;i++){
            mSport.add(new Sport(sportslist[i],sportinfo[i],sportsImgRes.getResourceId(i,0)));
        }
        mAdapter.notifyDataSetChanged();
        sportsImgRes.recycle();

    }
}