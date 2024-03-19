package carConfig2;
import java.io.*;
import Model.*;

public class fileIO {
	public Auto fileRead(File x) {
		int lineNum=0;
		Auto carRet = new Auto();
		try {
			FileReader file = new FileReader(x);
			BufferedReader buff = new BufferedReader(file);
			for (int count=0; count<2;count++) {
				if(count==1) {
					OptionSet optSet = new OptionSet(lineNum-4);
					lineNum=0;
				}
				boolean eof = false;
				while (!eof) {
					String line = buff.readLine();
					if(line == null) eof = true;
					else {
						if (count==1) {
							lineNum++;
							if (lineNum==0) {
								carRet.setName(line);
							}if (lineNum==1) {
								carRet.setPrice(Double.parseDouble(line));
							}if (lineNum==2) {
								carRet.setOptionNum(5);
							}if (lineNum>=3) {
								int spot = line.indexOf(',');
								Option opt = new Option(line.substring(0, spot));
								opt.setPrice(Double.parseDouble(line.substring(spot)));
							
								System.out.println(line);
							}
						}
						lineNum++;
					}
				}
				buff.close();
			}
			return carRet;
		}
		catch(IOException e){
			Auto a = new Auto();
			System.out.println("Error -- "+ e.toString());
			return a;
		}
	}
}