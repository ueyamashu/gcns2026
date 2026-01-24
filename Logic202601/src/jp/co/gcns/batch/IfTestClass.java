package jp.co.gcns.batch;

public class IfTestClass {

	public static void main(String[] args) {

		int input = 3;
		
		if (input == 2) {
			System.out.println("２が入力されました。");
			
		} else if ((input == 1)||(input == 3)) {
			System.out.println("１または３が入力されました。");
		} else {
			System.out.println("想定外の入力です。");
		}
		
	}

}
