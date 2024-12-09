package com.xworkz.artGalleryManagement.service;

import com.xworkz.artGalleryManagement.entity.ArtGalleryEntity;
import com.xworkz.artGalleryManagement.repository.ArtGalleryRepo;
import com.xworkz.artGalleryManagement.repository.ArtGalleryRepoImpl;

public class ArtGalleryServiceImpl implements ArtGalleryService {

	@Override
	public boolean save(ArtGalleryEntity artGalleryEntity) {
		System.out.println("ArtGalleryEntity :"+artGalleryEntity.toString());
		ArtGalleryRepo artGalleryRepo=new ArtGalleryRepoImpl();
		artGalleryRepo.save(artGalleryEntity);
		return false;
	}

	

}
