package Test;

import java.util.Scanner;

public class T1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner  sc = new Scanner(System.in);
		
		int a= sc.nextInt();
		int count =0;
		int sum,sum2 = 0;
		int b=0;
		
		while(true) {
		int f1,s1;
		
		int f2,s2=0;
		b = a;
		if(b<10) {
			f1=0;
			s1=a;
		}else {
			f1= a/10;
			s1= a%10;
		}
		sum = f1+s1;
		f2 = sum/10;
		s2 = sum%10;
		b = (s1*10)+s2;
		count++;
		System.out.println(b);
		if(a == b) {
			break;
		}
		}
		System.out.println(count);
		
		

	}

}
