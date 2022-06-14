package etc;

public class Time {
	
	private int hour;
	private int minute;
	private int second;
	
	public int getHour()   { return hour; }
	public int getMinute() { return minute; }
	public int getSecond() { return second; }
	
	public void setHour(int h) {
		if(h < 0 || h > 23) return;
		hour = h;
	}
	
	public void setMinute(int m) {
		if(m < 0 || m > 59) return;
		minute = m;
	}
	
	public void setSecond(int s) {
		if(s < 0 || s > 59) return;
		second = s;
	}
	
	public static void main(String[] args) {
		Time t = new Time();
		t.setHour(2);
		t.setMinute(3);
		t.setSecond(22);
		System.out.println("현재 시간은 " + t.hour + "시 " + t.minute + "분 " + t.second + "초 입니다.");

	}

}
