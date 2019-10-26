package com.example.mygallery;

public class ImageEntity {
	private final String title;
	private final String author;
	private final String place;
	private final String description;
	private final int image;

	ImageEntity(String title, String author, String place, String description, int image) {
		this.title = title;
		this.author = author;
		this.place = place;
		this.description = description;
		this.image = image;
	}

	String getTitle() {
		return title;
	}

	String getAuthor() {
		return author;
	}

	String getPlace() {
		return place;
	}

	String getDescription() {
		return description;
	}

	int getImage() {
		return image;
	}
}
