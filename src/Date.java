
public class Date {
	private int year;
	private int month;
	private int day;

	//public constructor
	public Date() {
		this(0, 0, 0);
	}
	//3argument constructor
	public Date(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}
	//accessors
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}

	//mutators
	public void setYear(int year) {
		this.year = year;
	}
	
	public void setMonth(int month) {
		this.month = month;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	@Override
	public String toString() {
		return month + "/ " + day + "/ " + year;
	}
	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		} else if( !(o instanceof Date)) {
			return false;
		} else {
			Date d = (Date)o;
			return year == d.year &&
					month == d.month &&
					 day == d.day ;
		}
	}
	public int compareTo(Date d) {
		if(this.equals(d)) {
			return 0;
		} else if(year != d.year) {
			return Integer.compare(year, d.year);
		} else if(month != d.month) {
			return Integer.compare(month, d.month);
		} else {
			return Integer.compare(day, d.day);
		}
	}
}
