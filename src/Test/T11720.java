package Test;

import java.util.Scanner;

public class T11720 {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int[] arr = new int[a];
		
		String b = sc.next();
		
		int sum = 0;
		for(int i=0; i<a; i++) {
			String str = b.substring(i, i+1);
			int num = Integer.parseInt(str);
			arr[i] = num;
		}
		for(int i=0;i<a;i++) {
			sum += arr[i];
		}
		
		System.out.println(sum);

	}

}
