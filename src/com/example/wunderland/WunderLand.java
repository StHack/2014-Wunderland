package com.example.wunderland;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.wunderland.utils.Bob;
import com.example.wunderland.utils.Castle;
import com.example.wunderland.utils.CheshireCat;
import com.example.wunderland.utils.WhiteRabbit;


// Generate flag with a path user calculation 
public class WunderLand extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wunder_land);
		TextView tv = (TextView) findViewById(R.id.tv_white_rabbit);
		TextView tvAC = (TextView) findViewById(R.id.tv_alarm_clock);
		Button btn = (Button) findViewById(R.id.btn_alice);
		tvAC.setAlpha(0);
		if(getIntent().getExtras().getString(Bob.getName()).length() < 360){
			tv.setText("Look for a bigger door Alice");
			btn.setText("Continue");
			btn.setOnClickListener(new View.OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent intent = new Intent(getApplicationContext(),Gates.class);
					startActivity(intent);
				}
			});
			
		}else{
			
			if(getIntent().getExtras().get(Bob.getName()).toString().equals(Castle.getLock())){ 
				
				tv.setText(CheshireCat.mock());
				tvAC.setAlpha(1);
				tvAC.setText(WhiteRabbit.tick());
				btn.setEnabled(Castle.getState(Castle.open(false)));
				
			}else{
				tv.setText(WhiteRabbit.hurry());
				SharedPreferences settings = getSharedPreferences("keydoor", 0);
				Editor settingsEditor = settings.edit();
				btn.setText("Retry ?");
				btn.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						Intent intent = new Intent(getApplicationContext(),Gates.class);
						startActivity(intent);
					}
				});
				settingsEditor.remove("keydoor");
				settingsEditor.commit();
			}
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wunder_land, menu);
		return true;
	}
	

	@Override
	public void onBackPressed() {}
	
}
