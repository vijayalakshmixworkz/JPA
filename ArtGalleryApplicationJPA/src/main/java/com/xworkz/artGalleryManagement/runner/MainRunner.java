package com.xworkz.artGalleryManagement.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.xworkz.artGalleryManagement.entity.ArtGalleryEntity;
import com.xworkz.artGalleryManagement.service.ArtGalleryService;
import com.xworkz.artGalleryManagement.service.ArtGalleryServiceImpl;

public class MainRunner {
	public static void main(String[] args) {
		ArtGalleryEntity artGalleryEntity = new ArtGalleryEntity("Home Without Windows", "Chethan", "Rakshith Shetty",
				LocalDate.of(2023, 10, 19), LocalDateTime.of(2023, 10, 2, 10, 23), 190000.75f, 2500000L, true,
				"ART089");

		ArtGalleryService service = new ArtGalleryServiceImpl();
		service.save(artGalleryEntity);
	}
}