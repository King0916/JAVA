public class Operator02{
	
	public static void main(String [] args){
		/*
			��������� ++ �� --
			(1) �ͱ�������ʹ�ã���ʾ������ֵ �Լ�1���Լ�1
			(2) ��������
			
			����
				++��--��
					++��-- �ڱ���ǰ ���������Լ�1���Լ�1�� �ٸ�ֵ
					++��-- �ڱ����� ���ȸ�ֵ ������
		*/
		int x = 10 ;
		int y = 5 ;
		//	z = 2  -  16  + 18
		int z = x-- / y++  - 2*--x + 3*y++;
		//	x=9  y=6		x=8	y=7		
		System.out.println(x); // 8
		System.out.println(y); // 7
		
		System.out.println(z); // 4
		
		
		
		
		int a = 10 ;
	 //	a =   10   -   10    +   9  -   9 ;
		a = (a++)  - (--a)  + (--a) - (a++) ;
		//	a=11	  a=10	    a=9     a=10
		System.out.println(a);
		
		
		
			
		
	}
	
}