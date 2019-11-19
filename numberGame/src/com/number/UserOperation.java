package com.number;

/**
 * 用户操作类
 * 包含了登录功能，开始游戏的功能，查看成绩的功能
 * @author Administrator
 *
 */
public class UserOperation {
	
	/*
	 * 玩家操作总流程:	
	 * 		1、先登录，直到登录成功为止
	 * 		2、登录成功界面
	 * 		3、选择选项  
	 * 			3.1 开始游戏
	 * 			3.2查看成绩
	 * 		
	 */
	/**
	 * 玩家的总流程方法
	 */
	public static void  userGeneral(){
		UserOperation user = new UserOperation();
		//1、玩家登陆
		user.login();
		//2、玩家界面
		Menu.userLoginSucessMenu();
		//3、输入选项
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
		//4、判断输入的是多少
		switch (number) {
			//开始游戏
			case 1:
				//开始游戏的总流程
				user.gameGeneral();				
				break;
			//查看英雄榜
			case 2:
				//调用查看英雄榜的方法
				break;
			//返回上级
			default:
				//选择的是0，需要返回上级，返回到最初的界面
				break;
		}
		
		
	}
	
	
	/**
	 * 玩家登陆的方法
	 */
	public void login(){
		while(true){
			//控制台输入用户名和密码
			System.out.println("请输入用户名:");
			int userName = InputHelp.getInt();		
			System.out.println("请输入密码:");
			int userPsw = InputHelp.getInt();
			//判断是否正确
			if(userName==123456 && userPsw == 654321){
				//登陆成功
				break;
			}else{
				System.out.println("对不起！用户名和或密码错误！");
			}
		}
		
	}
	
	/**
	 * 玩家开始游戏之后的总流程
	 * 	1、开始猜数字游戏
	 * 	2、游戏结束之后的界面
	 * 	3、输入选项并判断
	 */
	public void  gameGeneral(){
		while(true){
			//创建玩家类的对象
			UserOperation u = new UserOperation();
			//调用开始游戏的方法
			u.game();
			//界面
			Menu.userGameOverMenu();
			int select = 0 ;
			//控制输入的选项只能是1/0
			while(true){
				select = InputHelp.getInt(); 
				
				if(select==1 | select==0){
					//输入的数字是正确的
					break;
				}else{
					System.out.println("对不起！输入错误！请输入正确的选项......");
				}
			}
			//判断输入的是多少
			//如果输入的是1，继续游戏
			if(select==0){
				break;
			}
			
		}//while结束
		
		
		
	}
	
	
	/**
	 * 玩家一次游戏的功能
	 */
	public  void  game(){
		
		//1、生成随机数
		int random = (int)(Math.random()*100+1);
		System.out.println("生成的随机数是:" +random);
		//2、玩家输入一个数字
		System.out.println("游戏开始，请输入数字......");
		
		// count 用来记录猜的次数
		int count = 0 ;		
		
		while(true){
			int num = InputHelp.getInt();
			//3、比较大小
			//  判断是否相等
			if(random>num){				
				System.out.println("对不起！输入的数字太小了 <_<");
			}else if(random<num){
				
				System.out.println("对不起！输入的数字太大了 >_>");
			}else{	
				count++ ;
				System.out.println("恭喜回答正确！^_^");
				break;
			}
			
			count++ ;
		}
		
		//4、根据次数得出成绩
		//score表示成绩的变量
		int score = 0 ;
		if(count<=2){
			score=100;
		}else if(count<=5){
			score=80;
		}else{
			score=60;
		}
		System.out.println("恭喜您用了"+count+"次猜中！");
		System.out.println("分数是:" + score);
		
		
	}
	
}
