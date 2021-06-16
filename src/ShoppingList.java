
public class ShoppingList extends Note {
	
	private String groceryStore;
	private String address;
	private double budget;
	private static int numItems;
	
	//default constructor
	public ShoppingList() {
		super(null, null);
	
	}
	//5 argument constructor
	public ShoppingList(String g, String a, double b, Time t, Date d, String event) {
		super(t, d);
		groceryStore = g;
		address = a;
		budget = b;
	}
	
	//getter
	public String getGroceryStore() {
		return groceryStore;
	}
	public String getAdress() {
		return address;
	}
	public double getBudget() {
		return budget;
	}
	public int getNumItems() {
		return numItems;
	}
	//setter
	public void setGroceryStore(String g) {
		groceryStore = g;
	}
	public void setAddress(String a) {
		address = a;
	}
	public void setBudget(double b) {
		budget = b;
	}
	//mutator
	public void updateNumItems() {
		numItems++;
	}
	
}
