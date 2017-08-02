package com.example.try_findgame;

import android.content.Context;
import android.view.MotionEvent;

import com.example.try_gameengine.framework.IGameModel;

public class MyGameView extends com.example.try_gameengine.framework.GameView{
//	private Data data;
	MyGameController gameController;
	public MyGameView(Context context, MyGameController gameController,
			IGameModel gameModel) {
		super(context, gameController, gameModel);
		// TODO Auto-generated constructor stub
//		data = gameModel.getData();
		this.gameController = gameController;
	}

	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		return true;
	}
}
