package com.francisco.zookeeper.models;

public class Mammal {
	//attributes
	private int energyLevel;
	
	//constructor
	public Mammal() {}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	//getters and setters
	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	//methods
	public int displayEnergy() {
		return this.energyLevel;
	}
	

}
