package ch3;

class OperatorEx6 { 
    public static void main(String[] args) { 
          byte a = 10; 
          byte b = 20; 
//        byte c = a + b; // a + b 연산 결과는 int형(4byte) 자동 형변환x 
          byte c = (byte)(a + b);
          System.out.println(c); 
    } 
} 