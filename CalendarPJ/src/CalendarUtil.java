import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * カレンダーUTIL
 */
public class CalendarUtil {
	String header;

	/**
	 * カレンダー情報を作成する
	 * @param inputDate
	 * @return
	 */
	public String[][] makeCalendar(String inputDate) {
		// ①String[7][7]タイプのcalStrの宣言
		String[][] calStr = new String[7][7];
		// ②入力パラメータから年・月を取得
		// 入力パラメータから年を取得
		int inputYear = Integer.parseInt(inputDate.substring(0, 4));

		// 入力パラメータから月を取得
		int inputMonth = Integer.parseInt(inputDate.substring(4, 6));

		// ③カレンダークラスのインスタンス生成
		// カレンダーのインスタンス生成
		Calendar cal = new GregorianCalendar(inputYear, inputMonth - 1, 1);

		// ④calStrの初期化
		// calStrの初期化
		calStr[0][0] = "Sun";
		calStr[0][1] = "Mon";
		calStr[0][2] = "Tue";
		calStr[0][3] = "Wed";
		calStr[0][4] = "Thu";
		calStr[0][5] = "Fri";
		calStr[0][6] = "Sat";
		for (int i = 1; i < 7; i++) {
			calStr[i][0] = "-";
			calStr[i][1] = "-";
			calStr[i][2] = "-";
			calStr[i][3] = "-";
			calStr[i][4] = "-";
			calStr[i][5] = "-";
			calStr[i][6] = "-";
		}

		// ⑤該当月の１日の曜日を計算
		// 該当月の１日の曜日を計算
		int firstWeek = cal.get(Calendar.DAY_OF_WEEK) - 1;

		// ⑥該当月の最終日を計算
		// 該当月の最終日を計算
		int endDayOfMonth = cal.getActualMaximum(Calendar.DAY_OF_MONTH);

		// ⑦n週目を初期化する。
		// n週目を初期化する。
		int weekOfMonth = 1;

		// ⑧曜日のカウント変数に1日の曜日を設定する。
		// 曜日のカウント変数に1日の曜日を設定する。
		int cntWeek = firstWeek;

		// ⑨１日から最終日までに繰り返す。
		// ⑨-1 日付を配列に設定する。
		// ⑨-2 土曜日には格納行数をカウントアップする。
		// ⑨-3 土曜日は曜日を日曜日に変更、それ以外はカウントアップする。
		for (int i = 1; i <= endDayOfMonth; i++) {
			calStr[weekOfMonth][cntWeek] = String.valueOf(i);
			if (cntWeek == 6) {
				cntWeek = 0;
				weekOfMonth++;
			} else {
				cntWeek++;
			}
		}

		// ⑩カレンダーのヘッダ作成（YYYY年MM月形式）
		SimpleDateFormat sdf = new SimpleDateFormat("■■■■■yyyy年MM月カレンダー■■■■■");
		header = sdf.format(cal.getTime());

		// ⑪calStrをリターン
		return calStr;
	}

	/**
	 * ２重for文にて配列を標準出力する。カレンダーのように行列を表示させる。
	 * @param printStrArray
	 */
	void printCalendar(String[][] printStrArray) {
		// ヘッダー出力
		System.out.println(header);

		// ２重for文にて配列を標準出力する。カレンダーのように行列を表示させる。
		for (int i = 0; i < 7; i++) {
			if (i > 2 && "-".equals(printStrArray[i][0])) {
				continue;
			}
			for (int j = 0; j < 7; j++) {
				System.out.printf("%6s", printStrArray[i][j] + " ");
			}
			System.out.println();
		}
	}
}
