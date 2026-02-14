/**
 * カレンダーチェッカー
 */
public class CalChecker {
	
	/**
	 * 入力年月をチェックする。

	 * @param input
	 * @return
	 */
	public boolean inputCheck(String input) {
		//①not nullチェック
		if ( input == null) {
			System.out.println("NULLが入力されました。インプット文字列を確認ください。");
			return false;
		}
		
		//②空白チェック
		if ("".equals(input.trim())) {
			System.out.println("インプットが入力されていません。インプット文字列を確認ください。");
			return false;
		}
		
		//③桁数チェック
		if (input.length() != 6) {
			System.out.println("インプットはYYYYMM形式の6桁で入力してください。");
			return false;
		}
		
		//④年（先頭４桁）の範囲チェック
		//　1900～2100の範囲内
		String year = input.substring(0,4);
		if (Integer.parseInt(year)<1900) {
			System.out.println("1900年以降の入力をお願いします。");
			return false;
		}
		if (Integer.parseInt(year)>2100) {
			System.out.println("2100年以前の入力をお願いします。");
			return false;
		}
		
		//⑤月（末尾２桁）の範囲チェック
		//　01～12の範囲内
		String month = input.substring(4,6);
		if(Integer.parseInt(month) < 1) {
			System.out.println("1月から入力可能です。インプット文字列を確認ください。");
			return false;
		}
		if(Integer.parseInt(month) > 12) {
			System.out.println("12月まで入力可能です。インプット文字列を確認ください。");
			return false;
		}
		
		return true;
	}
}
