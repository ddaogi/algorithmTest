
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] arr = new int[N+1];
		
		for(int i =2;i<=N;i++) {
			if(i%2 == 0 & i%3 == 0) {
				arr[i] = Math.min(arr[i-1],Math.min(arr[i/2], arr[i/3]))+1;
			}	
			else if(i%3 == 0) {
				arr[i] = Math.min(arr[i-1], arr[i/3])+1;
			}
			else if(i%2 == 0) {
				arr[i] = Math.min(arr[i-1], arr[i/2])+1;
			}
			else
				arr[i] = arr[i-1]+1;

		}
		System.out.println(arr[N]);
	}

}
