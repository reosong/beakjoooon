package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class T10250 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int h,w,n;
		int num,ho;
	
		h = sc.nextInt();
		w = sc.nextInt();
		n = sc.nextInt();

		
		num = n%h;
		ho = n/h+1;
		boolean go = true;
		
		String how = Integer.toString(ho);
		if(how.length()==1) {
			how = Integer.toString(0)+how;
		}
		System.out.println(num+how);
		
		
		
	}

}
