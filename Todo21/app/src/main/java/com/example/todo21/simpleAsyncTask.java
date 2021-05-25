package com.example.todo21;

import android.os.AsyncTask;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class simpleAsyncTask extends AsyncTask<Void, Void,String> {
    private WeakReference<TextView> mTv;

    public simpleAsyncTask(TextView tv){
        mTv = new WeakReference<>(tv);
    }

    @Override
    protected String doInBackground(Void... voids) {
        Random r  = new Random();
        int n = r.nextInt(10);
        int s = n* 200;

        try{
            Thread.sleep(s);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        return "I have been sleeping for "+ s + " milliseconds!!";

    }
    @Override
    protected void onPostExecute(String s){
        mTv.get().setText(s);
    }
}
