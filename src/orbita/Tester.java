/**
 * run this code to see how everything works
 */
package orbita;

/**
 * @author Charles Paul Uche
 * GitHub: dev-charles15531
 *
 */
class Tester {

	/**
	 * @param customDate is the date you want to get range from and must be in the format: dd-MM-yyyy
	 * @param customTime is the time you want to get range from and must be in the format: HH:mm
	 */
	private static String customDate = "29-08-2020";
	private static String customTime = "12:00";
	
	public static void main(String[] args) {
		
		//Date operations.
		Dater testDate = new Dater();
		System.out.println(testDate.dateRangeFrom(customDate));
		System.out.println(testDate.getDate());
		System.out.println(testDate.getDay());
		System.out.println(testDate.getDayNum());
		System.out.println(testDate.getMonth());
		System.out.println(testDate.getMonthNum());
		System.out.println(testDate.getWeek());
		System.out.println(testDate.getYear());
		
		System.out.println("***************************************************************************************");
		
		//Time operations
		Timer testTime = new Timer();
		System.out.println(testTime.getTime());
		System.out.println(testTime.getHour());
		System.out.println(testTime.getMin());
		System.out.println(testTime.getSec());
		System.out.println(testTime.TimeRangeFrom(customTime));

	}

}
