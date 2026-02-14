import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalendarStudy {
	public static void main(String[] args) throws IOException {
		CalendarUtil cu = new CalendarUtil();
		// 入力ストリームを作成
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// inputStr変数に入力した文字列を設定
		System.out.print("入力(YYYYMM形式)：");
		String inputStr = in.readLine();
		
		String[][] resultCal = cu.makeCalendar(inputStr);
		
//		System.out.println("■■■■■2026年2月■■■■■");
		arrayPrint(resultCal);
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
