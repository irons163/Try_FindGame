package com.example.try_findgame;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.example.try_gameengine.framework.Sprite;

public class MyData extends com.example.try_gameengine.framework.Data {
	private List<Sprite> allExistPoints;
	
	public MyData() {
		// TODO Auto-generated constructor stub
		allExistPoints = new ArrayList<Sprite>();
	}

	public Object getAllExistPoints() {
		return allExistPoints;
	}

	public void setAllExistPoints(Object allExistPoints) {
		this.allExistPoints = (List<Sprite>) allExistPoints;
	}
	
	public Iterator<Sprite> getAllExistPointsIterator(){
		return allExistPoints.iterator();
	}
	
	public void addSprite(Sprite sprite){
		allExistPoints.add(sprite);
	}
}
