package com.number;

/**
 * 界面类：
 * 	包含所有的界面提示
 * @author Administrator
 *
 */
public class Menu {
	
	/**
	 * 游戏开始的界面
	 */
	public  static void  startMenu(){
		//游戏开始后的界面
		System.out.println("************************");
		System.out.println();
		System.out.println("    猜数字小游戏  ");
		System.out.println();
		System.out.println("  1、玩家登陆");
		System.out.println();
		System.out.println("  2、管理员登陆");
		System.out.println();
		System.out.println("  0、退出游戏");
		System.out.println();
		System.out.println("************************");
		System.out.println("请选择选项:");
	}
	
	/**
	 * 玩家登陆成功之后的界面
	 */
	public static void  userLoginSucessMenu(){
		//玩家登陆成功之后的界面
		System.out.println("************************");
		System.out.println();
		System.out.println("    玩家操作  ");
		System.out.println();
		System.out.println("  1、开始游戏");
		System.out.println();
		System.out.println("  2、查看英雄榜");
		System.out.println();
		System.out.println("  0、返回上级");
		System.out.println();
		System.out.println("************************");
		System.out.println("请选择选项:");
	}
	
	/**
	 * 玩家游戏结束之后的界面
	 */
	public static void userGameOverMenu(){

		//得到分数之后 界面提示
		System.out.println("************************");
		System.out.println();
		System.out.println("    玩家操作  ");
		System.out.println();
		System.out.println("  1、继续游戏");
		System.out.println();							
		System.out.println("  0、返回上级");
		System.out.println();
		System.out.println("************************");
		System.out.println("请选择选项:");
	}
}
