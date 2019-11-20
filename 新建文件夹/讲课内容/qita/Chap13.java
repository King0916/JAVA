import java.util.Scanner;

public class Chap13{
	
	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("请输入货物重量 :");		
		int weight = sc.nextInt();
		double money;
		if(weight<=20){
			System.out.println(5);
		}else if (weight<=100){
			money=5+(weight-20)*0.2;
			System.out.println(money);
		}else{
			money=5+(100-20)*0.2+(weight-100)*0.15;
			System.out.println(money);
		}
	}
}