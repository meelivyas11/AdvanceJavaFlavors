package com.collab.Domains;

import javax.persistence.*;

@Entity
@Table(name = "LOGIN")
public class User {
	
	@Id
	@Column(name="USERID" )
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen")
    @SequenceGenerator(name = "gen", sequenceName = "LOGIN_SEQ")
	private long userId;
	
	@Column(name="USERNAME" )
	private String userName;
	
	@Column(name="PASSWORD" )
	private String password;
	
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;
	private String fax;
	
	@Column(name="FACEBOOK_URL")
	private String facebookURL;
	
	@Column(name="TWITTER_URL")
	private String twitterURL;
	
	@Column(name="LINKEDIN_URL")
	private String linkedInURL;
	
	@Lob
	private byte[] userpic;
	
	public User() {}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getFacebookURL() {
		return facebookURL;
	}

	public void setFacebookURL(String facebookURL) {
		this.facebookURL = facebookURL;
	}

	public String getTwitterURL() {
		return twitterURL;
	}

	public void setTwitterURL(String twitterURL) {
		this.twitterURL = twitterURL;
	}

	public String getLinkedInURL() {
		return linkedInURL;
	}

	public void setLinkedInURL(String linkedInURL) {
		this.linkedInURL = linkedInURL;
	}

	public byte[] getUserpic() {
		return userpic;
	}

	public void setUserpic(byte[] userpic) {
		this.userpic = userpic;
	}
}
