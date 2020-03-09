//------------------------------------------------------------------------------
//This is a Class named Product
//Susan Driskill
//March 9, 2020
//Assignment 9
//------------------------------------------------------------------------------

//Import Number Format
import java.text.NumberFormat;

public class Product {
	
	//Fields
	//Product code, product description, product price, product count
	private int code;
	private String description;
	private double price;
	private int count;
	
	//Constructor to construct a new product
	public Product(int code, String description, double price, int count) {
		
		this.code = code;
		this.description = description;
		this.price = price;
		this.count = count;
	}
	
	//Product code "getter"
	public int getCode() {
		return code;
	}
	
	//Product code "setter"
	public void setCode(int code) {
		this.code = code;
	}
	
	//Product description "getter"
	public String getDescription() {
		return description;
	}
	
	//Product description "setter"
	public void setDescription(String description) {
		this.description = description;
	}
	
	//Product price "getter"
	public double getPrice() {
		return price;
	}
	
	//Product price "setter"
	public void setPrice(double price) {
		this.price = price;
	}
	
	//Product count "getter"
	public double getCount() {
		return count;
	}
	
	//Product count "setter"
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(this.price);
        return formattedPrice;
	}
	
	public String toString() {
		return "Code: " + code + ". Description: " + description + ". Price: " + getPriceFormatted() + ". Count: " + count;
	}

}
