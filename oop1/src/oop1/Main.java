package oop1;

public class Main {

	public static void main(String[] args) {
		String mesaj = "vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi kahve makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(7500);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmem1");

		Product product2 = new Product();
		product2.setName("Smeg kahve makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(7500);
		product2.setUnitsInStock(3);
		product2.setImageUrl("bilmem1");

		Product product3 = new Product();
		product3.setName("Arçelik kahve makinesi");
		product3.setDiscount(7);
		product3.setUnitPrice(7500);
		product3.setUnitsInStock(3);
		product3.setImageUrl("bilmem1");

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {
			System.out.println(product.getName());
		}

		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("05326");
		individualCustomer.setCustomerNumber("123");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demiroğ");

		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("kodlama.io");
		corporateCustomer.setPhone("05333333");
		corporateCustomer.setTaxNumber("1111111111");
		corporateCustomer.setCustomerNumber("123456");
        
		Customer[] customers = {individualCustomer,corporateCustomer};
		

	
	}

}
