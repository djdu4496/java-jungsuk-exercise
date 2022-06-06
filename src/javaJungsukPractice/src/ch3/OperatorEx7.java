package ch3;

class OperatorEx7 {
	public static void main(String[] args) {
		byte a = 10;
		byte b = 30;
		byte c = (byte)(a * b); // a * b 연산 결과는 int형(4byte) 명시적 형변환 필요. 

		System.out.println(c);
	}
}