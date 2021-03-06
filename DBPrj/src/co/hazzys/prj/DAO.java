package co.hazzys.prj;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {//구현체
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String user = "hazzys";
	private String password = "dhgPwl7#";

	public Connection conn; // 연결 객체 : App과 XE 연결

	public DAO() {
		try {
			Class.forName(driver); // JDBC driver load (사용할 수 있도록 올림)
			conn = DriverManager.getConnection(url, user, password); // DriverManager을 통해 실행
			System.out.println("DB 연결 성공");
		} catch (ClassNotFoundException | SQLException e) { // driver 올릴시 파일이 없을 때, database 연결시 종료되어있을 때
			System.out.println("DB 연결 실패");
		}
	}
}
