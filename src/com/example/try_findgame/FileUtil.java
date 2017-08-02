package com.example.try_findgame;

import java.io.IOException;
import java.io.InputStream;

import org.json.JSONException;
import org.json.JSONObject;

import android.content.Context;

public class FileUtil {
	
	public static String readFileFromAssets(Context context, String fileName){
		 byte b[] = new byte[1024];
		 int len = 0;
		try {
			InputStream inputStream = context.getResources().getAssets().open(fileName);
			 
		          
		        int temp=0;         
		        while((temp=inputStream.read())!=-1){   
		            b[len]=(byte)temp;  
		            len++;  
		        }  
		        inputStream.close();  
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = new String(b,0,len);
		return s;
	}
	
	public static ImageInfo getImageInfo(String txt, String object, String part){
		int x = 0;
		int y = 0;
		int w = 0;
		int h = 0;
		int layer = 0;
		try {
			JSONObject jo= new JSONObject(txt);
			jo = jo.getJSONObject(object);
			jo = jo.getJSONObject(part);
			x = jo.getInt("x");
			y = jo.getInt("y");;
			w = jo.getInt("w");
			h = jo.getInt("h");
			layer = jo.getInt("layer");
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new ImageInfo(x, y, w, h, layer);
	}
	
}

