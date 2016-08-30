package com.example.qcm;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Button;
import android.widget.Toast;

public class MyThread extends AsyncTask<Void, Integer, Void> {
	private Context mContext;
	private Button mButtonVerif;
	public MyThread(Context context, Button button) {
        mContext = context;
        mButtonVerif = button;
    }
	
	@Override
	protected Void doInBackground(Void... params) {
		for(int decompte=0;decompte<=20;decompte++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();}
		}
		return null;
	}
	
	protected void onPostExecute(Void result) {
		Toast.makeText(mContext,"Temps écoulé...",Toast.LENGTH_LONG).show();
        mButtonVerif.setEnabled(false);
	}
}
