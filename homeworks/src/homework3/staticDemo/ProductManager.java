package homework3.staticDemo;

public class ProductManager {

	public void add(Product product) {
		if (ProductValidator.isValid(product)) {
			System.out.println("eklendi");

		} else {
			System.out.println("hatalı giriş");
		}

		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
	}

}
