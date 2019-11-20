public class TypeChange{
	
	public static void main(String [] args){
		
		/*
			类型转换：
			
			基本数据类型
			
			1、整数类型
				byte       1字节8位      -128-127
				short 	   2字节16位
				int		   4字节32位
				long       8字节64位
				
				注意:
					1、long类型的数值，后面需要加L(1)
					2、如果整数类型的数值，后面没有字母，则默认是int类型
			2、浮点类型
				float	   4字节32位
				double	   8字节64位
				
				注意点:
					1、float类型的数值，后面需要加F(f)
					2、double类型的数值，后面需要加D(d)
					3、如果浮点类型的数值，后面没有加字母，则默认是double类型
				
			3、字符类型
				
				char       2字节
				
			4、布尔类型
				boolean 
			
			根据取值范围，按照从小到大的顺序排列
			byte < short < int < long < float <double
			
					java中规定:
						只要是小数，取值范围就比整数的大
					
					注意： 取值范围 和变量表示的值 不是一个概念
			
			java中类型类型转换:
				1、自动类型转换(隐式转换)
					将小范围的数值 赋值给 大范围的变量
				
				2、强制类型转换 (显示转换)
					将大范围的数值 赋值给 小范围的变量
				
		*/
		//自动类型转换
		int a = 10 ;
		
		long l = a ;
		System.out.println(l);
		
		//强制类型转换
		float f = 3.99F;
		
		int i = (int)f ;
		System.out.println(i);
		
		double d = 3.14 ;
		
		float π = (float)3.14 ;
		
		// byte、short也是整数类型，只要赋值的数值没有超过范围
		// 虚拟机在底层会自动将这个数值转变为响应的类型
		byte n = (byte) 256;
		short s = (short)32768 ;  // -32768 --- 32767
		
		System.out.println(n); // 0
		System.out.println(s); //100
		
		
		
	}
	
}