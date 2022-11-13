package com.bptn.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bptn.models.ImageMetaData;


public interface FeedImageMetaDataRepository extends JpaRepository<ImageMetaData, String>{

	ImageMetaData findByImageID(String imageID);
	
	List <ImageMetaData> findByPostKey(String postkey);

	Optional<ImageMetaData> findByID(String imageID);


}
