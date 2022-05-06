package com.birdSanctuaryProject;

import java.util.Objects;

public class Bird {
	enum Color{BLACK, WHITE, GREEN, BLACK_WHITE, GREY, BLUE}

	@Override
	public int hashCode() {
		return Objects.hash(birdId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bird other = (Bird) obj;
		return Objects.equals(birdId, other.birdId);
	}
	String name;
	Color color;
	String birdId;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color black) {
		this.color = black;
	}
	public String getBirdId() {
		return birdId;
	}
	public void setBirdId(String birdId) {
		this.birdId = birdId;
	}
	public void Eat() {						
		System.out.println("Parrot eats");
	}
	public void Fly() {
		System.out.println("Parrots can fly");
	}
	@Override
	public String toString() {
		return "Bird [name=" + name + ", color=" + color
				+ ", birdId=" + birdId + "]";
	}
	
}
