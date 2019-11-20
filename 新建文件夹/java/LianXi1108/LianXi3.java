import java.util.Scanner;

public class LianXi3{
	
	public static void main(String [] args){
		
		
		/*
			读入就是控制台输入
			控制台输入一个成绩，判断成绩所在区间
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数 :");
		//小黑屏输入的值 赋值给了 自己起的这个变量 
		int JO = sc.nextInt();
		if(JO%2==0){
			System.out.println("偶数");	
		}else{
			System.out.println("奇数");
		}
		
		
	
	}
	
}