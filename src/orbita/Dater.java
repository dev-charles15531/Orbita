package orbita;

import java.time.LocalDateTime;

class Dater {	
		
	//day => Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday.
	//dayNum => 1,      2,       3,        4,        5,       6,       7.
	private String day;
	private int dayNum;
	
	//week number
	private int week;
	
	//month => January, February, March, April, May, June, July, August, September, October, November, December.
	//monthNum => 1,        2,      3,     4,    5,    6,    7,     8,       9,        10,      11,       12.
	private String month;
	private int monthNum;
	
	//year
	private int year;
	
	//date
	private String date;

	
	Dater() {
		LocalDateTime enteredDate = LocalDateTime.now();
		String entered_date = enteredDate.toString();
		
		//initialising the object's state [integers ONLY !]. 
		this.dayNum = Integer.parseInt(entered_date.substring(8, 10));
		this.week = //TODO ...Integer.parseInt(entered_date.substring(5, 6));
		this.monthNum = Integer.parseInt(entered_date.substring(5, 7));
		this.year = Integer.parseInt(entered_date.substring(0, 4));
		
		
		// initialising the object's state [Strings ONLY !].
		this.day = enteredDate.getDayOfWeek().toString();
		this.month = enteredDate.getMonth().toString();
		this.date = enteredDate.toLocalDate().toString();
	}
	
	
	//return current day of the week string
	public String getDay() {
		return this.day;
	}
	
	//return current day of the week integer
	public int getDayNum() {
		return this.dayNum;
	}
	
	//return current week integer
	public int getWeek() {
		return this.week;
	}
	
	//return current month string
	public String getMonth() {
		return this.month;
	}
	
	//return current month integer
	public int getMonthNum() {
		return this.monthNum;
	}
	
	//return current year
	public int getYear() {
		return this.year;
	}
	
	//return current date
	public String getDate() {
		return this.date;
	}
	
	//date range calculations
	public String dateRangeFrom(String date) {

		String range = null;
		
		int day = Integer.parseInt(date.substring(0, 2));
		int month = Integer.parseInt(date.substring(3, 5));
		int year = Integer.parseInt(date.substring(6));
	
		if((month==2&&day<29) || ((month==9||month==4||month==6||month==11)&&day<31) || (month==1||month==3||month==5||month==7||month==8||month==10||month==12)&&day<32) {
			if(getDayNum() > day && month == getMonthNum() && year == getYear()) {
				int rangeNumValue = getDayNum() - day;
				String rangeValue = String.valueOf(getDayNum() - day);
				String grammer = " days ago";
				if(rangeNumValue == 1) {
					range = "Yesterday";
				}
				else {
					range = rangeValue+grammer;
				}
			}
			
			else if(getDayNum() < day && month == getMonthNum() && year == getYear()) {
				int rangeNumValue =  day - getDayNum();
				String rangeValue = String.valueOf(day - getDayNum());
				String grammer = " days ahead";
				if(rangeNumValue == 1) {
					range = "Tomorrow";
				}
				else {
					range = rangeValue+grammer;
				}
			}
			
			else if(month < getMonthNum() && year == getYear()) {
				int rangeNumValue = getMonthNum() - month;
				String rangeValue = String.valueOf(getMonthNum() - month);
				String grammer = " months past";
				if(rangeNumValue == 1) {
					range = "Past month";
				}
				else {
					range = rangeValue+grammer;
				}
			}
			
			else if(month > getMonthNum() && year == getYear()) {
				int rangeNumValue = month - getMonthNum();
				String rangeValue = String.valueOf(month - getMonthNum());
				String grammer = " months ahead";
				if(rangeNumValue == 1) {
					range = "Next month";
				}
				else {
					range = rangeValue+grammer;
				}
			}
			
			else if(year > getYear()) {
				int rangeNumValue = year - getYear();
				String rangeValue = String.valueOf(year - getYear());
				String grammer = " years ahead";
				if(rangeNumValue == 1) {
					range = "Next year";
				}
				else {
					range = rangeValue+grammer;
				}
			}
			
			else if(year < getYear()) {
				int rangeNumValue = getYear() - year;
				String rangeValue = String.valueOf(getYear() - year);
				String grammer = " years ago";
				if(rangeNumValue == 1) {
					range = "Past year";
				}
				else {
					range = rangeValue+grammer;
				}
			}
			else {
				range = "Today";
			}
		}
		else {
			System.out.println("INVALID DATE");
		}
		
		return range;
	}
		
}
