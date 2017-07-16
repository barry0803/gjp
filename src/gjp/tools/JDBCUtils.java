package gjp.tools;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class JDBCUtils {
	public static final String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	public static final String URL = "jdbc:mysql://localhost:3306/gjp";
	public static final String USERNAME = "root";
	public static final String PASSWORD = "881023Zy";
	private static BasicDataSource dataSource = new BasicDataSource();
	static {
		try {
			dataSource.setDriverClassName(DRIVER_CLASS_NAME);
			dataSource.setUrl(URL);
			dataSource.setUsername(USERNAME);
			dataSource.setPassword(PASSWORD);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static DataSource getDataSource() {
		return dataSource;
	}
}
