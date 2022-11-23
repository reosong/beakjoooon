package Test;

import java.util.Scanner;

public class T1193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int n = 0;
		int count = 0;
		while(count<a) {
			n++;
			count =n*(n+1)/2;
			
		}
	
		int top =0;
		int down =0;
		int sum = a-(n-1)*n/2;
		System.out.println(sum);
		if(n/2==0) {
			top = sum;
			down = n-sum+1;
		}else if(n/2!=0) {
			top = n-sum+1;
			down =sum; 
			
		}
		System.out.println(top+"/"+down);
		
		
	}

}
