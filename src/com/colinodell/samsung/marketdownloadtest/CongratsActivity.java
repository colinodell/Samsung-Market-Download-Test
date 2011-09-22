package com.colinodell.samsung.marketdownloadtest;

import android.app.Activity;
import android.graphics.PixelFormat;
import android.os.Bundle;
import android.view.Window;

public class CongratsActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
    
    @Override
    public void onAttachedToWindow() {
    	super.onAttachedToWindow();
    	Window window = getWindow();
    	window.setFormat(PixelFormat.RGBA_8888);
    }

}