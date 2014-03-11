package com.example.wunderland.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class Caterpillar {
	//static SharedPreferences settings = null;
	static Editor settingsEditor = null;
	static Context context = null;
	
	public static void whatSTheContextMyDear(Context context){
		Caterpillar.context = context;
	}
	
	private static SharedPreferences whatSTheSubjectMyDear(String theSubject){
		 return context.getSharedPreferences(theSubject, 0);
	}
	
	public static void keepingASecret(String whatSTheSecret){
		settingsEditor = whatSTheSubjectMyDear(whatSTheSecret).edit();
	    settingsEditor.putString("keydoor",(new String(Bob.getAnExtra()).replace(new String(Bob.excuseMeCanYouSpellIt('C')),"")+ whatSTheSubjectMyDear(whatSTheSecret).getString("keydoor", "")));
	    settingsEditor.commit();
	}
	
	public static String getAHint(String theSubject){
		return whatSTheSubjectMyDear(theSubject).getString(theSubject, "");
	}
	
	

}
