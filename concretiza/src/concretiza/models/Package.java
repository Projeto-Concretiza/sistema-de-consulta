package concretiza.models;

import java.util.ArrayList;
import concretiza.models.Product;
import concretiza.models.Agenda;

public class Package {
	private String id;
	private ArrayList <Product> products;
	private float totalPrice;
	private float totalWeight;
	private Agenda deliveryDate;
	private boolean delivered;
	private ArrayList <String> tags;
	private Agenda creationDate;
	
	public Package(String id,Agenda creationDate) {
		this.id = id;
		this.creationDate = creationDate;
	}
	
	public String getID() {
		return this.id;
	}
	
	public void addProduct(Product newProduct) {
		this.products.add(newProduct);
		this.totalPrice += newProduct.getPrice();
		float weightToGain = newProduct.getDescription().getWeight();
		this.totalWeight += weightToGain;
		for(int i = 0;i < newProduct.getTagsLen();i++) {
			this.tags.add(newProduct.getTagByIndex(i));
		}
	}
	
	public Product getProductByIndex(int index) {
		Product result = null;
		if(this.products.size() > index && index >= 0) {
			result = this.products.get(index);
		}
		return result;
	}
	
	public boolean remProductByIndex(int index) {
		boolean result = false;
		if(this.products.size() > index && index >= 0 ) {
			Product toBeRemoved = products.get(index);
			for(int i = 0;i < toBeRemoved.getTagsLen();i++) {
				tags.remove(toBeRemoved.getTagByIndex(i));
			}
			this.totalPrice -= toBeRemoved.getPrice();
			float weightToLose = toBeRemoved.getDescription().getWeight();
			this.totalWeight -= weightToLose;
			this.products.remove(index);
			result = true;
		}
		return result;
	}
	
	public float getTotalPrice() {
		return this.totalPrice;
	}
	
	public float getTotalWeigth() {
		return this.totalWeight;
	}
	
//	public boolean checkDate(int hour,int minute,int day,int month,int year) {
//		if()
//	}
	
	public void setDeliveryDate(int hour,int minute,int day,int month,int year) {
		this.deliveryDate = new Agenda(hour, minute, day, month, year);
	}
	
	public Agenda getDeliveryDate() {
		return this.deliveryDate;
	}
	
	public void setDelivered(boolean delivered) {
		this.delivered = delivered;
	}
	
	public boolean getDelivered() {
		return this.delivered;
	}
	
	public void addTag(String tag) {
		this.tags.add(tag);
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
