package orbita;

import java.time.LocalDateTime;

class Timer {
	// seconds
	private int sec;
	
	//minutes
	private int min;
	
	//hour
	private int hour;
	
	//time
	private String time;
	
	Timer() {
		LocalDateTime enteredDate = LocalDateTime.now();
		String entered_date = enteredDate.toString();
		
		//initialising the object's state from constructed argument [integers ONLY !]. 
		this.sec = Integer.parseInt(entered_date.substring(17, 19));
		this.min = Integer.parseInt(entered_date.substring(14, 16));
		this.hour = Integer.parseInt(entered_date.substring(11, 13));
		
		// initialising the object's state [Strings ONLY !].
		this.time = enteredDate.toLocalTime().toString().substring(0, 5);
	}
	
	//return current second integer value
	public int getSec() {
		return this.sec;
	}
	
	//return current minute integer value
	public int getMin() {
		return this.min;
	}
	
	//return current hour integer value
	public int getHour() {
		return this.hour;
	}
	
	//return current time
	public String getTime() {
		return this.time;
	}
	
	//time range calculations
		public String TimeRangeFrom(String time) {

			String range = null;
			
			int hour = Integer.parseInt(time.substring(0, 2));
			int minute = Integer.parseInt(time.substring(3));
			
			if(hour < 24 && minute < 61) {
				if(getHour() == hour && getMin() > minute) {
					int rangeValueNum = getMin()-minute;
					String rangeValue = String.valueOf(rangeValueNum);
					String grammer = " minutes ago";
					if(rangeValueNum == 1) {
						range = "a minute ago";
					}
					else {
						range = rangeValue+grammer;
					}
				}
				else if(getHour() == hour && getMin() < minute) {
					int rangeValueNum = minute - getMin();
					String rangeValue = String.valueOf(rangeValueNum);
					if(rangeValueNum == 1) {
						range = "Next minute";
					}
					else {
						range = "Next "+rangeValue+" minutes";
					}
				}
				else if(getHour() > hour && (getMin() > minute || getMin() == minute)) {
					int rangeValueNum = getHour() - hour;
					String rangeValue = String.valueOf(rangeValueNum);
					String grammer = " hours ago";
					if(rangeValueNum == 1) {
						range = "an hour ago";
					}
					else {
						range = rangeValue+grammer;
					}
				}
				else if(getHour() > hour && getMin() < minute ) {
					int rangeValueNum = 60-(minute - getMin());
					String rangeValue = String.valueOf(rangeValueNum);
					String grammer = " minutes ago";
					if(rangeValueNum == 1) {
						range = "a minute ago";
					}
					else {
						range = rangeValue+grammer;
					}
				}
				else if(getHour() < hour && getMin() > minute ) {
					int rangeValueNum = 60-(getMin() - minute);
					String rangeValue = String.valueOf(rangeValueNum);
					String grammer = " minutes ahead";
					if(rangeValueNum == 1) {
						range = "a minute ahead";
					}
					else {
						range = rangeValue+grammer;
					}
				}
				else if(getHour() < hour && (getMin() < minute || getMin() == minute)) {
					int rangeValueNum = hour - getHour();
					String rangeValue = String.valueOf(rangeValueNum);
					if(rangeValueNum == 1) {
						range = "Next hour";
					}
					else {
						range = "Next "+rangeValue+" hours";
					}
				}
				else {
					range = "Now";
				}
			}
			else {
				System.out.println("INVALID TIME");
			}
			
			return range;
		}
}
