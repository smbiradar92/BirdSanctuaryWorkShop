package com.birdSanctuaryProject;

public class Parrot extends Bird {
	public Parrot() {
		color = color.GREEN;
		name = "Parrot";
	}

	public void Eat() {							
		System.out.println("Parrot eats chilli");
	}
	
	public void Fly() {
		System.out.println("Ostrich can't fly");
	}

}