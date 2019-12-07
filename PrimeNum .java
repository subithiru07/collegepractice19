
public class PrimeNum {
	public static void prime(int n) {
		int flag=0,m=n/2;
		if(n==0||n==1) {
			System.out.println(n+"not prime");
		}
		else {
			for(int i=2;i<m;i++) {
				if(n%i==0) {
					System.out.println(n+"Not prime");
					flag=1;
					break;
				}
				
			}
			if(flag==0) {
				System.out.println(n+"prime");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNum p = new PrimeNum();
		p.prime(100);

	}

}
