package com.francisco.zookeeper;

import com.francisco.zookeeper.models.Gorilla;

public class GorillaTest {

	public static void main(String[] args) {
		Gorilla gorilla = new Gorilla();
		
		System.out.println("Energy level: " + gorilla.displayEnergy());
		gorilla.throwSomething();
		gorilla.throwSomething();
		gorilla.throwSomething();		System.out.println("Energy level: " + gorilla.displayEnergy());
		gorilla.eatBananas();
		gorilla.eatBananas();
		gorilla.climb();
	}

}
