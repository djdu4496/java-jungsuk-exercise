package ch4;

/*
 * [4-5] 
 * 다음의 for문을 while문으로 변경하시오.
 * */
public class Exercise4_5 {
	public static void main(String[] args) {
		int i = 1;
		while(i <= 11) {
			int j = i;
			while(j != 0) {
				System.out.print("*");
				j--;
			}
			System.out.println();
			i++;
		}
	} // end of main
} // end of class

/*
 * 실행결과
	*
	**
	***
	****
	*****
	******
	*******
	********
	*********
	**********
	***********
 */
