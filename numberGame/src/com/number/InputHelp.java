package com.number;

import java.util.Scanner;

/**
 * 工具类:
 * 	只提供控制台的输入
 * @author Administrator
 *
 */
public class InputHelp {
	
	/**
	 * 将控制台输入的数字返回
	 * @return
	 */
	public static  int  getInt(){
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		return num;
		
	}
	
}
