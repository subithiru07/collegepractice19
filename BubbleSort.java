package collgepratice19;

public class BubbleSort {
	public static void main(String[] args) {
		int arr[]= {12,2,8,3,1};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
					
				}
			}
		for(int s: arr) {
			System.out.print(s);
			System.out.print(",");
			
		}
		}
		

	

}
