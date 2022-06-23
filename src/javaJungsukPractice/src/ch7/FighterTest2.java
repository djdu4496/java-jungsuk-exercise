package ch7;

abstract class Unit2 {
	int x, y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
	
}

interface Fightable2 { // 인터페이스의 모든 메서드는 public abstract. 예외없
	void move(int x, int y);  // public abstract가 생략됨 
	void attack(Fightable2 f); // public abstract가 생략됨 
}

class Fighter2 extends Unit2 implements Fightable2 {
	// 오버라이딩 규칙 : 조상(public)보다 접근제어자가 좁으면 안 된다.
	public void move(int x, int y) { 
		System.out.println("[" + x + "," + y + "]로 이동");
	}
	public void attack(Fightable2 f) {
		System.out.println(f+"를 공격");
	}
	// 싸울 수 있는 상대를 불러온다.
	Fightable2 getFightable() {
		Fightable2 f = new Fighter2(); // Fighter를 생성해서 반환
		return f;
	}
} 

public class FighterTest2 {
	public static void main(String[] args) {
		Fighter2 f = new Fighter2();
		Fightable2 f2 = f.getFightable();
		System.out.println(f2);
////		Fighter2 f = new Fighter2();
//		Unit2 u = new Fighter2(); 
//		Fightable2 f = new Fighter2();	
//		u.move(100, 200);
////		u.attack(new Fighter2()); // Unit2에는 attack()이 없어서 호출 불가
//		u.stop();
//		
//		f.move(100, 200);
//		f.attack(new Fighter2());
//		f.stop();                 // Fightable2에는 stop()이 없어서 호출 불가
		
	}
	
}