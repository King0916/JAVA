public class DataType02{
	
	public static void main(String [] args){
		/*
		一、基本数据类型   四类八种
			
		1、整数类型 			 占内存大小			取值范围
			byte	字节型       1字节8位			-128  --- 127
			short	短整型		 2字节16位
			int		整型		 4字节32位
			long	长整型       8字节64位
			
			注意点:
				1、long类型的变量，数值后面需要加L（l）
				2、
		2、浮点类型
			float   单精度		 4字节32位
			double  双精度       8字节64位
			
			注意点:
				1、float类型的变量，数值后面需要加F(f)
				2、double类型的变量，数值后面需要加D(d)
			
		3、字符类型
			char				 2字节16位
			
		4、布尔类型
			boolean	 该类型比较特殊，值只有两: true 、 false
			
			
		*****
		声明变量
		语法:
			数据类型  变量  =  值 ;
			
			int  number = 10 ;
			
			long l = 100L  ;
			
			char c = 'a' ;
			
			boolean b = true ;
			
		*/
		
		long id = 10086L ;
		
		//System.out.println() 表示的是输出语句
		//输出语句，小括里面如果有双引号，双引号之间写的是什么，输出的就是什么
		//输出语句，小括里面如果没有双引号，则默认是一个变量，输出的是变量的值
		System.out.println(id);   //10086
		System.out.println("id"); // id
		
		double π = 3.14D ;
		
		float r = 10.0F;
		System.out.println(π);
		System.out.println(r);
		/*
			JS ： 弱类型语言
			Java：强类型语言
				
				弱类型语言，不需要编译
				强类型语言，需要先编译，再运行
			
			1、编译
				javac 文件名.java
					编译出一个 .class文件    该文件是一个字节码文件
			2、运行
				java 文件名
		*/
		
	}
	
}