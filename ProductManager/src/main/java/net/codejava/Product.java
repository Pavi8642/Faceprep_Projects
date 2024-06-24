package net.codejava;

import jakarta.persistence.*;
@Entity
public class Product {
 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getMadein() {
		return madein;
	}

	public void setMadein(String madein) {
		this.madein = madein;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public void setId(Long id) {
		this.id = id;
	}

private Long id;
 private String name;
 private String brand;
 private String madein;
 private float price;

 protected Product() {
 }

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 public Long getId() {
     return id;
 }
  
 // other getters and setters are hidden for brevity
}