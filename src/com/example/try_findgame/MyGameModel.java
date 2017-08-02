package com.example.try_findgame;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.MotionEvent;

import com.example.try_gameengine.framework.Data;
import com.example.try_gameengine.framework.LayerManager;

public class MyGameModel extends com.example.try_gameengine.framework.GameModel implements IRemoveObject{

	public MyGameModel(Context context, Data data, int level) {
		super(context, data);
		// TODO Auto-generated constructor stub
		if(level==1){
			BackgroundObject backgroundObject = new BackgroundChair02(context);
//			HideObject hideObject = new HideLemon();
		}else if(level==2){
			BackgroundObject backgroundObject = new BackgroundChair03(context);
			HideObject hideObject = new HideLemon(context);
		}
		
	}

	
	
	@Override
	public void onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		super.onTouchEvent(event);
	}



	@Override
	protected void process() {
		// TODO Auto-generated method stub
		super.process();
	}



	@Override
	protected void doDraw(Canvas canvas) {
		// TODO Auto-generated method stub
//		super.doDraw(canvas);
		drawBackGroundObject(canvas);
	}

	private void drawBackGround(){
		
	}
	
	private void drawBackGroundObject(Canvas canvas){
		Paint paint = new Paint();
		paint.setColor(Color.BLUE);
//		canvas.drawColor(Color.WHITE);
		LayerManager.getInstance().drawLayers(canvas, paint);
	}

	@Override
	public void removeObject() {
		// TODO Auto-generated method stub
		
	}

}
