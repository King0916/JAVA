public class Operator02{
	
	public static void main(String [] args){
		/*
			算数运算符 ++ 、 --
			(1) 和变量单独使用，表示变量的值 自加1、自减1
			(2) 符合运算
			
			规则：
				++（--）
					++、-- 在变量前 ，先运算自加1（自减1） 再赋值
					++、-- 在变量后 ，先赋值 再运算
		*/
		int x = 10 ;
		int y = 5 ;
		//	z = 2  -  16  + 18
		int z = x-- / y++  - 2*--x + 3*y++;
		//	x=9  y=6		x=8	y=7		
		System.out.println(x); // 8
		System.out.println(y); // 7
		
		System.out.println(z); // 4
		
		
		
		
		int a = 10 ;
	 //	a =   10   -   10    +   9  -   9 ;
		a = (a++)  - (--a)  + (--a) - (a++) ;
		//	a=11	  a=10	    a=9     a=10
		System.out.println(a);
		
		
		
			
		
	}
	
}