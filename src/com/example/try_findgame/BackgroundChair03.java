package com.example.try_findgame;

import java.io.IOException;
import java.io.InputStream;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.PointF;
import android.util.JsonReader;

import com.example.try_gameengine.framework.CommonUtil;
import com.example.try_gameengine.framework.Sprite;

public class BackgroundChair03 extends BackgroundObject{
	float xx;
	float yy;
	Context context;
	public BackgroundChair03(Context context) {
		super(BitmapUtil.chair02_1, BitmapUtil.chair02_1.getWidth(), BitmapUtil.chair02_1.getHeight(), false);
		
		// TODO Auto-generated constructor stub
		this.context = context;
		xx = MyMap.setImageXYByOldXY(10, 10).x;
		yy = MyMap.setImageXYByOldXY(10, 10).y;
		setPosition(MyMap.setImageXYByOldXY(10, 10).x, MyMap.setImageXYByOldXY(10, 10).y);
		createObjectLayerList();
	}

	@Override
	protected void createObjectLayerList(){
		String s = FileUtil.readFileFromAssets(context, "111.txt");

		ImageInfo imageInfo = FileUtil.getImageInfo(s, "chair02", "chair02_1");
		int x = imageInfo.getX();
		int y = imageInfo.getY();
		int w = imageInfo.getW();
		int h = imageInfo.getH();
		int layer = imageInfo.getLayer();
//		MyMap.totalX = 357;
//		MyMap.totalY = 600;
//		MyMap.displayX = BitmapUtil.chair02_1.getWidth();
//		MyMap.displayY = BitmapUtil.chair02_1.getHeight();
		addWithLayerLevelIncrease(this, layer);
		
		MyMap.setInfo(w, h, BitmapUtil.chair02_1.getWidth(), BitmapUtil.chair02_1.getHeight());
		
		String object = "chair02";
		String[] parts = new String[]{"chair02_2", "chair02_3", "chair02_4"};
		Bitmap[] partBitmaps = new Bitmap[]{BitmapUtil.chair02_2, BitmapUtil.chair02_3, BitmapUtil.chair02_4};
		for(int i = 0; i<partBitmaps.length; i++){
			setPartLayer(s, object, parts[i], partBitmaps[i]);
		}
		
//		imageInfo = FileUtil.getImageInfo(s, "chair02", "chair02_2");
//		x = 0;
//		y = 0;
//		w = 0;
//		h = 0;
//		try {
//			JSONObject jo= new JSONObject(s);
//			jo = jo.getJSONObject("chair02");
//			jo = jo.getJSONObject("chair02_2");
//			x = jo.getInt("x");
//			y = jo.getInt("y");;
//			w = jo.getInt("w");
//			h = jo.getInt("h");
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		BitmapUtil.chair02_2 = BitmapUtil.createSpecificSizeBitmap(context.getResources().getDrawable(R.drawable.chair02_2), MyMap.getWH(w, h).x, MyMap.getWH(w, h).y);
//		PointF pointF = MyMap.setImageXYByOldXY(x, y);
//		Sprite markPartLayer = new BackgroundObject(BitmapUtil.chair02_2, MyMap.getWH(w, h).x, MyMap.getWH(w, h).y, false);
//		markPartLayer.setPosition(pointF.x+xx, pointF.y+yy);
//		
//		x = 0;
//		y = 0;
//		w = 0;
//		h = 0;
//		try {
//			JSONObject jo= new JSONObject(s);
//			jo = jo.getJSONObject("chair02");
//			jo = jo.getJSONObject("chair02_3");
//			x = jo.getInt("x");
//			y = jo.getInt("y");;
//			w = jo.getInt("w");
//			h = jo.getInt("h");
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		BitmapUtil.chair02_3 = BitmapUtil.createSpecificSizeBitmap(context.getResources().getDrawable(R.drawable.chair02_3), MyMap.getWH(w, h).x, MyMap.getWH(w, h).y);
//		pointF = MyMap.setImageXYByOldXY(x, y);
//		Sprite markPartLayer2 = new BackgroundObject(BitmapUtil.chair02_3, MyMap.getWH(w, h).x, MyMap.getWH(w, h).y, false);
//		markPartLayer2.setPosition(pointF.x+xx, pointF.y+yy);
//		
//		x = 0;
//		y = 0;
//		w = 0;
//		h = 0;
//		try {
//			JSONObject jo= new JSONObject(s);
//			jo = jo.getJSONObject("chair02");
//			jo = jo.getJSONObject("chair02_4");
//			x = jo.getInt("x");
//			y = jo.getInt("y");;
//			w = jo.getInt("w");
//			h = jo.getInt("h");
//		} catch (JSONException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		BitmapUtil.chair02_4 = BitmapUtil.createSpecificSizeBitmap(context.getResources().getDrawable(R.drawable.chair02_4), MyMap.getWH(w, h).x, MyMap.getWH(w, h).y);
//		pointF = MyMap.setImageXYByOldXY(x, y);
//		Sprite markPartLayer3 = new BackgroundObject(BitmapUtil.chair02_4, MyMap.getWH(w, h).x, MyMap.getWH(w, h).y, false);
//		markPartLayer3.setPosition(pointF.x+xx, pointF.y+yy);
//		
////		LayerManager.insertLayer(b, this);
//		addWithLayerLevelIncrease(markPartLayer, 2);
//		addWithLayerLevelIncrease(markPartLayer2, 4);
//		addWithLayerLevelIncrease(markPartLayer3, 2);
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
		Sprite markPartLayer = new BackgroundObject(bitmap, MyMap.getWH(w, h).x, MyMap.getWH(w, h).y, false);
		markPartLayer.setPosition(pointF.x+xx, pointF.y+yy);
		
		addWithLayerLevelIncrease(markPartLayer, layer);
	}
}
