package j0814;

import java.util.Scanner;

public class exam03 {

	public static void main(String[] args) {
		// 실습03
		
		Scanner s1 = new Scanner(System.in);
		
		
	
		System.out.print("학생의 수를 입력하세요: ");
		int num=s1.nextInt();
	
		int sum=0;
		float avg=0f;
		
		int student[] = new int[num];
	
		for(int i=0; i<student.length; i++) {
			System.out.print("학생" +(i+1)+ "의 성적을 입력하세요");
		    int score=s1.nextInt();
		    if(score>100) {
		    	System.out.println("잘못된 성적입니다. 다시 입력하세요");
		    	i--;
		    }
			sum = sum+score;
			avg = sum/ (float)student.length;
		}System.out.println("합계: " +sum);
		System.out.println("평균: "+avg);
		
		
	   
	    
	    
		

	}

}
