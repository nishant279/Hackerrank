package TimeConversion;

import java.util.*;

public class TimeConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		String[] tempArray = time.split(":");
		int Hours;
		String hour = tempArray[0];
		String minute = tempArray[1];
		String second = tempArray[2].substring(0, 2);
		if(tempArray[2].substring(2,4).equalsIgnoreCase("PM")){
			if(Integer.parseInt(hour)<12){
				Hours = Integer.parseInt(hour);
				Hours += 12;
				hour = Integer.toString(Hours);
			}
		}
		if(tempArray[2].substring(2, 4).equalsIgnoreCase("AM")){
			if(Integer.parseInt(hour)==12){
				hour = "00";
			}
		}
		System.out.println(hour + ":" + minute + ":" + second);

	}

}
