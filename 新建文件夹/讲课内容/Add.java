public class Add{
	
	public static void main(String [] args){
		
		/*
			算数运算符 ：
				+ 
					注意点:
						该符号两如果都是基本数据类型，则是加法运算
						该符号两边或者任意一边是引用数据类型，则起连接作用
		*/
		
		int age = 18 ;
		
		int a = 10 ;
		int b = 20 ;
		
		System.out.println("年龄是:" + age);
		
		System.out.println( a + b );
		System.out.println("************************");
		
		/*	
			字符类型 char
			char 代表的是单个字符
			
			char类型涉及到很多编码格式:
				GBK   中文 
				iso8859-1
				ASCII
				UTF-8
				UTF-16
				UTF-32
				
			JAVA采用utf-8的编码格式
		*/
		
		char c = 'A' ;   // '0' 48   'A' 65   'a' 97
		int i = c ; 
		
		int num = 1 ;
		char ch = (char)num ;
		
		System.out.println(ch);
		
		System.out.println("************************");
		
		//计算机进制: 二进制   
		//现实进制: 十进制
		//十六进制:	          
		//八进制  :          
			  
		//  十进制  ----->  二进制
		
		
	}
	
}