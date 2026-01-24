package jp.co.gcns.batch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoopTest {
	public static void main(String[] args) throws IOException {

		// 入力ストリームを作成
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// inputStr変数に入力した文字列を設定
		System.out.print("入力：");
		String input = in.readLine();
		
		int intInput = Integer.parseInt(input);
		
		for (int i = 1; i <= intInput ; i++) {
			System.out.println(i+"番目出力");
		}
		
	}
}
