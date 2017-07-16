package Test;

import java.util.ArrayList;
import java.util.List;

import gjp.domain.ZhangWu;
import gjp.view.MainView;

import org.junit.Test;

public class TestFunc {
	@Test
	public void testPrint(){
		ZhangWu zw1 = new ZhangWu();
		ZhangWu zw2 = new ZhangWu();
		List<ZhangWu> zhangWuList = new ArrayList<ZhangWu>();
		zw1.setZwid(1);
		zw1.setFlname("分类1");
		zw1.setMoney(12345);
		zw1.setZhanghu("账户1");
		zw1.setCreatetime("1983-8-3");
		zw1.setDescription("说明1");
		zw2.setZwid(2);
		zw2.setFlname("分类2");
		zw2.setMoney(67890);
		zw2.setZhanghu("账户2");
		zw2.setCreatetime("1988-10-23");
		zw2.setDescription("说明2");
		zhangWuList.add(zw1);
		zhangWuList.add(zw2);
		new MainView().print(zhangWuList);
	}
}
