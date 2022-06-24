//package ch6;
//
///*
// *	[6-1] 
// *	다음과 같은 멤버변수를 갖는 SutdaCard클래스를 정의하시오.
// *	 타입     변수명     설명
// *   int      num      카드의 숫자(1~10사이의정수)
// * boolean   isKwang   광이면 true, 아니면 false.
// */
//
//class SutdaCard {
//	int num;
//	boolean isKwang;
//	SutdaCard () {
//		num = (int)(Math.random() * 10) + 1;
//		if(num == 1 || num == 3 || num == 8) {
//			isKwang = true;
//		} else {
//			isKwang = false;
//		}
//	}
//}
//
//class Exercise6_1 {
//
//	public static void main(String args[]) {
//		SutdaCard sc = new SutdaCard();
//		System.out.println(sc.num + ", " + sc.isKwang);
//	}
//}