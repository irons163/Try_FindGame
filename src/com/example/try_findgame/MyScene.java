package com.example.try_findgame;

import android.app.Activity;
import android.content.Context;
import android.telephony.gsm.GsmCellLocation;

import com.example.try_gameengine.framework.IGameController;
import com.example.try_gameengine.IGameModel;
import com.example.try_gameengine.scene.Scene;


public class MyScene extends Scene{

	
	
	public MyScene(Context context, String id, int level) {
		super(context, id, level);
		// TODO Auto-generated constructor stub
//		this.level = level;
	}

	@Override
	public void initGameModel() {
		// TODO Auto-generated method stub
		gameModel = (com.example.try_gameengine.framework.IGameModel) new MyGameModel(context, null, level);
	}

	@Override
	public void initGameController() {
		// TODO Auto-generated method stub
		gameController = (IGameController) new MyGameController((Activity)context, (com.example.try_gameengine.framework.IGameModel) gameModel);
	}

}
