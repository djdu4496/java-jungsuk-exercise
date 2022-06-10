package ch5;

/*
 *	[5-8] 
 *	다음은 배열 answer에 담긴 데이터를 읽고 각 숫자의 개수를 세어서 
 *	개수만큼 ‘*’ 을 찍어서 그래프를 그리는 프로그램이다. 
 *	(1)~(2)에 알맞은 코드를 넣어서 완성하시오.
 */
class Exercise5_8
{ 
	public static void main(String args[])
	{
		int[] answer = { 1, 4, 4, 3, 1, 4, 4, 2, 1, 3, 2 };
		int[] counter = new int[4];
		
		for(int i = 0; i < answer.length; i++) {
			/*
			 * (1) 알맞은 코드를 넣어 완성하시오.
			 */
			if(answer[i] == 1) {
				counter[0]++;
			} else if(answer[i] == 2) {
				counter[1]++;
			} else if(answer[i] == 3) {
				counter[2]++;
			} else {
				counter[3]++;
			}
		}
		
		for(int i = 0; i < counter.length; i++) {
			/*
			 * (2) 알맞은 코드를 넣어 완성하시오.
			 */
			System.out.print(counter[i]);
			for(int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	} // end of main
}	// end of class

/*
 * 실행결과 
 * 3***
 * 2**
 * 2**
 * 4****
 */
