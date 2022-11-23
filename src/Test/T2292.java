package Test;

import java.util.Scanner;

public class T2292 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		int count =0;
			if(a ==1) {
				System.out.println(a);
			}else {
				int num=1;
				for(int i=0;i<a;i++ ) {
					num += (6*i);
					count++;
					if(a<=num) {
						System.out.println(count);
						break;
				
					}
				}
				
			}
			
			
			
		}
	

}
