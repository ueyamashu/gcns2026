import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn20260228 {
	public static void main(String[] args) throws SQLException {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = DriverManager.getConnection("jdbc:mariadb://ueyamaNAS.synology.me:3307/user", "user", "gcnsDB123!");

		String SQL = "insert into USER VALUES(?,?,?);";
		pstmt = conn.prepareStatement(SQL);
		pstmt.setString(1, "10");
		pstmt.setString(2, "上山");
		pstmt.setString(3, "20");
		
		pstmt.executeUpdate(); // insertを実行
		
		System.out.println("処理完了しました。");
	}
}
