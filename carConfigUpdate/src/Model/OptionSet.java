package Model;

public class OptionSet {
	private Option[] options;
	private double optionTotal;
	private String Name;
	
	public OptionSet(int numOfOptions) {
		 options = new Option[numOfOptions];
	}
	
	public void addOption(Option opt) {
		for (int x=0;x<options.length;x++) {
			if (options[x] == null) options[x] = opt;
		}
	}
	public void returnOptions() {
		System.out.println(options);
	}
	public void calcPrices() {
		double tempTotal=0;
		for (int x=0;x<options.length;x++) {
			tempTotal+=options[x].getPrice();
		}
		optionTotal=tempTotal;
	}
	public void setName(String newName) {
		Name=newName;
	}
	public String getName() {
		return Name;
	}
	public double getPrice() {
		return optionTotal;
	}
	public Option getOptionAt(int x) {
		return options[x];
	}
	public String tostring() {
		return Name +": "+options+". Total option cost: $"+optionTotal;
		
	}
}
