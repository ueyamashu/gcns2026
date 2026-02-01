package jp.co.gcns.batch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BendingMachine {

	public static void main(String[] args) throws IOException {

		// 入力ストリームを作成
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// inputStr変数に入力した文字列を設定
		System.out.print("お金を入力してください：");
		String money = in.readLine();
		int moneyInt = Integer.parseInt(money);

		String itemBox = "";
		while (true) {
			System.out.println("①お水(500円)");
			System.out.println("②お茶(400円)");
			System.out.println("③コーラー(1000円)");
			System.out.println("④オレンジジュース(1500円)");
			System.out.println();
			System.out.println("⓪おつり");
			System.out.print("アイテムを選択してください：");
			String item = in.readLine();
			if ("1".equals(item)) {
				System.out.println("1が選択");
				if(moneyInt >= 500) {
					itemBox = itemBox + "お水　";
					moneyInt = moneyInt -500;
					//お水を買いました。
					System.out.println("お水を買いました。");
					//残額は「999」円です。
					System.out.println("残額は「"+moneyInt+"」円です。");
					//ほかのアイテムを購入するか、⓪おつりを選択してください。
					System.out.println("ほかのアイテムを購入するか、⓪おつりを選択してください。");

				} else {
					//残額は「999」円です。
					System.out.println("残額は「"+moneyInt+"」円です。");
					//残額が不足しています。
					System.out.println("残額が不足しています。");
				}
			} else if ("2".equals(item)) {
				System.out.println("2が選択");
				if(moneyInt >= 400) {
					itemBox = itemBox + "お茶　";
					moneyInt = moneyInt -400;
					//お水を買いました。
					System.out.println("お茶を買いました。");
					//残額は「999」円です。
					System.out.println("残額は「"+moneyInt+"」円です。");
					//ほかのアイテムを購入するか、⓪おつりを選択してください。
					System.out.println("ほかのアイテムを購入するか、⓪おつりを選択してください。");
				} else {
					//残額は「999」円です。
					System.out.println("残額は「"+moneyInt+"」円です。");
					//残額が不足しています。
					System.out.println("残額が不足しています。");
				}
			} else if ("3".equals(item)) {
				System.out.println("3が選択");
				if(moneyInt >= 1000) {
					itemBox = itemBox + "コーラー　";
					moneyInt = moneyInt -1000;
					//お水を買いました。
					System.out.println("コーラーを買いました。");
					//残額は「999」円です。
					System.out.println("残額は「"+moneyInt+"」円です。");
					//ほかのアイテムを購入するか、⓪おつりを選択してください。
					System.out.println("ほかのアイテムを購入するか、⓪おつりを選択してください。");
				} else {
					//残額は「999」円です。
					System.out.println("残額は「"+moneyInt+"」円です。");
					//残額が不足しています。
					System.out.println("残額が不足しています。");
				}

			} else if ("4".equals(item)) {
				System.out.println("4が選択");
				if(moneyInt >= 1500) {
					itemBox = itemBox + "オレンジジュース　";
					moneyInt = moneyInt -1500;
					//お水を買いました。
					System.out.println("オレンジジュースを買いました。");
					//残額は「999」円です。
					System.out.println("残額は「"+moneyInt+"」円です。");
					//ほかのアイテムを購入するか、⓪おつりを選択してください。
					System.out.println("ほかのアイテムを購入するか、⓪おつりを選択してください。");
				} else {
					//残額は「999」円です。
					System.out.println("残額は「"+moneyInt+"」円です。");
					//残額が不足しています。
					System.out.println("残額が不足しています。");
				}

			} else if ("0".equals(item)) {
				//お茶、コーラーを購入しました。
				System.out.println(itemBox + "を購入しました。");
				//おつりは「999」円です。
				System.out.println("おつりは「" + moneyInt + "」円です。");
				//ご利用、ありがとうございました。
				break;
			}
		}

	}
}
