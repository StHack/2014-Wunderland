package com.example.wunderland;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;

import com.example.wunderland.utils.Bob;
import com.example.wunderland.utils.Caterpillar;

public class Gates extends Activity {
	SharedPreferences settings = null;
	Editor settingsEditor = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gates);
		
		Intent intent = new Intent(Bob.createAKey(), null, this, Bob.getAModel());
		startActivityForResult(intent, Bob.getReqCreatePattern());
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.gates, menu);
		return true;
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
	    switch (requestCode) {
	    case 1: {
	    	Intent intent = null;
	        if (resultCode == RESULT_OK) {
	        	Bob.will(data);
	        	Caterpillar.whatSTheContextMyDear(getApplicationContext());
	        	Caterpillar.keepingASecret("keydoor");
	        	intent = new Intent(getApplicationContext(),WunderLand.class);
	            intent.putExtra(Bob.getName(), Caterpillar.getAHint("keydoor"));
	        }else{
	        	intent = new Intent(getApplicationContext(),Gates.class);
	        }
	    	startActivity(intent);
	        }
	        break;
	    }
	}

}
