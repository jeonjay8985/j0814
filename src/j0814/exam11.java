package j0814;

public class exam11 {

	public static void main(String[] args) {
		// 2차원배열
		
		int[][] score = {
				{100, 100}
				,{20, 20, 20, 20}
				,{30, 30}
				,{40}
		};
		
		int sum = 0;
		
		for(int i=0; i<score.length; i++) {
			for(int j=0; j<score[i].length; j++) {
				System.out.printf("score[%d][%d] = %d%n" ,i , j, score[i][j]);
				
				sum += score[i][j];
			}
		}

		System.out.println("sum=" +sum);
	}

}
