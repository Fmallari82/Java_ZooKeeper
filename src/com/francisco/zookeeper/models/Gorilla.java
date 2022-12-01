package com.francisco.zookeeper.models;

public class Gorilla extends Mammal {

	public Gorilla() {
		super(50);
	}
	
	public void throwSomething() {
		System.out.println("The gorilla has thrown something");
		super.setEnergyLevel(getEnergyLevel()-5);
		System.out.println("Gorilla arm is sore... New Energy Level: " + super.displayEnergy());
	}
	public void eatBananas() {
		System.out.println("Gorilla ate banana.. mmmm..");
		super.setEnergyLevel(getEnergyLevel()+10);
		System.out.println("Gaining power... New Energy Level: " + super.displayEnergy());
	}
	public void climb() {
		System.out.println("The gorilla is climbing the building");
		super.setEnergyLevel(getEnergyLevel()-10);
		System.out.println("Gorilla is tired from climbing... New Energy Level: " + super.displayEnergy());
	}
}
