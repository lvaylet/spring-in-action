package com.sia.soundsystem;

import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

	private String title = "Sgt. Pepper's Lonely Heart Club Band";
	private String artist = "The Beatles";

	@Override
	public void play() {
		System.out.println("Playing " + this.title + " by " + this.artist);
	}

}
