import java.util.Scanner;

public class LianXi8{
	
	public static void main(String [] args){
		
		
		/*
			读入就是控制台输入
			控制台输入一个成绩，判断成绩所在区间
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年龄 :");
		//小黑屏输入的值 赋值给了 自己起的这个变量 
		int age = sc.nextInt();
		if(age<6){
			System.out.println("儿童");	
		}else if(age<=13){
			System.out.println("少儿");
		}else if(age<=18){
			System.out.println("青少年");
		}else if(age<=35){
			System.out.println("青年");
		}else if(age<=50){
			System.out.println("中年");
		}else{
			System.out.println("中老年");
		}
		
		
	
	}
	
}