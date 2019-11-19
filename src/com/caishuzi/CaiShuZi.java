package com.caishuzi;

import java.util.Scanner;

public class CaiShuZi {
	public static void main(String[] args) {
		while(true){
		//登录界面
		System.out.println("***********************************");
		System.out.println();
		System.out.println();
		System.out.println("		猜数字小游戏");
		System.out.println();
		System.out.println();
		System.out.println("	1、玩家登录");
		System.out.println();
		System.out.println();
		System.out.println("	2、管理员登录");
		System.out.println();
		System.out.println();
		System.out.println("	0、退出游戏");
		System.out.println();
		System.out.println();
		System.out.println("***********************************");
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入输入相应的序号1");
		int xh1 = sc.nextInt();
		switch(xh1){
			case 1://玩家登录
				int name=123456;
				int pass=654321;
				boolean a=true;
				
				while(a){
					System.out.println("请输入用户名1:");
					int userName = sc.nextInt();
					System.out.println("请输入密码1:");
					int password = sc.nextInt();
					if(name==userName & pass==password){
					
						System.out.println("恭喜，登陆成功");
						
						break;
					}else {
						
						System.out.println("对不起，您的用户名或密码错误");
						
					}
				
				while(true){
				System.out.println("***********************************");
				System.out.println();
				System.out.println();
				System.out.println("		玩家操作");
				System.out.println();
				System.out.println();
				System.out.println("	1、开始游戏");
				System.out.println();
				System.out.println();
				System.out.println("	2、查看英雄榜");
				System.out.println();
				System.out.println();
				System.out.println("	0、返回上级");
				System.out.println();
				System.out.println();
				System.out.println("***********************************");
				
				boolean b=true;
				System.out.println("请输入输入相应的序号2");
				int xh2 = sc.nextInt();
				while(b){
					
					
					switch(xh2){
						//开始游戏
						case 1:
							int cs=0;
							boolean c=true;
							System.out.println("游戏开始");
							System.out.println();
							System.out.println();
							System.out.println("正在生成1--100之间的随机数");
							int random = (int)(Math.random()*100+1);
							System.out.println(random);
							while(c){
								
								
								
								System.out.println("请输入您的结果");
								int jg = sc.nextInt();//输入的数字
								cs ++;
								if(random==jg){
									System.out.println("恭喜您，回答正确");
									break;
								}else if(random<jg){
									System.out.println("对不起，猜大了");
									
									
								}else if(random>jg){
									System.out.println("对不起，猜小了");
									
								}
				
							}
							boolean d=true;
							while(d){
								if(cs<=2){
									System.out.println("您的分数是：100分");
									
								}else if(cs<=5){
									System.out.println("您的分数是：80分");
									
								}else if(cs>=6){
									System.out.println("您的分数是：60分");
									
								}
								d=false;
								continue;
								
							}
							cs=0;
							System.out.println("***********************************");
							System.out.println();
							System.out.println();
							System.out.println("		玩家操作");
							System.out.println();
							System.out.println();
							System.out.println("	1、继续游戏");
							System.out.println();
							System.out.println();
							System.out.println("	0、返回上级");
							System.out.println();
							System.out.println();
							System.out.println("***********************************");
							
							
							
							//游戏赢了之后
							System.out.println("请输入输入相应的序号3");
							int xh3 = sc.nextInt();
							if(xh3==1){
								break;
								
							}else {
								b=false;
								break;	
							    
								
							}
							
								
								
								
								
							
						//查看英雄榜
						case 2 :
							System.out.println("英雄榜正在开发中！！！");
							break;
						//返回上级
						default:
							b = false;
							break;
					
					}
				}
				}
				}
				
				
			case 2:	//管理员登录
				int gname=123456;
				int gpass=654321;
				int gcount=1;
				
				while(gcount<=3){
					System.out.println("请输入用户名2:");
					int userName = sc.nextInt();
					System.out.println("请输入密码:");
					int password = sc.nextInt();
					int xscount=3-gcount;
					if(gname==userName &  gpass==password){
						System.out.println("恭喜，登陆成功");
						return;
					}else {
						
						System.out.println("对不起，您的用户名或密码错误");
						System.out.println("剩余次数:"+xscount+"次");
						gcount++;
					}
				}
				System.out.println("登陆失败！");
			case 0:	//退出游戏
		}
		
		
		
		
	}

}
}