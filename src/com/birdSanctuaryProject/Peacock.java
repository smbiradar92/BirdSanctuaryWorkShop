package com.birdSanctuaryProject;

public class Peacock extends Bird {
	public Peacock() {
		name = "Peacock";
		color = color.BLUE;
	}

	public void Eat() {							
		System.out.println("Parrot eats chilli");
	}

	public void Fly() {
		System.out.println("Peacock can fly");
	}

	@Override
	public String toString() {
		return "Peacock [name=" + name + ", color=" + color
				+ ", birdId=" + birdId + "]";
	}

}
