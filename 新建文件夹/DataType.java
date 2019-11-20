public class DataType{
		
	/*
	一、数据类型
		java中的数据类型:
			1、基本数据类型
			2、引用数据类型
		
		
		基本数据类型： 四类八种
						
			1、整数类型 			占内存大小		 		取值范围			
				byte   	字节型   1字节8位				-128  ---  127
				short   短整型   2字节16位				-32768 --- 32767
				int 	整型	 4字节32位
				long    长整型   8字节64位
				 
			2、浮点类型  
				float   单精度   4字节32位					
				double	双精度	 8字节64位
					
				
			3、字符类型  
				该类型的值，需要用'' 圈中
				char			 2字节16位
			
			4、布尔类型(逻辑类型) 
				boolean		该类型比较特殊，只有两个值 true / false
		
		
		作用:	
			声明变量、常量等
	
	二、变量的声明
			变量是在程序运行过程中可以发生改变的
		语法:
			数据类型  变量名  =  值 ;
			
			
	*/	
	public static void main(String [] args){
		
		//数据类型  变量名  =  值 ;
		byte b = 10 ;
		short s = 1000 ; 
		int i = 10000;
		
		char  c = '中' ; 
		
		boolean boo = true;
		
		//输出语句如果没有双引号，则是一个变量，输出的是变量的值
		System.out.println(b);
		
		//输出语句如果有双引号，双引号之间写什么，就输出什么
		System.out.println("你      好啊，光头强！");
	}
	
	
}