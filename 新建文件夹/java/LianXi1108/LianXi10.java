import java.util.Scanner;

public class LianXi10{
	
	public static void main(String [] args){
		
		
		/*
			������ǿ���̨����
			����̨����һ���ɼ����жϳɼ���������
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������ :");
		//С���������ֵ ��ֵ���� �Լ����������� 
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