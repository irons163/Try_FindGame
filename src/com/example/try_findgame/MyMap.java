package com.example.try_findgame;

import android.graphics.Point;
import android.graphics.PointF;
import android.widget.ImageView;

import com.example.try_gameengine.framework.CommonUtil;

public class MyMap {
	
	public static float totalX = 1;
	public static float totalY = 1;
	public static float displayX = 1;
	public static float displayY = 1;
	
	public static PointF setImageXYByOldXY(int oldX, int oldY) {
		float newX = (float) (oldX / totalX) * displayX;
		float newY = (float) (oldY / totalY) * displayY;
		// imageView.setX(convertPixelsToDp(newX, this));
		// imageView.setY(convertPixelsToDp(newY, this));
		// imageView.setX(convertDpToPixel(newX, this));
		// imageView.setY(convertDpToPixel(newY, this));
//		imageView.setX(newX);
//		imageView.setY(newY);
//		imageView.setLayoutParams(new LayoutParams(
//				(int) ((30 / 254.0) * displayX), (int) ((30 / 254.0) * displayY)));

		return new PointF(newX, newY);
		
		// imageView.setMaxHeight(5);
		// imageView.setMaxWidth(5);
		// imageView.setLeft((int)newX);
		// imageView.setTop((int)newY);
		// imageView.setRight((int)newX+17);
		// imageView.setBottom((int)newY+17);
	}
	
	public static Point getWH(int oldW, int oldH){
		Point point = new Point((int) ((oldW / totalX) * displayX), (int) ((oldH / totalY) * displayY));
		return point;
	}
	
	public static void setInfo(int orangeW, int orangeH, int displayW, int displayH){
		totalX = orangeW;
		totalY = orangeH;
		displayX = displayW;
		displayY = displayH;
	} 
}
