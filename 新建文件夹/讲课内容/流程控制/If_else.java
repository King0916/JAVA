public class If_else{
	
	public static void main(String [] args){
		
		/*
			
			
			if-else语法:
			
				if(布尔类型表达式){
					
					代码A;
					
				} else {
					
					代码B;
				}
				
			运行流:
				如果小括里面的结果为true,则执行代码A
				如果小括里面的结果为fasle,则执行代码B
			
			大括号里面的代码 可以是任何代码
			
			
		*/
		
		int money = 6000 ;
		
		if(money>=5000){
			
			System.out.println("恭喜您薪资又涨了！");
			
		}else{
			System.out.println("年轻人！该升职加薪了！");
		}
		
		// 声明一个四位数的年份，判断是否是闰年
		//1、能被400整除
		//2、能被4整除但不能被100整除
		
		int year = 2000 ;
		
		//判断是否是闰年
		if( year%400==0 | ( year%4==0 & year%100!=0 ) ){
			System.out.println("是闰年");
		}else{
			System.out.println("是平年");
		}
		
		
		
		if(year%400==0 ){
			System.out.println("是闰年");
		}else{
						
			if( year%4==0 & year%100!=0){
				System.out.println("是闰年");
			}else{
				System.out.println("是平年");
								
			}
			
		}
		
		
	}
	
}