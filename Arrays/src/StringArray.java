
public class StringArray {

	public static void main(String[] args) {

		int numDays = 31;
		int startDay = 6;
		
		String[][][] cal = initializeCalender(numDays,startDay);
		
		printCalender(cal, numDays, startDay);
		
		cal = addEvent(cal, 1, 1, "soccer training");
		
		printCalender(cal, numDays, startDay);
		System.out.println(cal[1][1][0]);

	}
	
	public static String[][][] initializeCalender(int numDays, int startDay) {
		
		String[][][] cal;
		
		//how many rows?
		int rows = (numDays+startDay)/7;
		if ((numDays+startDay)%7 != 0) rows++;

		cal = new String[rows][7][1];

		return cal;
	
	}
	
	public static void printCalender(String[][][] cal, int numDays, int startDay) {
		
		int num = 0;
		
		//rows
		for (int i=0; i < cal.length; i++) {
			//columns
			for (int j = 0; j < cal[0].length; j++) {
				
				if ((num >= startDay) && (num < numDays+startDay)) {
					System.out.print(num-startDay+1);
				}
				else {
					System.out.print(" ");
				}
				if (cal[i][j][0] != (null)) System.out.print("*");
				System.out.print(" ");
				num++;
			}
			
			System.out.println();
		}
	}
	
	public static String[][][] addEvent(String[][][] cal, int weekNr, int weekDay, String event) {
		
		//no index checks implemented
		//multiple events not taken into consideration
		cal[weekNr][weekDay][0] = event;
		
		return cal;
	}
}
