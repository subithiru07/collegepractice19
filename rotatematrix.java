package zoho;

public class rotatematrix {
	public static int[][] matrix(int mat[][],int n) {
		for(int layer=0 ;layer<n/2;layer++) {
			int first=layer;
			int last = n-1-layer;
			for(int i=first;i<last;i++) {
				int offset = i-first;
				int top = mat[first][i];
				mat[first][i] =mat[last-offset][first];
				mat[last-offset][first] = mat[last][last-offset];
				mat[last][last-offset]=mat[i][last];
				mat[i][last]=top;
				
				
				
			}
			}
			return mat;
		}
		public static void main(String[] agrs) {
			
			int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}},l=arr.length;
			rotatematrix x = new rotatematrix();
			int arr2[][] =x.matrix(arr,arr.length);
			for(int i=0;i<l;i++) {
				for(int j=0;j<l;j++) {
					System.out.print(arr2[i][j]+" ");
				}
				System.out.println();
			}
			
			
		}
		}
	
