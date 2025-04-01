package text.section_10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DbOrderBy_1 {

	public static void main(String[] args) {

		Scanner scanner = null;
		Connection con = null;
		Statement statement = null;

		try {
			System.out.println("0()昇順科1(降順)を入力してください");
			scanner = new Scanner(System.in);

			String order = switch (scanner.nextInt()) {
			case 0 -> " ASC;";
			case 1 -> " DESC;";
			default -> " ASC;";
			};

			con = DriverManager.getConnection(
					"jdbc:mysql://localhost/java_db",
					"root",
					"Ae86,trueno");
			System.out.println("データベース接続成功");

			statement = con.createStatement();
			String sql = "SELECT * FROM users ORDER BY age" + order;

			System.out.println("データを取得を実行：" + sql);
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {
				int id = result.getInt("id");
				String name = (String) result.getString("name");
				int age = result.getInt("age");
				System.out.println(result.getRow() + "件目：id=" + id
						+ "／neme=" + name + "／age=" + age);

			}
		} catch (InputMismatchException e) {
			System.out.println("入力が正しくありません");
		} catch (SQLException e) {
			System.out.println("エラー発生：" + e.getMessage());
		} finally {
			if (scanner != null) {
				scanner.close();
			}
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
