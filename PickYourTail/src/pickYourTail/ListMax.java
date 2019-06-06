package pickYourTail;
import java.util.Scanner;

public class ListMax {
	public static long listMax(long arr[], int a,int b,int k) {
		arr[a-1] += k;
        arr[b] -= k;
        long sum = 0;
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            max = Math.max(max, sum);
        }
        return max;
	}
	public static void main(String[] args) {
	       Scanner scan = new Scanner(System.in);
	        int N = scan.nextInt();
	        int M = scan.nextInt();
	        int t = scan.nextInt();
	        long [] arr = new long[N + 1];
	        long result = 0;
	        while (M-- > 0) {
	            int a = scan.nextInt();
	            int b = scan.nextInt();
	            int k = scan.nextInt();
	            result = listMax(arr, a, b, k);
	        }
	        System.out.println(result);
	    }
}
