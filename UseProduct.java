//------------------------------------------------------------------------------
//This is a Client that uses the Class Named Product
//Susan Driskill
//Assignment 9
//March 9, 2020
//------------------------------------------------------------------------------

public class UseProduct {

	public static void main(String[] args) {
		Product p1 = new Product(1001, "Gold Star Necklace", 38.00, 30);
		System.out.println(p1.toString() + p1.getPriceFormatted());
		Product p2 = new Product(1002, "Silver Moon Earring Set", 22.00, 48);
		System.out.println(p2.toString() + p2.getPriceFormatted());
		Product p3 = new Product(1003, "Tungsten Plain Ring Band", 80.00, 100);
		System.out.println(p3.toString() + p3.getPriceFormatted());

	}

}
