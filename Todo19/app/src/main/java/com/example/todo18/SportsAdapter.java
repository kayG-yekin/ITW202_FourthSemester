package com.example.todo18;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class SportsAdapter extends RecyclerView.Adapter<SportsAdapter.ViewHolder> {
    ArrayList<Sport>mSport = new ArrayList<>();
    Context mContext;

    public SportsAdapter(Context mContext,ArrayList<Sport> mSport) {
        this.mContext = mContext;
        this.mSport = mSport;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Sport currentSport = mSport.get(position);
        holder.bindTo(currentSport);
    }

    @Override
    public int getItemCount() {
        return mSport.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private TextView mTitleText;
        private TextView mInfoText;
        private ImageView img;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mTitleText = (TextView)itemView.findViewById(R.id.newsTitle);
            mInfoText = (TextView)itemView.findViewById(R.id.subTitle);
            img =(ImageView)itemView.findViewById(R.id.sportImg);
        }
        void bindTo(Sport currentSport){
            mInfoText.setText(currentSport.getInro());
            mTitleText.setText(currentSport.getTitle());
            Glide.with(mContext).load(currentSport.getImgRes()).into(img);
        }

    }
}
