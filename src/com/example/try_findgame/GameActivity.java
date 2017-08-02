package com.example.try_findgame;

import android.os.Bundle;
import android.view.MotionEvent;

import com.example.try_gameengine.framework.LayerManager;
import com.example.try_gameengine.scene.Scene;
import com.example.try_gameengine.scene.SceneManager;
import com.example.try_gameengine.stage.Stage;

public class GameActivity extends Stage{
	private MyGameModel gameModel;
	private MyGameController gameController;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		setContentView(R.layout.activity_main);
		
		initStage();
		
		gameModel = new MyGameModel(this, null, 1);
		gameController = new MyGameController(this, gameModel);
		MyGameView gameView = new MyGameView(this, gameController, gameModel);
		setContentView(gameView);
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
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		super.onBackPressed();
//		SceneManager.next();
		getSceneManager().previousWithExistedScenes();
	}



	@Override
	public SceneManager initSceneManager() {
		LayerManager.getInstance().setLayerBySenceIndex(0);
		Scene scene = new MyScene(this, "a", 1);
		LayerManager.getInstance().setLayerBySenceIndex(1);
		Scene scene2 = new MyScene(this, "b", 2);
		
		SceneManager sceneManager = SceneManager.getInstance();
		sceneManager.addScene(scene);
		sceneManager.addScene(scene2);
		
		sceneManager.startScene(0);
		return sceneManager;
	}
}
