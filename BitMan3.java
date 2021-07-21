
public class BitMan3 {
	
	
	public static void main(String[] args) {
		int a[] = { 6, 2, 5, 2, 2, 6, 6, 5, 5, 3 };
	    int n = a.length;
	    int k = 3;
	    System.out.println(findUnique(a, n, k));

	}

	private static int findUnique(int[] a, int n, int k) {
		int count[] = new int[32];
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<32; j++) {
				
				if((a[i] & (1<<j)) > 0) {
					count[j] +=1;
				}
			}
		}
		
		int result=0;
			for(int i=0; i<32; i++) {
				result += (count[i] % k)*(1<<i);
			}

			
				return result;
	}

}
