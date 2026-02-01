package jp.co.gcns.batch;

public class Kukudan {
	public static void main(String[] args) {
		int input = 9;
		
		System.out.println(input +"段の出力");
		
		for (int i = 1 ; i <= 9 ; i++) {
			System.out.print(input + "×" + i + "＝" +input * i);
			
			if (input * i < 10) {
				System.out.print("       ");
			} else {
				System.out.print("      ");
			}
//			System.out.print("     ");
//			for (int j = 1; j <= (input * i) / 10; j = j * 10) {
//				System.out.print(" ");
//			}
			
			if (i % 3 == 0) {
				System.out.println();
			}
		}
		
	}
}
