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
	 */
	private static String customDate = "29-08-2020";
	
	public static void main(String[] args) {
		Dater testAll = new Dater();
		
		//Date operations.
		System.out.println(testAll.dateRangeFrom(customDate));
		System.out.println(testAll.getDate());
		System.out.println(testAll.getDay());
		System.out.println(testAll.getDayNum());
		System.out.println(testAll.getMonth());
		System.out.println(testAll.getMonthNum());
		System.out.println(testAll.getWeek());
		System.out.println(testAll.getYear());

	}

}
