package concretiza.repo;

import concretiza.models.Product;

public interface ProductsRepoInterface {
	public boolean addProduct(Product product);
	public Product getProductByIndex(int index);
	public Product getProductByID(String id);
	public boolean remProductByIndex(int index);
	public boolean remProductByID(String id);
	public Product [] listOfProductWithThistTag(String tag);
	public Product [] listOfProductWithThatTags(String...tag);
	
}
