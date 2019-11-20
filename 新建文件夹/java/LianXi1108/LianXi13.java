import java.util.Scanner;

public class LianXi13{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个公斤数 :");
		
		int x = sc.nextInt();
		double y;
		if(x<20){
			System.out.println(y=5);
		}else if(x>20&x<=100){
			System.out.println(y=5+(x-20)*0.2);
		}else{
			System.out.println(y=5+80*0.2+(x-100)*0.15);
		}
	
	}
	
}