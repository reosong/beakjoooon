package Test;

import java.util.Scanner;

public class T1712 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int num = 1;
		int sum,sum2;
		while(true) {
			sum= a+(b*num);
			sum2 = c*num;
			if(sum<sum2) {
				System.out.println(num);
				break;
				
			}else {
				num += 1;
			}
		}
		
		

	}

}
