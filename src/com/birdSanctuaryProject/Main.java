package com.birdSanctuaryProject;

import java.util.Scanner;
import java.util.Set;

import com.birdSanctuaryProject.Bird.Color;

public class Main {

//	BirdRepositor birdRepo = BirdRepositor.createSingleObject();
	
	public static void main(String[] args) {

		System.out.println("Welcome to Birds Sanctuary!!!");

		UserInterface userInterface = new UserInterface();
		Main main = new Main();

		int option = 0;
		while (option != 5) {
			option = userInterface.showMainMenu();
			main.handleUserSelection(option);
		}

//		
//		BirdRepositor birdRepo = new BirdRepositor(); // calling in main

//		UserInterface userInterface = new UserInterface();
//		userInterface.print(birdRepo.getBirdsList());
//
//		birdRepo.removeBirds(duck);
//		birdRepo.removeBirds(parrot1);
//		System.out
//				.println("\n"
//						+ "=========Printing the Birds after Removal===========\n");
//		userInterface.print(birdRepo.getBirdsList());
	}

	public void addBird() {

//		Duck duck = new Duck();
//		duck.birdId = "d001";
//		Parrot parrot = new Parrot();
//		parrot.birdId = "d002";
//		Parrot parrot1 = new Parrot();
//		parrot1.birdId = "d002";
//		Peacock peacock = new Peacock();
//		peacock.birdId = "d003";
//		Ostrich ostrich = new Ostrich();
//		ostrich.birdId = "d004";
//		Penguin penguin = new Penguin();
//		penguin.birdId = "d005";
//
//		birdRepo.addBirds(duck);
//		birdRepo.addBirds(ostrich);
//		birdRepo.addBirds(peacock);
//		birdRepo.addBirds(parrot1);
//		birdRepo.addBirds(parrot);
//		birdRepo.addBirds(penguin);
		
		BirdRepository birdRepo = BirdRepository.getInstance();
		Scanner sc = new Scanner(System.in);
		Bird bird = new Bird();

		System.out.println(" Please enter the bird ID");
		String birdID = sc.next();
		bird.setBirdId(birdID);

		System.out.println(" Please enter the bird name");
		String birdName = sc.next();
		bird.setName(birdName);

		System.out.println(
				" Please select the bird color from below options:\n1. BLACK, \t2. WHITE, \n3. GREEN, \t4. BLACK_WHITE, \n5. GREY, \t6.BLUE");
		int options = sc.nextInt();
		switch (options) {
		case 1:
			System.out.println(
					"You have seleted to set bird color as Black");
			bird.setColor(Color.BLACK);
			break;
		case 2:
			System.out.println(
					"You have seleted to set bird color as white");
			bird.setColor(Color.WHITE);
			break;
		case 3:
			System.out.println(
					"You have seleted to set bird color as green");
			bird.setColor(Color.GREEN);
			break;
		case 4:
			System.out.println(
					"You have seleted to set bird color as Black_white");
			bird.setColor(Color.BLACK_WHITE);
			break;
		case 5:
			System.out.println(
					"You have seleted to set bird color as grey");
			bird.setColor(Color.GREY);
			break;
		}
		System.out.println("Bird color set successfully");

		birdRepo.addBirds(bird);
	}

	public void deleteBird() {

		BirdRepository birdRepo = BirdRepository.getInstance();
		System.out.println(
				"Please enter the bird ID of the bird to be removed");
		Scanner s = new Scanner(System.in);
		String birdId = s.next();
		Bird bird = birdRepo.getBird(birdId);
		birdRepo.removeBirds(bird);
		System.out.println("The bird " + bird
				+ " is removed successfully");
	}

	public void updateBird() {
		BirdRepository birdRepo = BirdRepository.getInstance();
		System.out.println(
				"Please enter the bird ID of the bird to be updated");
		Scanner sc = new Scanner(System.in);
		String birdId = sc.next();
		Bird bird = birdRepo.getBird(birdId);
		if (birdId.equalsIgnoreCase(birdId)) {
			System.out.println(
					"Bird found in the list\nPlease enter the below details to update in the bird list");
			System.out.println(" Please enter the bird ID");
			String birdID = sc.next();
			bird.setBirdId(birdID);

			System.out
					.println(" Please enter the bird name");
			String birdName = sc.next();
			bird.setName(birdName);

			System.out.println(
					" Please select the bird color from below options:\n1. BLACK, \t2. WHITE, \n3. GREEN, \t4. BLACK_WHITE, \n5. GREY, \t6.BLUE");
			int options = sc.nextInt();
			switch (options) {
			case 1:
				System.out.println(
						"You have seleted to set bird color as Black");
				bird.setColor(Color.BLACK);
				break;
			case 2:
				System.out.println(
						"You have seleted to set bird color as white");
				bird.setColor(Color.WHITE);
				break;
			case 3:
				System.out.println(
						"You have seleted to set bird color as green");
				bird.setColor(Color.GREEN);
				break;
			case 4:
				System.out.println(
						"You have seleted to set bird color as Black_white");
				bird.setColor(Color.BLACK_WHITE);
				break;
			case 5:
				System.out.println(
						"You have seleted to set bird color as grey");
				bird.setColor(Color.GREY);
				break;
			}
			System.out
					.println("Bird color set successfully");

			birdRepo.addBirds(bird);
		}

	}

	public void handleUserSelection(int option) {

		BirdRepository birdRepo = BirdRepository.getInstance();
		UserInterface user = new UserInterface();
		switch (option) {
		case 1:
			System.out.println(
					"<============Adding bird to the Repository==============>");
			addBird();
			break;
		case 2:
			System.out.println(
					"<============Delete a bird from the Repository==============>");
			deleteBird();
			break;
		case 3:
			System.out.println(
					"<============Update a bird from the Repository==============>");
			updateBird();
			break;
		case 4:
			System.out.println(
					"<============printing birds from the Repository==============>");
			Set<Bird> birdSet = birdRepo.getBirdsList();
			user.print(birdSet);
			break;
		case 5:
			System.out.println(
					"<============Exiting from the Bird Repository==============>\n Thankyou, Have a nyc day");
			break;
		}
	}
}
