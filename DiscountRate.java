package ShopAssignment;

public class DiscountRate {
	static double serviceDiscountPremium = 0.2;
	static double serviceDiscountGold = 0.15;
	static double serviceDiscountSilver = 0.1;
	
	static double productDiscountPremium = 0.1;
	static double productDiscountGold = 0.1;
	static double productDiscountSilver = 0.1;
	
	
	public static double getServiceDiscountRate(String type) {
		double serviceDiscount = 0.0;
	
		switch(type) {
			case "Premium" : serviceDiscount = serviceDiscountPremium;
				break;
			case "Gold" : serviceDiscount = serviceDiscountGold;
				break;
			case "Silver" : serviceDiscount = serviceDiscountSilver;
				break;
			default : 
				break;
		}
		return serviceDiscount;
	}
	
	public static double getProductDiscountRate(String type) {
		double productDiscount = 0.0;
		
		switch(type) {
		case "Premium" : productDiscount = productDiscountPremium;
			break;
		case "Gold" : productDiscount = productDiscountGold;
			break;
		case "Silver" : productDiscount = productDiscountSilver;
			break;
		default : 
			break;
		}
		return productDiscount;
	}
}
