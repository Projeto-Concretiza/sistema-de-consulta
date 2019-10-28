package concretiza.models;

import java.util.ArrayList;
import concretiza.models.Agenda;
import concretiza.models.Description;

public class Product {
	private String name;
	private String id;
	private float price;
	private int quantity;
	private boolean available;
	private Description description;
	private ArrayList <String> tags;
	private Agenda creationDate;
	
	public Product (String name,float price) {
		this.name = name;
		this.price = price;
	}
	
	public Product (String name,String id,float price,int quantity,int day,int month,int year) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.available = (quantity > 0 ? true : false);
		this.tags = new ArrayList<>();
		this.creationDate = new Agenda(day,month,year);
	}
	
	public Product(String id,float price,int quantity,int day,int month,int year,Description description) {
		this.id = id;
		this.price = price;
		this.quantity = quantity;
		this.available = (quantity > 0 ? true : false);
		this.tags = new ArrayList<>();
		this.creationDate = new Agenda(day,month,year);
		this.description = description;
	}
	
	public void setID(String id) {
		this.id = id;
	}
	
	public String getID() {
		return this.id;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public float getPrice() {
		return this.price;
	}
	
	public void setQuantity(int qty) {
		this.quantity = qty;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public boolean getAvailable() {
		return this.available;
	}
	
	public void setDescription(Description description) {
		this.description = description;
	}
	
	public Description getDescription() {
		return this.description;
	}
	
	public boolean addTag(String tag) {
		boolean result = false;
		if(!this.tags.contains(tag)) {
			this.tags.add(tag);
			result = true;
		}
		return result;
	}
	
	public int getTagsLen() {
		return this.tags.size();
	}
	
	public String getTagByIndex(int index) {
		String result = "";
		if(this.tags.size() > index && index >= 0) {
			result = this.tags.get(index);
		}
		return result;
	}
	
	public boolean remTagByIndex(int index) {
		boolean result = false;
		if(this.tags.size() > index && index >= 0) {
			this.tags.remove(index);
			result = true;
		}
		return result;
	}
	
	public Agenda getCreationDate() {
		return this.creationDate;
	}
	
	
	
}
