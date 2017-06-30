package com.classmiss.ClassyMissyBackend.model;

import javax.persistence.Entity;


import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;


@Entity
@Table
public class Product {
	@Id
	@GeneratedValue
	int prodid;
	
	/*@NotEmpty(message="Please Enter the Productname")
	@Size(min=4, max=15, message="Your Product Name must be Entered")*/
	String prodname;
	String proddesc;
	int catid,supid,price,quantity;
	
	@Transient
	MultipartFile pimage;
	
	public int getProdid() {
		return prodid;
}
	public String getProdname() {
		return prodname;
	}
	public void setProdname(String prodname) {
		this.prodname = prodname;
	}
	public String getProddesc() {
		return proddesc;
	}
	public void setProddesc(String proddesc) {
		this.proddesc = proddesc;
	}
	public int getCatid() {
		return catid;
	}
	public void setCatid(int catid) {
		this.catid = catid;
	}
	public int getSupid() {
		return supid;
	}
	public void setSupid(int supid) {
		this.supid = supid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public void setProdid(int prodid) {
		this.prodid = prodid;
	}
	public MultipartFile getPimage() {
		return pimage;
	}
	public void setPimage(MultipartFile pimage) {
		this.pimage = pimage;
	}
	
	
}