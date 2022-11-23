package Test;

import java.util.Scanner;

public class T9498 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		if(a==100) {System.out.println("A");}
		if(90<=a) {
			System.out.println("A");
		}else if(80<=a) {
			System.out.println("B");
		}else if(70<=a) {
			System.out.println("C");
		}else if(60<=a) {
			System.out.println("D");
		}else {System.out.println("F");
		
	}

	}
}