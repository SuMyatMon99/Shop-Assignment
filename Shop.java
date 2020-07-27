package ShopAssignment;

import java.util.Date;
import java.util.Scanner;

public class Shop {
	Customer customer;
	Date date;
	double serviceExpense;
	double productExpense;
	
	public Shop(Customer customer, double serviceExpense, double productExpense, Date date){
		this.customer = customer;
		this.serviceExpense = serviceExpense;
		this.productExpense = productExpense;
		this.date = date;
	}
	
	public double getTotalExpense() {
		double totalExp = 0.0;
		
		
		if(customer.isMember()) {
			totalExp = (serviceExpense + productExpense) - Discount();
		}
		else {
			totalExp = serviceExpense + productExpense;
		}
		return totalExp;
	}
	
	public double Discount() {
		double discount = serviceExpense * DiscountRate.getServiceDiscountRate(customer.memberType) + productExpense * DiscountRate.getProductDiscountRate(customer.memberType);
		return discount;
	}
	public void show() {
		System.out.println(customer.toString());
		System.out.println("Service Expense : " + serviceExpense);
		System.out.println("Product Expense : " + productExpense);
		System.out.println("Discont: " + Discount());
		System.out.println("Total Expense : " + getTotalExpense());
		System.out.println("Date: " + date + '\n');
	}
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Customer c = new Customer();
		String ans;
		
		do {
			System.out.print("Enter customer name: ");
			c.name = sc.next();
			
			System.out.print("Enter Member Type: ");
			c.memberType = sc.next();
			
			System.out.print("Enter Service Expense: ");
			double sExp = sc.nextDouble();
			
			System.out.print("Enter Product Expense: ");
			double pExp = sc.nextDouble();
			System.out.println("----------------*---------------");
			
			Shop s = new Shop(c, sExp, pExp, new Date());
			s.show();
			
			System.out.print("Any customer left?[yes/no]");
			ans = sc.next();
			
		}while(ans.equals("yes"));
		
		sc.close();
		
	}

}
