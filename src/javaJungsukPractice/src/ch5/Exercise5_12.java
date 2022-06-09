package ch5;

/*
 *	[5-12] 
 *	예제5-23을 변경하여, 아래와 같은 결과가 나오도록 하시오.
 */
class Exercise5_12
{ 
	public static void main(String args[]) {
		int[][] score = {
				{100, 100, 100}
				, {20, 20, 20} 
				, {30, 30, 30} 
				, {40, 40, 40}
				, {50, 50, 50}
				}; 
				int[][] result = new int[score.length+1][score[0].length+1];
				for(int i=0; i < score.length;i++) { 
					for(int j=0; j < score[i].length;j++) {
						/*
							(1) 알맞은 코드를 넣어 완성하시오.
						 */
					}
				}
				for(int i=0; i < result.length;i++) {
					for(int j=0; j < result[i].length;j++) {
						System.out.printf("%4d",result[i][j]);
					}
					System.out.println();
				} 		
	} // end of main
}	// end of class

/*
 * 실행결과 
 * Q1. chair의 뜻은? dmlwk 
 * 틀렸습니다. 정답은 의자입니다
 * Q2. computer의 뜻은? 
 * 컴퓨터 정답입니다.
 * Q3. integer의 뜻은? 
 * 정수 정답입니다.
 * 
 * 전체 3문제 중 2문제 맞추셨습니다.
 */
