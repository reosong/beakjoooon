package Test;

import java.util.Scanner;

public class T2438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for(int i=1; i<=a;i++) {
			for(int b=0; b<i; b++) {
				System.out.print("*");
			}System.out.println();
		}
	}

}
