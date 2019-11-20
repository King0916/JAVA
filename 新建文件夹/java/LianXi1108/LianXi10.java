import java.util.Scanner;

public class LianXi10{
	
	public static void main(String [] args){
		
		
		/*
			读入就是控制台输入
			控制台输入一个成绩，判断成绩所在区间
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个整数 :");
		//小黑屏输入的值 赋值给了 自己起的这个变量 
		int Z1 = sc.nextInt();
		int Z2 = sc.nextInt();
		int Z3 = sc.nextInt();
		if(Z1>Z2&Z1>Z3){
			System.out.println(Z1);
		}else if(Z2>Z1&Z2>Z3){
			System.out.println(Z2);
		}else {
			System.out.println(Z3);
		}  
	
	}
	
}