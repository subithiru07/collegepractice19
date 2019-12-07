package ibm;

import java.util.Scanner;

public class Eb_bill {
	public static void main(String args[] ) {
	    float billpay=0;
		Scanner s = new Scanner(System.in);
		int unit = s.nextInt();
		if(unit <=100) 
			billpay =0;
		else if (unit<=200) {
			billpay =(float) (100+(unit-100)*1.5);
		}
		else if(unit<=500) {
			billpay=(float)(250+(unit-200)*2.5);
		}
		else
			billpay =(float)(100+150+750+(unit-500)*6.6);
		
		System.out.printf("%.2f",billpay);
		
		
	}

}
