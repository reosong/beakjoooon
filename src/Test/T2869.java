package Test;

import java.util.Scanner;

public class T2869 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int a, b, c;
		a= sc.nextInt();
		b= sc.nextInt();
		c= sc.nextInt();
		
		boolean go = true;
		int day =0;
		int now= 0;
		while(go) {
		day++;
		now = now + a;
		if(now>=c) {
			
			System.out.println(day);
			go= false;
		}else {
			now= now-b;
		}
		}
	}

}
