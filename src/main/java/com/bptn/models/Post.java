package com.bptn.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "\"Post\"")
public class Post {

	@Id
	@Column (name="\"postID\"")
	private String postID;
	
	@Column (name="\"postType\"")
	private String postType;
	
	@Column (name="\"post\"")
	private String post;
	
	@Column (name="\"usernameKey\"")
	private String username;
	
	public Post(String postID, String postType, String post, String username) {
		super();
		this.postID = postID;
		this.postType = postType;
		this.post = post;
		this.username= username;
	}

	public String getPostID() {
		return postID;
	}

	public void setPostID(String postID) {
		this.postID = postID;
	}

	public String getPostType() {
		return postType;
	}

	public void setPostType(String postType) {
		this.postType = postType;
	}

	public String getPost() {
		return post;
	}

	public void setPost(String post) {
		this.post = post;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Post() {
		super();
	}

}
