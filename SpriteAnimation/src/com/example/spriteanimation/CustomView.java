package com.example.spriteanimation;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceView;
import android.view.View;

public class CustomView extends View{
	
    private Animation animation;

	public CustomView(Context context) {
		super(context);
		
		
	}
	@Override
	public void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		canvas.drawColor(Color.BLACK);
		canvas.drawBitmap(animation.getCurrentFrame(), 300, 200, new Paint());
		animation.update();
		try {
			Thread.sleep(animation.animationTime());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.postInvalidate();
	}

	
	public void setAnimation(Animation animation)
	{
		this.animation = animation;
	}

}
