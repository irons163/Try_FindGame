package com.example.try_findgame;

import android.os.Bundle;
import android.view.MotionEvent;

import com.example.try_gameengine.framework.BaseInitActivity;
import com.example.try_gameengine.framework.LayerManager;
import com.example.try_gameengine.scene.Scene;
import com.example.try_gameengine.scene.SceneManager;

public class GameActivity extends BaseInitActivity{
	private MyGameModel gameModel;
	private MyGameController gameController;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		
		LayerManager.setLayerBySenceIndex(0);
		Scene scene = new MyScene(this, "a", 1);
		LayerManager.setLayerBySenceIndex(1);
		Scene scene2 = new MyScene(this, "b", 2);
		
		SceneManager.addScene(scene);
		SceneManager.addScene(scene2);
		
		SceneManager.startScene(0);
		
//		LayerManager.initLayerManager();
//		LayerManager.setLayerBySenceIndex(1);
		
		
	}

	
	
//	@Override
//	protected void initGameModel() {
//		// TODO Auto-generated method stub
//		gameModel = new MyGameModel(this, new MyData());
////		gameModel.setData(new MyData());
//	}
//
//
//
//	@Override
//	protected void initGameController() {
//		// TODO Auto-generated method stub
//		gameController = new MyGameController(this, gameModel);
//	}



	@Override
	protected void initCommonUtil() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return true;
	}



	@Override
	protected void initBitmapUtil() {
		// TODO Auto-generated method stub
//		BitmapUtil.initBitmap(this);
	}
	
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
//		SceneManager.next();
		SceneManager.previous();
	}
}
