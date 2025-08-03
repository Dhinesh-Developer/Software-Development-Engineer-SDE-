package com.arise.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
// stream api filtering method.
public class StreamFilterExample {

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<Product>();
		
		// Filtering object from the list -> traditional way.
		for(Product product : getProducts()) {
			if(product.getPrice() >= 25000f) {
				list.add(product);
			}
		}
		
		for(Product product : list) {
			System.out.println(product);
		}
		
		System.out.println(".................................");
		// using the stream API.
		List<Product> list2 = getProducts().stream().filter((product) -> product.getPrice() > 25000f).collect(Collectors.toList());
		list2.forEach(System.out::println);
		System.out.println(list2);
	}
	
	private static  List<Product> getProducts(){
		List<Product> productList = new ArrayList<Product>();
		productList.add(new Product(1,"Hp Laptop",25000f));
		productList.add(new Product(2,"Dell Laptop",30000f));
		productList.add(new Product(3,"Lenevo Laptop",20000f));
		productList.add(new Product(4,"Sony Laptop",20000f));
		productList.add(new Product(5,"Apple Laptop",22000f));
		return productList;
	}

}

class Product{
	private int id;
	private String name;
	private float price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Product() {
	}
}