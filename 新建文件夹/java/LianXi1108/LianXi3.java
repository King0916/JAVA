import java.util.Scanner;

public class LianXi3{
	
	public static void main(String [] args){
		
		
		/*
			������ǿ���̨����
			����̨����һ���ɼ����жϳɼ���������
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("������һ������ :");
		//С���������ֵ ��ֵ���� �Լ����������� 
		int JO = sc.nextInt();
		if(JO%2==0){
			System.out.println("ż��");	
		}else{
			System.out.println("����");
		}
		
		
	
	}
	
}