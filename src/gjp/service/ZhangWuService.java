package gjp.service;

import java.util.List;
import gjp.dao.ZhangWuDao;
import gjp.domain.ZhangWu;

public class ZhangWuService {
	ZhangWuDao zhangWuDao = new ZhangWuDao();
	
	public List<ZhangWu> selectAll() {
		List<ZhangWu> zhangWuList = zhangWuDao.selectAll();
		return zhangWuList;
	}
}
