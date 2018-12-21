package com.techelevator.example;

import java.util.ArrayList;
import java.util.List;

public class MyEngineApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Engine> myList = new ArrayList<Engine>();
		
		MonsterTruckEngine monster = new MonsterTruckEngine(100);
		LawnMowerEngine mower = new LawnMowerEngine(1);
		TankEngine tank = new TankEngine(10);
		
        myList.add(monster);	
        myList.add(mower);
        myList.add(tank);
        
        for (Engine e : myList) {
        	   System.out.println(e.calculateHP());
        }
		

	}

}
