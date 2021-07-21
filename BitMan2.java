import java.util.Scanner;

public class BitMan2 {

	private void singleEls(int n, int[] arr) {
		int temp=0;
		
		for(int i=0; i<n; i++) {
			temp = temp^arr[i];
		}
		
		int sum=temp;
		int el1 = 0,el2 = 0;
		sum=(sum&-sum);
		
		for(int i=0; i<n; i++) {
			if((sum & arr[i]) > 0) {
				el1=el1^arr[i];
			}
			else {
				el2=el2^arr[i];
			}
				

		}
		

		
		System.out.println(el1 +" "+ el2);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of array and array elemnts");
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=in.nextInt();
		}
		
		BitMan2 obj = new BitMan2();
		 obj.singleEls(n, arr);
	}

	

	
	
}




