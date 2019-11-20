public class If03{
	
	public static void main(String [] args){
		
		/*
			多重if-else if语法:
				
				if(布尔类型表达式1){					
					代码1;
					
				}else if(布尔类型表达式2){
					代码2;
					
				}else if(布尔类型表达式3){
					代码3;
				
				....
				}else if(布尔类型表达式N){
					代码N;
					
				}else{
					
				}
				
		*/
		
		/*
			根据成绩判断所在区间
			[90-100] 优秀
			[80-90)	 良好
			[70-80)	 一般
			[60-70)	 及格
			[0-60)	 不及格
		*/
		int score = -1 ;
		
		//判断成绩在哪个区间
		if(score>=90){
			System.out.println("优秀！");
			
		}else if(score >=80 & score <90){
			System.out.println("良好！");
			
		}else if(score >= 70 & score <80){
			System.out.println("一般！");
			
		}else if(score >=60){
			System.out.println("及格！");
			
		}else {
			System.out.println("不及格！");
		}
		
		
		int age1 = 503 ;
		int age2 = 503 ;
		int age = age1 - age2 ;
		
		if( age == 3 ){
			System.out.println("女大三抱金砖");
			
		}else if (age == 30){
			System.out.println("女大三十送江山");
			
		}else if (age == 300){
			System.out.println("女大三百送仙丹");
			
		}else if (age == 3000){
			System.out.println("女大三千位列仙班");
			
		}
		
		
		
	}
	
}