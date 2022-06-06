package ch3;

public class Exercise3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 2;
		int y = 5;
		char c = 'A'; // 'A'의 문자코드는 65 
		
		System.out.println(1 + x << 33);              // 오답(오버플로우 발생)
		System.out.println(y >= 5 || x < 0 && x > 2); 
		System.out.println(y += 10 - x++);            // 오답(계산 실수)
		System.out.println(x+=2);                     
		System.out.println(!('A' <= c && c <= 'Z'));  
		System.out.println('C' - 'c');                
		System.out.println('5' - '0');                
		System.out.println(c+1);                      // 오답(+연산자의 결과는 int형)
		System.out.println(++c);                      // 오답(++ 연산 후 출력)
		System.out.println(c++);                      // 오답(출력 후 ++연산)
		System.out.println(c);                        
	}

}

/*
 * 1 + x << 33 : 오버플로우 발생 
 * c + 1 : 변수 c가 char형이므로 int형으로 변환한 후 덧셈연산을 수행
 */
