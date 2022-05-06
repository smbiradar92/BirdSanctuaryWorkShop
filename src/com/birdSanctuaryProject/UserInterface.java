package com.birdSanctuaryProject;

import java.util.Scanner;
import java.util.Set;

public class UserInterface {

	private static UserInterface userInstance;

	public static UserInterface getUserInstance() {
		if (userInstance == null) {
			userInstance = new UserInterface();
		}
		return userInstance;
	}

	void print(Set<Bird> Birds) {
		for (Bird bird : Birds) {
			System.out.println(bird);
		}
	}

	void printAllFlyableBirds(Set<Bird> birds) {
		for (Bird bird : birds) {
			bird.Fly();
		}

	}

	int showMainMenu() {
		System.out.println(
				"Please select from the below options:\n 1.Add new bird \n 2.Delete bird \n 3.update bird \n 4.Print birds \n 5.Exit");
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		return option;
	}
}
