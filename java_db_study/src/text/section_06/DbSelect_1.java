package text.section_06;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbSelect_1 {

	public static void main(String[] args) {
		Connection con = null;
		Statement statement = null;

		try {
			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/java_db",
					"root",
					"Ae86,trueno");

			System.out.println("データベース接続成功");

			statement = con.createStatement();
			String sql = "SELECT id, name FROM users;";

			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				int id = result.getInt("id");
				String name = result.getString("name");
				System.out.println(result.getRow() + "件目：id" + id + "／name=" + name);
			}
		} catch (SQLException e) {
			System.out.println("エラー発生:" + e.getMessage());
		} finally {
			if (statement != null) {
				try {
					statement.close();
				} catch (SQLException ignore) {
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException ignore) {
				}
			}
		}

	}

}
