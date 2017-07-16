package gjp.view;

import java.awt.print.Printable;
import java.util.List;
import java.util.Scanner;

import gjp.domain.ZhangWu;
import gjp.service.ZhangWuService;

public class MainView {
	ZhangWuService zhangWuService = new ZhangWuService();

	/**
	 * 运行方法
	 */
	public void run() {
		/*
		 * 1. 打印菜单 2. 获取用户输入 3. 调用对应方法
		 */
		boolean flag = true;
		Scanner in = new Scanner(System.in);
		while (flag) {
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务 2.删除账务 3.编辑账务 4.查询账务 5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			int op = in.nextInt();
			switch (op) {
			case 1:
				//addZhangWu();
				break;
			case 2:
				//deleteZhangWu();
				break;
			case 3:
				//editZhangWu();
				break;
			case 4:
				selectZhangWu();
				break;
			case 5:
				System.out.println("再见！");
				flag = false;
				break;
			default:
				System.out.println("输入错误！");
			}
		}
	}
	
	/**
	 * 查询账务方法
	 */
	public void selectZhangWu() {
		System.out.println("1.查询所有　2.按条件查询");
		Scanner in = new Scanner(System.in);
		int op = in.nextInt();
		switch (op) {
		case 1:
			List<ZhangWu> zhangWuList = zhangWuService.selectAll();
			print(zhangWuList);
			break;
		case 2:
			//select();
			break;
		default:
			System.out.println("输入错误！");
		}
	}
	
	public void print(List<ZhangWu> zhangWuList) {
		System.out.println("ID\t类别\t\t账户\t\t金额\t\t时间\t\t说明");
		for (ZhangWu zhangWu : zhangWuList) {
			System.out.println(zhangWu.getZwid() + "\t" + zhangWu.getFlname() + "\t\t"
					+ zhangWu.getZhanghu() + "\t\t" + zhangWu.getMoney() + "\t\t"
					+ zhangWu.getCreatetime() + "\t" + zhangWu.getDescription());
		}
	}
}
