package com.example.spriteanimation;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.view.Menu;

public class MainActivity extends Activity {
	

    private ArrayList<Bitmap> bitmaps;
    private Animation animation;
    private CustomView view;
    

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		view = new CustomView(this);
		
		bitmaps = new ArrayList<Bitmap>();
		
		bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.bob01));
		bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.bob02));
		bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.bob03));
		bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.bob04));
		bitmaps.add(BitmapFactory.decodeResource(getResources(), R.drawable.bob05));
		
		animation = new Animation(bitmaps, 60);
		view.setAnimation(animation);
		setContentView(view);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
