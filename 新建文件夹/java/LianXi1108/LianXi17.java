import java.util.Scanner;

public class LianXi17{
	
	public static void main(String [] args){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���������� :");
		
		double x = sc.nextDouble();
		int y=  (int)x/10;
		switch(y){
			case 10 :
			case 9 :
				System.out.println("����");
				break;
			case 8 :
				System.out.println("����");
				break;
			case 7 :
				System.out.println("һ��");
				break;
			case 6 :
				System.out.println("����");
				break;
			default :
				System.out.println("������");
		}
			
		}
	
	}
	
