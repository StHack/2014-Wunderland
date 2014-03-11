package com.example.wunderland.utils;

import admob.patt.LockPatternActivity;
import android.content.Intent;

public class Bob {
	private static final String NAME = "B0b";
	private static final int REQ_CREATE_PATTERN = 1;
	private static Intent anIntent;

	public static void will(Intent intent){
		Bob.anIntent = intent;
	}
	
	public static int getReqCreatePattern() {
		return REQ_CREATE_PATTERN;
	}
	
	public static String createAKey(){
		return LockPatternActivity.ACTION_CREATE_PATTERN;
	}
	
	public static Class getAModel(){
		return LockPatternActivity.class;
	}
	
	public static char[] getAnExtra(){
		return anIntent.getCharArrayExtra(LockPatternActivity.EXTRA_PATTERN);	
	}

	public static String getName() {
		return NAME;
	}
	
	public static char[] excuseMeCanYouSpellIt(char c){
		int primo = 0;
		char x = Character.toUpperCase(c);
		char[] y = new char[3];
		String z = "[";
		String l = "@";
		y[0] = z.charAt(primo);
		y[2] = l.charAt(primo);
		if(x == 'C'){
			y[1] = x;
		}else if(x == 'B'){
			y[1] = x;
		}else{
			
		}
		return y;
	}
	
}
