package com.example.try_findgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;

import com.example.try_gameengine.framework.CommonUtil;
import com.example.try_gameengine.framework.Sprite;

public class BackgroundChair02 extends BackgroundObject{
	float xx;
	float yy;
	Context context;
	public BackgroundChair02(Context context) {
		super(BitmapUtil.chair02_1, BitmapUtil.chair02_1.getWidth(), BitmapUtil.chair02_1.getHeight(), false);
		addWithLayerLevelIncrease(this, 2);
		// TODO Auto-generated constructor stub
		this.context = context;
		xx = MyMap.setImageXYByOldXY(100, 100).x;
		yy = MyMap.setImageXYByOldXY(100, 100).y;
		setPosition(MyMap.setImageXYByOldXY(100, 100).x, MyMap.setImageXYByOldXY(100, 100).y);
		createObjectLayerList();
	}

	@Override
	protected void createObjectLayerList(){
//		Sprite mainPartLayer = new BackgroundObject(bitmap, w, h, true);
		MyMap.totalX = 357;
		MyMap.totalY = 600;
		MyMap.displayX = BitmapUtil.chair02_1.getWidth();
		MyMap.displayY = BitmapUtil.chair02_1.getHeight();
		
//		MyMap.totalX = 480;
//		MyMap.totalY = 800;
		
		BitmapUtil.chair02_2 = BitmapUtil.createSpecificSizeBitmap(context.getResources().getDrawable(R.drawable.chair02_2), MyMap.getWH(41, 181).x, MyMap.getWH(41, 181).y);
		PointF pointF = MyMap.setImageXYByOldXY(3, 364);
		Sprite markPartLayer = new BackgroundObject(BitmapUtil.chair02_2, MyMap.getWH(41, 181).x, MyMap.getWH(41, 181).y, false);
		markPartLayer.setPosition(pointF.x+xx, pointF.y+yy);
		
		Point point = MyMap.getWH(42, 193);
		BitmapUtil.chair02_3 = BitmapUtil.createSpecificSizeBitmap(context.getResources().getDrawable(R.drawable.chair02_3), MyMap.getWH(42, 193).x, MyMap.getWH(42, 193).y);
		pointF = MyMap.setImageXYByOldXY(180, 405);
		Sprite markPartLayer2 = new BackgroundObject(BitmapUtil.chair02_3, MyMap.getWH(42, 193).x, MyMap.getWH(42, 193).y, false);
		markPartLayer2.setPosition(pointF.x+xx, pointF.y+yy);
		
		BitmapUtil.chair02_4 = BitmapUtil.createSpecificSizeBitmap(context.getResources().getDrawable(R.drawable.chair02_4), MyMap.getWH(56, 197).x, MyMap.getWH(56, 197).y);
		pointF = MyMap.setImageXYByOldXY(300, 322);
		Sprite markPartLayer3 = new BackgroundObject(BitmapUtil.chair02_4, MyMap.getWH(56, 197).x, MyMap.getWH(56, 197).y, false);
		markPartLayer3.setPosition(pointF.x+xx, pointF.y+yy);
		
//		addWithLayerLevelIncrease(markPartLayer, 2);
//		addWithLayerLevelIncrease(markPartLayer2, 4);
//		addWithLayerLevelIncrease(markPartLayer3, 2);
		
		addWithLayerLevel(markPartLayer, 2);
		addWithLayerLevel(markPartLayer2, 4);
		addWithLayerLevel(markPartLayer3, 2);
	}
}
