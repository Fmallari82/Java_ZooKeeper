package com.francisco.zookeeper;

import com.francisco.zookeeper.models.Bat;

public class BatTest {

	public static void main(String[] args) {
		Bat bat = new Bat();
		
		System.out.println("Energy Level: " + bat.displayEnergy());
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.eatHumans();
		bat.eatHumans();
		bat.fly();
		bat.fly();
	}

}
