package jp.co.gcns.batch;

public class Pyramit {

	public static void main(String[] args) {

		int inputInt = 5;

		for (int i = 0; i < inputInt; i++) {
			for (int j = 0; j < 5 - i - 1; j++) {
				System.out.print("_");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = inputInt - 2; i >= 0; i--) {
			for (int j = 0; j < 5 - i - 1; j++) {
				System.out.print("_");
			}
			for (int j = 0; j < i * 2 + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
