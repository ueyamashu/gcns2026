
public class CalendarMain {
	public static void main(String[] args) {

		String[][] strArray = new String[7][7];
		
		System.out.println(strArray);
		
		
		
		
		
		arrayPrint(strArray);
		
	}
	
	
	

	private static void arrayPrint(String[][] strArray) {
		for(int i = 0; i < 7 ; i++) {
			for(int j = 0; j < 7; j++) {
				System.out.printf("%6s",strArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
