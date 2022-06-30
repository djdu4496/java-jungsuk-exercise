package ch6;

/*
 *	[6-5] 
 *	다음과 같은 실행결과를 얻도록 
 *	Student클래스에 생성자와 info()를 추가하시오.
 *     
 *  [실행결과]
 *  홍길동,1,1,100,60,76,236,78.7
 */

class Student3 {
	/**
	 * 알맞은 코드를 넣어 완성하시오.
	 */
	String name;
	int a, b, c, d, e, total = 0;
	float average = 0;
	Student3(String name, int a, int b, int c, int d, int e) {
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.total = c + d + e;
		this.average = total / (float)3;
		this.average *= 10;
		this.average = Math.round((double)average) / (float)10;
	}
	String info() {
		return name + "," + a + "," + b + "," + c + "," + d + "," + e + "," + total + "," + average;
	}
}

class Exercise6_5 {

	public static void main(String args[]) {
		Student3 s = new Student3("홍길동", 1, 1, 100, 60, 76);
	
		System.out.println(s.info());

	}
}