package Day4.HandsOn;

abstract class Product{
	int productId;
	String productName;
	double price;
	
	Product(int productId,String productName,double price){
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}

	public int getProductId() {
		return productId;
	}

	public String getProductName() {
		return productName;
	}

	public double getPrice() {
		return price;
	}
	
	void displayInfo() {
		
	}
}

class ElectronicProduct extends Product{
	
	int warrantyPeriod;

	ElectronicProduct(int productId, String productName, double price,int warrantyPeriod) {
		super(productId, productName, price);
		this.warrantyPeriod = warrantyPeriod;
	}
	
	public int getWarrantyPeriod() {
		return warrantyPeriod;
	}

	@Override
	public void displayInfo() {
		System.out.println("ProductId :"+productId+" productName "+productName+" price "+price+" warrantyPeriod "+warrantyPeriod);
	}
}

class ClothingProduct extends Product{
	
	String size;
	String material;

	ClothingProduct(int productId, String productName, double price,String size,String material) {
		super(productId, productName, price);
		this.size = size;
		this.material = material;
	}

	public String getSize() {
		return size;
	}

	public String getMaterial() {
		return material;
	}
	
	@Override
	public void displayInfo() {
		System.out.println("ProductId :"+productId+" productName "+productName+" price "+price+" size "+size+" material "+material);
	}
	
}

public class program4 {

	public static void main(String[] args) {
		
		ElectronicProduct laptop = new ElectronicProduct(101, "Dell Inspiron", 65000.0, 24);
		
		ClothingProduct tShirt = new ClothingProduct(102,"Polo T-shirt",1499.0,"M","Cotton");
		
		Product[] products = new Product[2];
		products[0] = laptop;
		products[1] = tShirt;
		
		for(Product x : products) {
			x.displayInfo();
		}
	
	}

}
/* OUTPUT
ProductId :101 productName Dell Inspiron price 65000.0 warrantyPeriod 24
ProductId :102 productName Polo T-shirt price 1499.0 size M material Cotton
 * */
 