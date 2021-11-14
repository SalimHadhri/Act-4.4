package com.thp.project.vintud.entity;


import com.thp.project.vintud.dao.controller.CategoryController;


public class Announcement{

	
	
	private int id ;
	private String title  ;
	private String description  ;
	private int category_id  ;
	private int price ;
	private String picture;
	private String publication_date; 
	private boolean is_available  ;
	private int view_number  ;
	private String localisation  ;
	private int user_id  ;
	
	
	private Category category  ;

	
	public Announcement() {
	}


	CategoryController catControl = new CategoryController() ;

	



	public Category getCategory() {
		Category cat = catControl.getCategoryById(this.category_id) ;

		return cat;
	}



	public void setCategory(Category category) {
		this.category = category;
	}



	public CategoryController getCatControl() {
		return catControl;
	}



	public void setCatControl(CategoryController catControl) {
		this.catControl = catControl;
	}















	public Announcement(int id, String title, String description, int category_id, int price, String picture,
			String publication_date, boolean is_available, int view_number, String localisation, int user_id) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
		this.category_id = category_id;
		this.price = price;
		this.picture = picture;
		this.publication_date = publication_date;
		this.is_available = is_available;
		this.view_number = view_number;
		this.localisation = localisation;
		this.user_id = user_id;
	}



	public int getId_annoucement() {
		return id;
	}



	public void setId_annoucement(int id_annoucement) {
		this.id = id_annoucement;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getCategory_id() {
		return category_id;
	}


	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getPicture() {
		return picture;
	}


	public void setPicture(String picture) {
		this.picture = picture;
	}


	public String getPublication_date() {
		return publication_date;
	}


	public void setPublication_date(String publication_date) {
		this.publication_date = publication_date;
	}


	public boolean isIs_available() {
		return is_available;
	}














	public void setIs_available(boolean is_available) {
		this.is_available = is_available;
	}







	public int getView_number() {
		return view_number;
	}


	public void setView_number(int view_number) {
		this.view_number = view_number;
	}


	public String getLocalisation() {
		return localisation;
	}


	public void setLocalisation(String localisation) {
		this.localisation = localisation;
	}


	public int getUser_id() {
		return user_id;
	}


	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}



	@Override
	public String toString() {
		return "Announcement [id_annoucement=" + id + ", title=" + title + ", description=" + description
				+ ", category_id=" + category_id + ", price=" + price + ", picture=" + picture + ", publication_date="
				+ publication_date + ", is_available=" + is_available + ", view_number=" + view_number
				+ ", localisation=" + localisation + ", user_id=" + user_id + "]";
	}







	
	
	
	
	
	
	
}
