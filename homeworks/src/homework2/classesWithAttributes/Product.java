package homework2.classesWithAttributes;

public class Product {
	//attribute - field
	private int id;
	private String name;
	private String descripting;
	private double price;
	private int stockAmount;
	private String renk;
	private String kod;
	
	
	
	public Product() {
		super();
	}
	
	
	public Product(int id, String name, String descripting, double price, int stockAmount, String renk, String kod) {
		super();
		this.id = id;
		this.name = name;
		this.descripting = descripting;
		this.price = price;
		this.stockAmount = stockAmount;
		this.renk = renk;
		this.kod = kod;
	}




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
	public String getdescripting() {
		return descripting;
	}
	public void setdescripting(String descripting) {
		this.descripting = descripting;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getStockAmount() {
		return stockAmount;
	}
	public void setStockAmount(int stockAmount) {
		this.stockAmount = stockAmount;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getKod() {
		return this.name.substring(0,1)+id;
	}

	
	
}

