package subi;

public class userid {
	public static String Userid(String s1,String s2,int n1,int n2 ) {
		int N1=s1.length();
		int N2=s2.length();
		String sh,lg;
		if(N1>N2) {
			sh=s2;
			lg=s1;
		}else if(N2>N1) {
			sh=s1;
			lg=s2;
					
		}else {
			if(s1.compareTo(s2)>0) {
				sh=s2;
				lg=s1;
			}
			else {
				sh=s2;
				lg =s1;
			}
		}
		int n = sh.length();
		char S1= sh.charAt(n-1);
		String S2=String.valueOf(n1);
		int m = S2.length();
		char S3=S2.charAt(m-1);
		char S4 =S2.charAt(m-n2);
		String user =S1+lg;
		String userid="";
		for(int i =0;i<user.length();i++) {
			if(Character.isLowerCase(user.charAt(i))){
				userid=userid+""+Character.toUpperCase(user.charAt(i));
				
			}
			else {
				userid =userid+""+Character.toLowerCase(user.charAt(i));
			}
		}
			return userid=userid+S3+S4;		
		
		
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		String s =userid.Userid("Thiru","Baskaran" ,56432, 3);
System.out.print(s);
	}

}
