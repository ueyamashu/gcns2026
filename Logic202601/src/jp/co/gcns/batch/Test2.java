package jp.co.gcns.batch;

import java.io.IOException;

public class Test2 {

	public static void main(String[] args) throws IOException {

		//		// 入力ストリームを作成
		//		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		//		// inputStr変数に入力した文字列を設定
		//		System.out.print("入力：");
		//		String input = in.readLine();
		//		int intInput = Integer.parseInt(input);

		int intInput = 5;


		// ①自然数を出力、合計計算
		// １+２+３+４+５＝１５
		System.out.println("①自然数を出力、合計計算");
		for (int i = 1; i <= intInput; i++) {
			int inputHenkan = i;
			henkan(intInput,  i, inputHenkan);
		}

		// ②偶数を出力、合計計算
		// ２+４+６+８+１０＝３０
		System.out.println("②偶数を出力、合計計算");
		for (int i = 1; i <= intInput; i++) {
			int inputHenkan = i * 2;
			henkan(intInput,  i, inputHenkan);
		}

		// ③奇数を出力、合計計算
		// １+３+５+７+９＝２５
		System.out.println("③奇数を出力、合計計算");
		for (int i = 1; i <= intInput; i++) {
			int inputHenkan = i * 2 - 1;
			henkan(intInput,  i, inputHenkan);
		}

	}

	private static void henkan(int intInput, int i, int inputHenkan) {
		int sum = 0;
		sum = sum + inputHenkan;
		if (i == intInput) {
			System.out.println(inputHenkan + "=" + sum);
		} else {
			System.out.print(inputHenkan + "+");
		}
	}

}
