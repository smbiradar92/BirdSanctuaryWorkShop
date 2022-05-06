package com.birdSanctuaryProject;

public class Penguin extends Bird {

	public Penguin() {

		String name = "Penguin";
		color = color.BLACK_WHITE;
		String food = "fish";
	}

	public void fly() {
		System.out.println("The " + name + " dont fly");
	}

	public void eat() {
		System.out.println("The " + name + " eats food");

	}

	@Override
	public String toString() {
		return "Penguin [name=" + name + ", color=" + color
				+ "]";
	}

}
