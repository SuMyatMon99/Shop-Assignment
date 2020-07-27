package ShopAssignment;

public class Customer {
	String name;
	boolean member = false;
	String memberType;
	
	public Customer() {}
	public Customer(String name, String memberType) {
		this.name = name;
		this.memberType = memberType;
	}
	public boolean isMember() {
		if(memberType.equals("Premium")) {
			member = true;
		}
		else if(memberType.equals("Gold")) {
			member = true;
		}
		else if(memberType.equals("Silver")) {
			member = true;
		}
		return member;
	}
	public String toString() {
		return "Name: " + name + '\n' + "Member Type: " + memberType;
	}

}

