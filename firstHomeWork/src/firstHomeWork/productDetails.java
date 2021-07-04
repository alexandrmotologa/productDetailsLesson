package firstHomeWork;

public class productDetails {

	public static void main(String[] args) {
		// store data about product
		// type name = value
		String productName = "Fridge";
		boolean productInStock = true;
		char productEnergyClass = 'C';
		double productPrice = 799.99;
		int productYear = 2020;
		char currency = '$';
		int usedYears = 1;
		
		System.out.println("PRODUCT DETAILS");
		System.out.println("name: " + productName);
		System.out.println("in stock: " + productInStock);
		System.out.println("energy class: " + productEnergyClass);
		System.out.println("price: " + currency + productPrice);
		System.out.println("year: " + productYear);

		////////////////////////////////////////////////
		boolean productExpensive = productPrice > 500.00;
		System.out.println("expensive: " + productExpensive);
		boolean productEnergyEfficiency = productEnergyClass == 'A' || productEnergyClass == 'B';
		System.out.println("energy efficiency: " + productEnergyEfficiency);
		boolean used = usedYears > 0;
		System.out.println("used: " + used);
	
	}

}
