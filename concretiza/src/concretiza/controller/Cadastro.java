package concretiza.controller;

import concretiza.models.Product;
import concretiza.repo.ProductsRepo;

public abstract class Cadastro {
	ProductsRepo repo = new ProductsRepo();
	
	public void cadastrarProduto(String name, float price) {
		try {
			repo.addProduct(new Product(name,price));
		} catch (Exception e) {
			System.out.println("ERROR - Unable to add product");
		}
	}
	
}
