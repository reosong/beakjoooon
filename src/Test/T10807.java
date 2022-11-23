package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class T10807 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[2];
		ArrayList<Integer> ar = new ArrayList<Integer>();
		ArrayList<Integer> rest = new ArrayList<Integer>();
		

		for(int i=0; i<28; i++) {
			ar.add(sc.nextInt());
			
		}
		for(int i=1; i<=30;i++) {
			if(ar.contains(i)) {
				
			}else {
			rest.add(i);
			}
		}
		System.out.println(rest);
		
	}

}
