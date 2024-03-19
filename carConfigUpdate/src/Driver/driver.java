package Driver;

import java.io.File;
import carConfig2.fileIO;
import Model.*;

public class driver {

	public static void main(String[] args) {
		fileIO fIO = new fileIO();
		File cog = new File("C:\\Users\\lordc\\eclipse-workspace\\carConfig2\\src\\carConfig2\\ReadSource.java");
		Auto customerCar = fIO.fileRead(cog);
		System.out.println(customerCar);
	}

}
