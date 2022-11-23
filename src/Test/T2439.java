package Test;

import java.util.Scanner;

public class T2439 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a =sc.nextInt();
		
		for(int i=0; i<a; i++ ) {
			for(int o=1; o<=a; o++) {
				if((a-i)<=o) {System.out.print("*");
				} else {
					System.out.print(" ");
				}
		}System.out.println();
		

	}

}
}
