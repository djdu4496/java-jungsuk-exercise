package ch6;

/*
 *	[6-7] 
 *	문제6-6에서 작성한 클래스메서드 getDistance()를 
 *	MyPoint클래스의 인스턴스메서 드로 정의하시오.
 *   
 *  [실행결과]
 *  1.4142135623730951
 */


class MyPoint {
	int x, y;
	
	MyPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * (1) 인스턴스메서드 getDistance를 작성하시오.  
	 */
	double getDistance(int x1, int y1) {
		int xd = x1 - x;
		int yd = y1 - y;
		return (double)(Math.sqrt((Math.pow(xd, 2) + Math.pow(yd, 2))));
	}
	
}
class Exercise6_7 {
	
	public static void main(String args[]) {
		MyPoint p = new MyPoint(1, 1);
		
		// p와 (2, 2)의 거리를 구한다. 
		System.out.println(p.getDistance(2, 2));
	}
}