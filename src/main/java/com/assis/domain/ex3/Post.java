package com.assis.domain.ex3;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Post implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title; 
	
	@OneToMany(mappedBy = "post")
	private List<PostComment> comments = new ArrayList<>();
	
	public Post() {
		
	}
	
	public Post(Long id, String title) {
		super();
		this.id = id;
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public List<PostComment> getComments() {
		return comments;
	}
	
	public void setComments(List<PostComment> comments) {
		this.comments = comments;
	}
	
	public Long getId() {
		return id;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Post other = (Post) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}	
	
	public void addComment(PostComment post) {
		this.comments.add(post);
	}
	
	public void removeComment(PostComment post) {
		this.comments.remove(post);
	}
	
}
