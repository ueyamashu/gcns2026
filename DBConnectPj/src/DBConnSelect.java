import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnSelect {
	public static void main(String[] args) throws SQLException {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		conn = DriverManager.getConnection("jdbc:mariadb://ueyamaNAS.synology.me:3307/user", "user", "gcnsDB123!");

		String SQL = "select * from USER;";
		pstmt = conn.prepareStatement(SQL);
		
		rs = pstmt.executeQuery(); // insertを実行

		rs.next();
		
		String rtn = rs.getString(1) + "," + rs.getString(2) +"," + rs.getString(3);
		
		rs.next();
		
		String rtn2 = rs.getString(1) + "," + rs.getString(2) +"," + rs.getString(3);
		
		System.out.println(rtn);
		System.out.println(rtn2);
		
		System.out.println("処理完了しました。");
	
	}
}
