package logic;
import logic.Time;
//This is a testing class that should be deleted once it's appended with the current Course.java.
//It contains all the new properties added to the class.

public class Course {
	String name;
	int section;
	
	private String days;
	//A string containing a single letter for each day of the week the class lands on.
	//MON = M, TUES = T, WED = W, THURS = R, FRI = F
	private Time start;
	private Time end;
	
	public Course(String name, int section) {
		this.name = name;
		this.section = section;		
	}
	
	public boolean onDay(String day)
	{
		//Checks if the class is scheduled for a provided day.
		return getDays().contains(day);
	}
	
	public String toString() {
		//Implementing a print function for testing
		return name+"-"+Integer.toString(section);
	}
	
	public boolean equals(Course course) {
		return this.name.equals(course.name) &&
				this.section == course.section;
	}

	public Time getStart() {
		return start;
	}
	
	public void setStart(Time start) {
		this.start = start;
	}
	
	public String getDays() {
		return days;
	}
	
	public void setDays(String days) {
		this.days = days;
	}
	
	public Time getEnd() {
		return end;
	}
	
	public void setEnd(Time end) {
		this.end = end;
	}
}
