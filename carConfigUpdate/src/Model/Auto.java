package Model;

public class Auto {
	private String autoName;
	private OptionSet optSet;
	private double optPrice=optSet.getPrice();
	private double autoPrice;
	private double totalPrice=optPrice+autoPrice;

	public Auto() {}
	public Auto(String Name) {
		autoName = Name;
	}
	public Auto(String Name, int optNum, double price) {
		autoName=Name;
		optSet = new OptionSet(optNum);
		autoPrice = price;
	}
	public void setName(String n) {
		autoName=n;
	}
	public String getName() {
		return autoName;
	}
	public double getTotal() {
		return totalPrice;
	}
	public double getOptionPrice() {
		return optSet.getPrice();
	}
	public double getBase() {
		return autoPrice;
	}
	public String toString() {
		return autoName+": "+optSet+" ";
	}
	public void setPrice(double p) {
		autoPrice=p;
	}
	public void setOptionNum(int x) {
		OptionSet opts = new OptionSet(x);
		optSet = opts;
	}
}
