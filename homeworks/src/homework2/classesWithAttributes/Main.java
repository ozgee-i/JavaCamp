package homework2.classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setdescripting("asus"); 
		product.setPrice(20); 
		product.setStockAmount(3); 
		
		//System.out.println(product.name);
		
		ProductManager productManager=new ProductManager();
		productManager.Add(product);
		System.out.println(product.getKod());

	}

}
