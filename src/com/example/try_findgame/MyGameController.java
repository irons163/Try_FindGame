package com.example.try_findgame;

import com.example.try_gameengine.framework.IGameModel;

import android.app.Activity;

public class MyGameController extends com.example.try_gameengine.framework.GameController{
	com.example.try_gameengine.framework.IGameModel myGameModel;
	MyGameView gameView;
	
	public MyGameController(Activity activity, IGameModel gameModel) {
		super(activity, gameModel);
//		this.gameModel = gameModel;
//		myGameModel = gameModel;
//		MyGameView gameView = new MyGameView(activity, this, gameModel);
//		activity.setContentView(gameView);
	}
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
//		gameModel.start();
		
		if(gameView==null){
			gameView = new MyGameView(activity, this, gameModel);
			activity.setContentView(gameView);
		}else{
			activity.setContentView(gameView);
//			gameModel.restart();
			
//			gameView = new GameView(activity, this, gameModel);
//			activity.setContentView(gameView);
		}
	}
	
	@Override
	public void runStart(){
//		gameModel.start();
		gameModel.restart();
	}
}
