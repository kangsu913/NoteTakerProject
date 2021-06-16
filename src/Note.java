
public abstract class Note {
	private Time time;
	private Date date;
	
	public Note(Time t, Date d) {
		this.time = t;
		this.date = d;
	}
	
	public Time getTime() {
		return time; // does this return the to String
	}
	
	public Date geteDate() {
		return date; // ^
	}
	
	public void setTime(Time t) {
		time =t;
	}
	
	public void setDate(Date d) {
		date =d;
	}

	

	@Override
	public boolean equals(Object o) {
		if(o == this) {
			return true;
		} else if(!(o instanceof Note)) {
			return false;
		} else {
			Note n = (Note) o;
			return time.equals(n.time) &&
					date.equals(n.date);
		}
	}
	public int compareTo(Note n) {
		if(this.equals(n)) {
			return 0;
		} else if(!(time.equals(n.time))) {
			return time.compareTo(n.time);
		} else {
			return date.compareTo(n.date);
		}
	}
	@Override
	public String toString() {
		return "Lecture Note #" + LectureNote.getNumNote() +
				"\nDate: " + date.toString() + 
			 "\nTime: " + time.toString();
	}
}
