package Model;

public class Option {
	private String Name; //Name of option (EX: Color, Transmission, Brakes/Traction Control, Side Impact Airbags, or Power Moonroof
	//public boolean value;
	/* Transmission: true (automatic) or false (manual)
	 * Side Impact Airbags: true (present) or false (not present)
	 * Power Moonroof: true (present) or false (not present)
	 */
	//public int tractControl = 3; //Brakes/Traction Control: Standard (0) or ABS (1) or ABS w/ Advance Trac (2)
	private double price = 0;
	
	public Option(String name) {
		Name = name;
	}
	/*public void addBoolean(boolean val) {
		value = val;
	}
	public void addTractCon(int num) {
		tractControl = num;
	}
	public void calcOptPrice() {
		if(!Name.equals("Color")) {
			if(tractControl != 3 || tractControl != 0) {
				if(tractControl == 1) price = 400;
				if(tractControl == 2) price = 1625;
			}
			if(Name.equals("Transmission") && value == false) price = -815;
			if(Name.equals("Power Moonroof") && value == true) price = 595;
		}
		
	}
	*/
	public void setPrice(double p) {
		price = p;
	}
	public double getPrice() {
		return price;
	}
	public void setName(String N) {
		Name = N;
	}
	public String getName() {
		return Name;
	}
	public String toString() {
		return Name +": $"+ price;
	}
}
