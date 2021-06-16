
public class Time {
	private int hour;
	private int minute;

	//default constructor
	public Time() {
		this(0,0);
	}
	//2 argument constructor
	public Time(int h, int m) {
		hour = h;
		minute = m;
	}
	
	//accessor
	public int getHour() {
		return hour;
	}
	
	public int getMinute() {
		return minute;
	}

	
	//mutator
	public void setHour(int hour) {
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		this.minute = minute;
	}
	@Override
	public String toString() {
		return hour + ": " + minute;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		} else if( !(o instanceof Time)) {
			return false;
		} else {
			Time t = (Time)o;
			return hour == t.hour &&
					minute == t.minute;
		}
	}
	public int compareTo(Time t) {
		if(this.equals(t)) {
			return 0;
		} else if(hour != t.hour) {
			return Integer.compare(hour, t.hour);
		} else {
			return Integer.compare(minute, t.minute);
		}
	}
	
}
