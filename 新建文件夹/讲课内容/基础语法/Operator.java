public class Operator{
	
	public static void main(String [] args){
		
		/*
			运算符：
				1、赋值运算符
				2、算数运算符
				3、逻辑运算符
				4、比较运算符
				5、三目运算符(条件运算符)
				6、位运算符
				
				
				1、赋值运算符
					= 
					int a = 10 ;
							等同于
					a += b  --->  a = a + b
					a -= b  --->  a = a - b 
					a *= b  --->  a = a * b 
					a /= b  --->  a = a / b 
				    a %= b  --->  a = a % b 
				
					上面表达式虽然写法上等价，但是不一样
					区别:
					前者缩写部分：
						用前者得到的结果，可以自动进行转换，转换成和变量的数据类型一致
					后者部分:
						结果不会自动转换，如果是两byte/short进行运算，结果是int类型
				2、算数运算符
					+  -  *  /  %读模 （取余） ++  --
					
					重点： ++  --
					++ 自加1
					-- 自减1	
						(1) 和变量单独使用，表示变量的值 自加1、自减1
						(2) 符合运算
		*/
		
		//2、算数运算符
		int a = 9 ;
		int b = 4 ;
		int c = a % b ;
		System.out.println(c);
		
		
		//a = a * b ;
		a *= b ;
		System.out.println(a);
		
		byte x = 1 ;
		byte y = 2 ;
		
		//x = x + y ;
		x += y ;
		System.out.println(x);
		
		
		int number = 100 ;
		
		--number;
		
		number--;
		
		System.out.println(number);
		
		/*
			3、逻辑运算符
				该运算符最终会产生一个布尔类型的结果 （true/false）
				& 和、且   |或   ！非   ^ 异或  &&短路与  || 短路或
				
				重点:&&短路与  || 短路或
				
				& 
				true  &  true    true
				true  &  false   false
				false &  true    false
				false &  false   false
				
				|
				true  |  true    true
				true  |  false   true
				false |  true    true
				false |  false   false
				
				^ 异或
					两边不一样就是真
				
				!非
				!true   false
				!false   true
				
			重点: &&  ||
				表达式1 &&  表达式2
				如果表达式1的结果为false,则最终结果为false,就不执行表达式2了
				
				表达式1 ||  表达式2
				如果表达式1的结果为true,则最终结果为true,就不执行表达式2了
		*/
			
		int n1 = 20 ;
		int n2 = 30 ;
		
		boolean result = 2*n1 > n2 ^ n1/2 > n2/2 ;
		System.out.println(result);
		
		
		/*
			4、比较运算符
				该运算符最终会产生一个布尔类型的结果 （true/false）
				> 、 < 、 >= 、 <= 、 !=(不等于) 、 == 
				
				重点: ==
					1、如果两边是基本数据类型，则是判断数值是否相等
					2、如果两边是引用数据类型，则是判断的内存地址(引用对象)
				
		*/
		
		int c1 = 100 ;
		int c2 = 200 ;
		boolean c3 = c1==c2 ;
		System.out.println(c3);
		
		/*
			5、三目运算符 (条件运算符)
				
				布尔类型表达式 ？ 表达式1 : 表达式2 ;
				
				运行原理:
					如果布尔类型表达式结果为true,则执行表达式1
					如果布尔类型表达式结果为false,则执行表达式2				
				
				布尔类型表达式:
					也就是说最终需要得到一个true/false的结果
					需要借助 比较、逻辑运算符
					
				表达式:
					范围比较广，可以是一个值，也可以是一个变量
					也可以是布尔类型表达式
		*/
		
		//练习
		// 声明一个四位数的年份 year ,判断概该年份是否为闰年
		//闰年判定方式:
		//1、能被400整除
		//2、能被4整除，但不能被100整除
		
		
		int year = 2020 ;
		
		char h = year%400 == 0||(year%4==0 && year%100!=0) ? '是' : '否' ;
		System.out.println(h);
		
		
		
		
		
		
		
		
		
		
		int age = 20 ;
		
		int newAge = age > 0 & age < 30 ? 30 : 40 ;
		
		
		
		
	}
	
}