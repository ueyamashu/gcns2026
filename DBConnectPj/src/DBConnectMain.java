import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnectMain {

	public static void main(String[] args) throws SQLException {
		// TODO 自動生成されたメソッド・スタブ
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		conn = DriverManager.getConnection("jdbc:mariadb://ueyamaNAS.synology.me:3307/user", "user", "gcnsDB123!");

		String SQL = "insert into user.calendarlog (input_dt,kbn,msg,detail_msg) values(?,?,?,?);";

		PreparedStatement ps = conn.prepareStatement(SQL);
		ps.setString(1, "20260228");
		ps.setString(2, "INFO");
		ps.setString(3, "テスト用メッセージ");
		ps.setString(4, "エラーなし");

		ps.executeUpdate(); // update, delete, insert文で使われる。
//		ResultSet rs = ps.executeQuery(); // select文で使われる。
		conn.close();


	}

}
