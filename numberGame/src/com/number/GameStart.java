package com.number;


public class GameStart {
	
	/*
	 * 猜数字小游戏:
	 * 		运行的主类：   GameStart
	 * 
	 * 		管理员类：
	 * 			管理员的所有操作
	 * 			登录、还要后续的增删改查......
	 * 
	 * 		用户类：	
	 * 			用户的所有操作
	 * 			登录、开始游戏、查看成绩
	 * 
	 *		界面类:
	 *			只存放界面	
	 *		
	 *		工具类:
	 *			提供控制台输入的类
	 *
	 *	方法什么时候加static，什么时候不加static
	 *	一般工具类都做成静态的static方法，目的是方便调用
	 *
	 *	方法调用：
	 *		调用一次，执行一次
	 *		方法执行完，返回到调用的地方
	 *
	 */
	
	public static void main(String[] args) {
		while(true){
			//游戏开始之后界面
			Menu.startMenu();
			//控制台输入选项
			int number = 0 ;
			//控制输入的选项只能是1/2/0
			while(true){
				number = InputHelp.getInt(); 
				
				if(number==1 |number==2 | number==0){
					//输入的数字是正确的
					break;
				}else{
					System.out.println("对不起！输入错误！请输入正确的选项......");
				}
			}
			
			//判断输入的是什么选项
			switch (number) {
				//玩家登陆
				case 1:
					//玩家的操作
					UserOperation.userGeneral();
					break;
				//管理员登录
				case 2:
					
					break;
				//退出
				default:
					System.out.println("游戏退出");
					return;
			}
			
		}//while循环
		
		
	}
	
}
