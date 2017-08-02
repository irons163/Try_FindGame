package com.example.try_findgame;

import com.example.try_gameengine.framework.CommonUtil;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		DisplayMetrics dm = new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(dm);
		
		CommonUtil.screenHeight = dm.heightPixels;
		CommonUtil.screenWidth = dm.widthPixels;
		BitmapUtil.initBitmap(this);
		MyMap.totalX = 480;
		MyMap.totalY = 800;
		MyMap.displayX = CommonUtil.screenWidth;
		MyMap.displayY = CommonUtil.screenHeight;
		BitmapUtil.chair02_1 = BitmapUtil.createSpecificSizeBitmap(getResources().getDrawable(R.drawable.chair02_1), MyMap.getWH(357, 600).x, MyMap.getWH(357, 600).y);
		
		Button button = (Button)findViewById(R.id.button1);
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this, GameActivity.class));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
