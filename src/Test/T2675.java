package Test;

import java.util.ArrayList;
import java.util.Scanner;

public class T2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		String str = sc.next();
		
		ArrayList<String> arr = new ArrayList<String>();
		String result = null;
		String b =null ;
		String c = null;
		String d = null;
		for(int i =0; i<num; i++) {
			arr.add(str.substring(i,i+1));
		}
		
		for(int i =0; i<num; i++) {
			b = arr.get(i);
			for(int a=0; a<num;a++) {
					System.out.print(b);
						
			}
			
			result =b;
			//System.out.println(result);
		}

		//System.out.println(result);
	}

}
