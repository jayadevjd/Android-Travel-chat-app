package com.jd.quickChat;

import com.jd.chat.R;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;


public class Splash extends Activity{
	
	 private final int SPLASH_DISPLAY_LENGTH = 5000;

	    /** Called when the activity is first created. */
	    @Override
	    public void onCreate(Bundle icicle) {
	        super.onCreate(icicle);
	        setContentView(R.layout.splash_activity);
	       MediaPlayer mp = MediaPlayer.create(getBaseContext(), R.raw.sound); /*Gets your 
	        soundfile from res/raw/sound.ogg */
	        mp.start(); //Starts your sound

	        //Continue with your run/thread-code here
	        /* New Handler to start the Menu-Activity 
	         * and close this Splash-Screen after some seconds.*/
	        new Handler().postDelayed(new Runnable(){
	            @Override
	            public void run() {
	                /* Create an Intent that will start the Menu-Activity. */
	                Intent mainIntent = new Intent(Splash.this,LoggingIn.class);
	                Splash.this.startActivity(mainIntent);
	                Splash.this.finish();
	            }
	        }, SPLASH_DISPLAY_LENGTH);
	    }
}	
		
