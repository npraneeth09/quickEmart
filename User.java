package com.quickEmart.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import jakarta.persistence.Id;

@Entity
@Table(name = "users")  

public class User {

        	

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String first_name;
	private String Last_name;
	private String email;
	private String password;
	private String role;
	private Float wallet;
	private String itemList;
	
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return Last_name;
	}
	public void setLast_name(String last_name) {
		Last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Float getWallet() {
		return wallet;
	}
	public void setWallet(Float wallet) {
		this.wallet = wallet;
	}
	public String getItemList() {
		return itemList;
	}
	public void setItemList(String itemList) {
		this.itemList = itemList;
	}
}
