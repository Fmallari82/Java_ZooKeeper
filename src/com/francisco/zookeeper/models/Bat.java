package com.francisco.zookeeper.models;

public class Bat extends Mammal{
	//attributes
	public Bat() {
		super(300);
	}
	public void fly() {
		System.out.println("**Echo supersonic sound wave blast**");
		super.setEnergyLevel(getEnergyLevel()-50);
		System.out.println("Bat's voice is hurting... New Energy Level: " + super.displayEnergy());
	}
	
	
	public void eatHumans() {
		System.out.println("Draining blood from hooman....");
		super.setEnergyLevel(getEnergyLevel()+25);
		System.out.println("Delicious blood... New Energy Level: " + super.displayEnergy());
	}
	
	public void attackTown() {
		System.out.println("Destroying city...");
		super.setEnergyLevel(getEnergyLevel()-100);
		System.out.println("Destroying cities is hard work... New Energy Level: " + super.displayEnergy());
	}

}
