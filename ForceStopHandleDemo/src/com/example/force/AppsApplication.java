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

// Conflicting commit done //

public class AppsApplication extends Application implements ComponentCallbacks {


	public AppsApplication() {
		// Changed made by Rajiv, on 05-02-2012 and the day was as monday....again I changed this line as the owner...changes...changes1..this is Rajiv
		// One more line added----
				// One more line added----added another word...added 2 end...............this change must from rajiv

	}

	@Override
	public void onCreate() {
		// TODO Auto-generated method stub
		Log.v("Application", "oncreate()");Log.v("Application", "oncreate()");
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
