package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "\"ImageMetaData\"")
public class ImageMetaData {

	@Id
	@Column(name = "\"imageID\"")
	private String imageID;
	
	@Column(name = "\"imageName\"")
	private String imageName;
	
	@Column(name = "\"imageFormat\"")
	private String imageFormat;
	
	@Column(name = "\"imageDate\"")
	private String imageDate;
	
	@Column(name = "\"resolution\"")
	private String resolution;
	
	@Column(name = "\"postKey\"")
	private String postKey;
	
	@Column(name = "\"imageSize\"")
	private String imageSize;
	
	public ImageMetaData() {
		super();
	}

	public ImageMetaData(String imageID, String imageName, String imageFormat, String imageDate, String resolution,
			String postKey, String imageSize) {
		super();
		this.imageID = imageID;
		this.imageName = imageName;
		this.imageFormat = imageFormat;
		this.imageDate = imageDate;
		this.resolution = resolution;
		this.postKey = postKey;
		this.imageSize = imageSize;
	}

	public String getImageID() {
		return imageID;
	}

	public void setImageID(String imageID) {
		this.imageID = imageID;
	}

	public String getImageName() {
		return imageName;
	}

	public void setImageName(String imageName) {
		this.imageName = imageName;
	}

	public String getImageFormat() {
		return imageFormat;
	}

	public void setImageFormat(String imageFormat) {
		this.imageFormat = imageFormat;
	}

	public String getImageDate() {
		return imageDate;
	}

	public void setImageDate(String imageDate) {
		this.imageDate = imageDate;
	}

	public String getResolution() {
		return resolution;
	}

	public void setResolution(String resolution) {
		this.resolution = resolution;
	}

	public String getPostKey() {
		return postKey;
	}

	public void setPostKey(String postKey) {
		this.postKey = postKey;
	}

	public String getImageSize() {
		return imageSize;
	}

	public void setImageSize(String imageSize) {
		this.imageSize = imageSize;
	}

}
