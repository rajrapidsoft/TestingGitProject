package com.example.force;

import android.app.Activity;
import android.os.Bundle;

public class ForceStopHandleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	   System.out.println("changes inside the user-2");
	   System.out.println("SOUT added inside the rapid branch"); 	
    }
}