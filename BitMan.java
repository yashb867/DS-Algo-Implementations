import java.util.Scanner;

public class BitMan {
	
	int findEl(int arr[]) {
		int ans=0;
		for(int i=0; i<arr.length; i++) {
			ans=ans^arr[i];
		}
		
		return ans;
		
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array size and then elements");
		int n = in.nextInt();
		int arr[] = new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=in.nextInt();
		}
		BitMan obj = new BitMan();
		int result = obj.findEl(arr);
		System.out.println(result);
		// TODO Auto-generated method stub

	}

}
