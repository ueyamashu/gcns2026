package jp.co.gcns.batch;

public class ShikakuStar {

	public static void main(String[] args) {

		int inputInt = 5;
		
		for (int i = 0; i < inputInt ; i ++) {
			for (int j = 0; j < i+1 ; j ++) {
				System.out.print(" ");
			}
			for (int j = 0; j < i+1 ; j ++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
