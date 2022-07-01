package ch6;

/*
 *	[6-8] 
 *	다음의 코드에 정의된 변수들을 종류별로 구분해서 적으시오.
 */

class Exercise6_8 {
	
	int kind;
	int num;
	
	static int width;
	static int height;
	
	Exercise6_8(int k, int n) {
		kind = k;
		num = n;
	}
	
	public static void main(String args[]) {
		Exercise6_8 card = new Exercise6_8(1, 1);
	}
	
	/**
	 * 클래스변수(static변수) : width, height
	 * 인스턴스변수 : kind, num
	 * 지역변수 : k, n
	 * */
	 
}

