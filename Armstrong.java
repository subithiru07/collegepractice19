
public class Armstrong {
	public static void Armstrongnum(int n) {
		int r=0,c=0;int t=n;
		while(n>0) {
			r=n%10;
			n=n/10;
			c=c+(r*r*r);
	}
		if(t==c) {
			System.out.print("Armstrong");
		}else
		System.out.print("NOt Armstrong");

	}
	public static void main(String[] agrs) {
		Armstrong.Armstrongnum(153);
	}

}
