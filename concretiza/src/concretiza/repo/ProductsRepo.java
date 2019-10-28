package concretiza.repo;

import java.util.ArrayList;
import concretiza.models.Product;

public class ProductsRepo implements ProductsRepoInterface{
	private ArrayList <Product> products;
	private int productsCount;
	
	
	public ProductsRepo() {
		this.products = new ArrayList<Product>();
	}


	@Override
	public boolean addProduct(Product product) {
		boolean result = true;
		for(Product a : this.products) {
			if(a.equals(product)) result = false;
		}
		if(result == true) {
			this.products.add(product);
			this.productsCount++;
		}
		return result;
	}


	@Override
	public boolean remProductByIndex(int index) {
		if(index < this.productsCount && index >= 0) {
			this.products.remove(index);
			this.productsCount--;
			return true;
		}
		return false;
	}


	@Override
	public boolean remProductByID(String id) {
		for(Product prod : this.products) {
			if(prod.getID().equalsIgnoreCase(id)) {
				this.products.remove(prod);
				return true;
			}
		}
		return false;
	}

	@Override
	public Product getProductByIndex(int index) {
		if(index < this.productsCount && index >= 0) {
			return this.products.get(index);
		}
		return null;
	}


	@Override
	public Product getProductByID(String id) {
		for(Product actual : this.products) {
			if(actual.getID().equalsIgnoreCase(id)) {
				return actual;
			}
		}
		return null;
	}


	@Override
	public Product[] listOfProductWithThistTag(String tag) {
		
		return null;
	}


	@Override
	public Product[] listOfProductWithThatTags(String... tag) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
//	public boolean addProduct(Product product) {
//		boolean result = true;
//		for(Product a : this.products) {
//			if(a.equals(product)) result = false;
//		}
//		if(result == true) {
//			this.products.add(product);
//		}
//		return result;
//	}
	
	
}
