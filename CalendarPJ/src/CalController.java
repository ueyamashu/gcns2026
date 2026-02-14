import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalController {

	public static void main(String[] args) throws IOException {

		System.out.println("カレンダー出力を開始します。");

		// ①日付を入力
		// 入力ストリームを作成
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		// inputStr変数に入力した文字列を設定
		System.out.print("入力（YYYYMM）：");
		String inputStr = in.readLine();

		// ②日付チェック
		CalChecker cc = new CalChecker();

		boolean resultFlg = cc.inputCheck(inputStr);
		if (resultFlg == false) {
			System.out.println("カレンダー出力が異常終了しました。");
			System.out.println("インプット文字列をチェックしてください。");
			return;
		}

		// ③カレンダー作成
		CalendarUtil cu = new CalendarUtil();
		String[][] calArray = cu.makeCalendar(inputStr);

		// ④カレンダー出力
		cu.printCalendar(calArray);

		// ⑤作業ログ格納
		System.out.println("カレンダー出力が正常終了しました。");
	}

}
