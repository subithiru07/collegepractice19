package subi;

public class palan {
	public static void main(String[] agrs) {
		String input1 = "bhakkiya venkatesan";
		int input2 = 21;
	String a[] = input1.split(" ");
	String str1 = a[(input2/10)-1];
	String str2 =  a[(input2%10)-1];
	int n1=str1.length();
	int n2=str2.length();
	int a1,a2,b1,b2;
	if(n1%2==0) {
		a1 = (n1/2);
	}
	else {
		 a1 = (n1/2)+1;
	}
	if(n2%2==0) {
	 b1 = (n2/2);
	}
	else {
	b1 = (n2/2)+1;
	}
	StringBuilder sb = new StringBuilder(str1.substring(0, a1));
	sb = sb.reverse();
    String temp1 = sb.toString();
    String temp2 = str1.substring(a1);
    String temp  = temp1+temp2;
    StringBuilder sb1 = new StringBuilder(str2.substring(0, b1));
	sb1 = sb1.reverse();
    String tep1 = sb1.toString();
    String tep2 = str2.substring(b1);
    String tep  = tep1+tep2;
    String Str = temp+" "+tep;
    System.out.println(Str);

}
}

