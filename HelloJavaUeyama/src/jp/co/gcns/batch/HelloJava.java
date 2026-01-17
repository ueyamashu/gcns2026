/**
 * 
 */
package jp.co.gcns.batch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * メインクラス
 */
public class HelloJava {

	/**
	 * メインメソッド
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// 入力ストリームを作成
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// inputStr変数に入力した文字列を設定
		System.out.print("入力：");
		String inputStr = in.readLine();

		// 要望＃001による更新 UPDATE START
		//		System.out.println("出力：Hello " + inputStr);
		System.out.println("出力：" + inputStr);
		// 要望＃001による更新 UPDATE END
	}

}
