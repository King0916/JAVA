public class Switch{
	
	public static void main(String [] args){
		
		/*
		流程控制switch:
			语法:
			
				switch(表达式){
					
					case 值1 :
						代码1 ;
						break ;
					case 值2 :
						代码2;
						break ;
					.....
					case 值N :
						代码N ;
						break ;
					default :
						代码;					
				}
			
			注意点:
				1、表达式的数据类型只能是byte、short、int、char、String类型
				2、case后面值的类型 必须和表达式的类型保持统一
				3、case后面的值 不允许重复
				4、case后面可以没有break,如果没有，则发生"case穿透"现象
		*/
		
		int day = 7 ;
		
		switch(day){
			case 1 :
				System.out.println("今天是周一");
				break;
			case 2 :
				System.out.println("今天是周二");
				break;
			case 3 :
				System.out.println("今天是周三");
				break;
			case 4 :
				System.out.println("今天是周四");
				break;
			case 5 :
				System.out.println("今天是周五");
				break;
			case 6 :
				System.out.println("今天是周六");
				break;
			case 7 :
				System.out.println("今天是周日");
				break;
			default :
				System.out.println("今天星期八");
		}
		
		// String 是字符串类
		// 字符类型 char 只能写单个字符
		
		String str = "大圣归来";
		switch(str){
			case "大圣归来" :
				System.out.println("大圣归来");
				break;
			case "大圣走了" :
				System.out.println("大圣走了");
				break;
			case "大圣又来了" :
				System.out.println("大圣又来了");
				break;
			case "大圣又走了" :
				System.out.println("大圣又走了");
				break;
			case "大圣你还回不回得来" :
				System.out.println("大圣你还回不回得来");
				break;
			case "大圣你还走不走得了" :
				System.out.println("大圣你还走不走得了");
				break;
			case "大圣累了" :
				System.out.println("大圣累了");
				break;
				
			default :
				System.out.println("大圣被玩坏了");
		}
		
		/*
			练习:
				控制台输入一个成绩，成绩可以带小数，然后判断成绩所在的区间
				[90-100] 优秀
				[80-90)	 良好
				[70-80)	 一般
				[60-70)	 及格
				[0-60)	 不及格
		*/
		
		
		
	}
	
}