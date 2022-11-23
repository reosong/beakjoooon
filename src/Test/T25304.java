package Test;

import java.util.Scanner;

public class T25304 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		
		int n = sc.nextInt();
		int sum=0;
		
		for(int i=0; i<n; i++) {
			int a =sc.nextInt();
			int b= sc.nextInt();
			sum += a*b;
		}
		
		if (x==sum) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}

	}

}
