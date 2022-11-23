package Hi;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		
		
		System.out.println("점수를 입력하세요");
		score = sc.nextInt();
		
		if(90 =< score <=100) {
			System.out.println("A");
		}if(80 =< score <90) {
			System.out.println("B");
		}
		
	}

}
