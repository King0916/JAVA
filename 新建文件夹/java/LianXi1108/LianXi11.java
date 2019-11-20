import java.util.Scanner;

public class LianXi11{
	
	public static void main(String [] args){
		
		
		/*
			读入就是控制台输入
			控制台输入一个成绩，判断成绩所在区间
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个年份 :");
		//小黑屏输入的值 赋值给了 自己起的这个变量 
		int year= sc.nextInt();
		
		if(year%400==0|(year%4==0&year%100!=0)){
			System.out.println("闰年");
		}else {
			System.out.println("平年");
		}
	
	}
	
}