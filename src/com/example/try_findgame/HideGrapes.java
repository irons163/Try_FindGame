package com.example.try_findgame;

import com.example.try_gameengine.framework.Sprite;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;

public class HideGrapes extends HideObject{
	float xx;
	float yy;
	Context context;
	
	public HideGrapes(Context context) {
		super(BitmapUtil.grapes, BitmapUtil.grapes.getWidth(), BitmapUtil.grapes.getHeight(), false);
		// TODO Auto-generated constructor stub
		this.context = context;
		xx = MyMap.setImageXYByOldXY(100, 250).x;
		yy = MyMap.setImageXYByOldXY(100, 250).y;
		setPosition(MyMap.setImageXYByOldXY(100, 250).x, MyMap.setImageXYByOldXY(100, 250).y);
//		addWithLayerLevelIncrease(this, 1);
		createObjectLayerList();
	}

	protected void createObjectLayerList(){
		String s = FileUtil.readFileFromAssets(context, "111.txt");

		ImageInfo imageInfo = FileUtil.getImageInfo(s, "grapes", "grapes");
		int x = imageInfo.getX();
		int y = imageInfo.getY();
		int w = imageInfo.getW();
		int h = imageInfo.getH();
		int layer = imageInfo.getLayer();

		addWithLayerLevelIncrease(this, layer);
		
		MyMap.setInfo(w, h, BitmapUtil.grapes.getWidth(), BitmapUtil.grapes.getHeight());
		
		String object = "grapes";
		String[] parts = new String[]{"grapes"};
		Bitmap[] partBitmaps = new Bitmap[]{BitmapUtil.grapes};
//		for(int i = 0; i<partBitmaps.length; i++){
//			setPartLayer(s, object, parts[i], partBitmaps[i]);
//		}
	}
	public void setPartLayer(String s, String object, String part, Bitmap bitmap){
		ImageInfo imageInfo = FileUtil.getImageInfo(s, object, part);
		int x = imageInfo.getX();
		int y = imageInfo.getY();
		int w = imageInfo.getW();
		int h = imageInfo.getH();
		int layer = imageInfo.getLayer();
		int id = context.getResources().getIdentifier(part, "drawable", "com.example.try_findgame");
		bitmap = BitmapUtil.createSpecificSizeBitmap(context.getResources().getDrawable(id), MyMap.getWH(w, h).x, MyMap.getWH(w, h).y);
		PointF pointF = MyMap.setImageXYByOldXY(x, y);
		Sprite markPartLayer = new HideObject(bitmap, MyMap.getWH(w, h).x, MyMap.getWH(w, h).y, false);
		markPartLayer.setPosition(pointF.x+xx, pointF.y+yy);
		
		addWithLayerLevelIncrease(markPartLayer, layer);
	}
}
