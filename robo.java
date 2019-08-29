package subi;

public class robo {
	public static String  Robodir (int input1,int input2 ,String input3,String input4) {
		int xb=input1;
		int yb=input2;
		String init[]=input3.split("-");
		int xc=Integer.valueOf(init[0]);
		int yc=Integer.valueOf(init[1]);
		String dc =init[2];
		dc=dc.toUpperCase();
		String movement =input4.replace(" ","");
		int pi=xc;
		int pj=yc;
		for(int i=0;i<movement.length();i++) {
			String val=String.valueOf(movement.charAt(i));
		if(val.equalsIgnoreCase("R")&&dc.equalsIgnoreCase("N")) {
			dc="E";
		}
		else if (val.equalsIgnoreCase("L")&&dc.equalsIgnoreCase("N")) {
			dc="W";
		}
		else if(val.equalsIgnoreCase("R")&&dc.equalsIgnoreCase("S")){
			dc="W";
		}
		else if(val.equalsIgnoreCase("L")&&dc.equalsIgnoreCase("S")) {
			dc="E";
		}
		else if(val.equalsIgnoreCase("R")&&dc.equalsIgnoreCase("E")) {
			dc="S";
		}
		else if(val.equalsIgnoreCase("L")&&dc.equalsIgnoreCase("E")) {
			dc="N";
		}else if (val.equalsIgnoreCase("R")&&dc.equalsIgnoreCase("W")) {
			dc="N";
			
		}else if  (val.equalsIgnoreCase("L") && dc.equalsIgnoreCase("w")){
			
			dc="S";
		}
		pi=xc;
		pj=yc;
		 if(val.equalsIgnoreCase("M")&& dc.equalsIgnoreCase("N")) {
			yc++;
			
		}else if(val.equalsIgnoreCase("M")&& dc.equalsIgnoreCase("S")) {
			yc--;
		}else if(val.equalsIgnoreCase("M")&&dc.equalsIgnoreCase("E")) {
			xc++;
		}else if (val.equalsIgnoreCase("M")&& dc.equalsIgnoreCase("W")) {
			xc--;
		}
		if(xc>xb||yc>yb ||yc<0||xc<0) {
			xc=pi;
			yc=pj;
			
		
		
		String result=xc+""+yc+"-"+dc+"-ER";
		return result;}
		}

		
		String result =xc+"-"+yc+"-"+dc;
		System.out.println(result);
		return result;
		
	}
		
		
		
	

	public static void main(String[] args) {
		String St1 = "2-2-E" ;
		String st2= "R M L M L M";
		
	robo.Robodir(3, 3, St1, st2);
		
	}

}
