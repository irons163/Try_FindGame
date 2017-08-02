package com.example.try_findgame;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

public class BitmapUtil {
	
	static Context context;
	
	public static Bitmap redPoint;
	public static Bitmap greenPoint;
	public static Bitmap blackPoint;
	public static Bitmap whitePoint;
	public static Bitmap bluePoint;
	
	public static Bitmap chair02;
	public static Bitmap chair02_1;
	public static Bitmap chair02_2;
	public static Bitmap chair02_3;
	public static Bitmap chair02_4;
	public static Bitmap lemon;
	public static Bitmap grapes;
	public static Bitmap orange;
	public static Bitmap watermelon;
	
	public static void initBitmap(Context context){
		BitmapUtil.context = context;
		initBitmap();
	}
	
	private static void initBitmap(){
//		redPoint = BitmapFactory.decodeResource(context.getResources(), R.drawable.red_point, null);
//		greenPoint = BitmapFactory.decodeResource(context.getResources(), 
//				R.drawable.green_point);
//		blackPoint = BitmapFactory.decodeResource(context.getResources(), 
//				R.drawable.black_point);
//		whitePoint = BitmapFactory.decodeResource(context.getResources(), 
//				R.drawable.white_point);
//		bluePoint = createSpecificSizeBitmap(context.getResources().getDrawable(R.drawable.blue_point), 200, 200);
	
		chair02 = BitmapFactory.decodeResource(context.getResources(), R.drawable.chair02, null);
		chair02_1 = BitmapFactory.decodeResource(context.getResources(), 
				R.drawable.chair02_1);
		chair02_2 = BitmapFactory.decodeResource(context.getResources(), 
				R.drawable.chair02_2);
		chair02_3 = BitmapFactory.decodeResource(context.getResources(), 
				R.drawable.chair02_3);
		chair02_4 = BitmapFactory.decodeResource(context.getResources(), 
				R.drawable.chair02_4);
		lemon = BitmapFactory.decodeResource(context.getResources(), 
				R.drawable.lemon);
		grapes = BitmapFactory.decodeResource(context.getResources(), 
				R.drawable.grapes);
		orange = BitmapFactory.decodeResource(context.getResources(), 
				R.drawable.orange);
		watermelon = BitmapFactory.decodeResource(context.getResources(), 
				R.drawable.waternelon);
		
	}
	
	// ��l�Ʀn������I
	public static Bitmap createSpecificSizeBitmap(Drawable drawable, int width, int height) {
		// �s�ؤ@��bitmap�A���e20�A�ϥ�ARGB_8888�]�w�A��bitmap�{�b�ť�bitmap���Dnull�C
		Bitmap bitmap = Bitmap.createBitmap(width, height,
				Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(bitmap); // �s�صe���A�Ϊť�bitmap��e��
		drawable.setBounds(0, 0, width, height);// �]�wdrawable�����(��Ϥ����ۤv�����e)
		drawable.draw(canvas); // �b�e���W�e�W��drawable(����bitmap�w�g�Q�e�W�F��A���O�ťդF)
		return bitmap;
	}
	
}
