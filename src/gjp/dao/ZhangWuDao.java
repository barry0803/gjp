package gjp.dao;

import java.sql.SQLException;
import java.util.List;

import gjp.domain.ZhangWu;
import gjp.tools.JDBCUtils;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

public class ZhangWuDao {
	//获取数据库连接池，得到操作表数据的对象QueryRunner
	QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public List<ZhangWu> selectAll() {
		StringBuilder sql = new StringBuilder("select * from gjp_zhangwu");
		try {
			return qr.query(sql.toString(), new BeanListHandler<ZhangWu>(ZhangWu.class));
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
}
