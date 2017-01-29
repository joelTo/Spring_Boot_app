package org.test.devoxx.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Speaker implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue
	@Id
	private Long id;

	private String firstname;

	private String lastname;
	private String twitter;

	@Column(columnDefinition = "TEXT")
	private String bio;

	public Speaker(String firstname, String lastname, String twitter) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.twitter = twitter;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(String twitter) {
		this.twitter = twitter;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
