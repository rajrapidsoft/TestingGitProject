package com.example.force;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.os.Bundle;
import android.util.Log;

/**
 * 
 * @author rapidsoft
 * 
 */

public class AppsApplication extends Application implements ComponentCallbacks {


	public AppsApplication() {
		// TODO Auto-generated constructor stub
		// changes made by developer-1
	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.v("Application", "oncreate()");
		super.onCreate();
	}

	@Override
	public void onTerminate() {
		// TODO Auto-generated method stub
		Log.v("Application", "onTerminate()");
		super.onTerminate();
	}

}
