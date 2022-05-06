package com.birdSanctuaryProject;

import java.util.HashSet;
import java.util.Set;

public class BirdRepository {
//	private List<Bird> birdList = new ArrayList();
	private Set<Bird> birdList = new HashSet<>();	

	private static BirdRepository instance;
	
	private BirdRepository() {
		
	}
	
	public static BirdRepository getInstance() {
		if(instance == null) {
			instance = new BirdRepository();
		}
		return instance;	
	}
	
	Set getBirdsList() {
		return birdList;
	}

	void addBirds(Bird bird) { // create functions
		birdList.add(bird);
	}

	void removeBirds(Bird bird) { 
		birdList.remove(bird);
	}

	Bird getBird(String birdId) {
		for (Bird bird : birdList) {
			if(bird.birdId.equalsIgnoreCase(birdId)) {
				return bird;
			}
		}
		return null;
	}
}