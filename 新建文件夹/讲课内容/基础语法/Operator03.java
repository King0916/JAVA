public class Operator03{
	
	public static void main(String [] args){
		
		/*
			λ�����
				&  |  ^  <<(����)   >>(����������)   >>>(�޷�������)
				
				<< ����  �൱�����Ƶ����ֳ�2
				
				>> �� >>>����:
				
				>>���з�����������
					���������������Ϊ�������ڸ�λ��0����Ϊ�����ڸ�λ��1

				>>>:�޷�����������
					���۲������������Ϊ�������Ǹ��������ڸ�λ��0
				
		*/
		
		int a = 14 ; // 1110
		int b = 15 ; // 1111
					//  0001   
		
		int c = a ^ b ;  // 1
		System.out.println(c);
		
		
		int x = 8 ;
		int y = 21 ;
		int z = x ^ y ;
		System.out.println(z); //29
		
		
		int number = -9 ;
		
		number = number >>>2 ;     // >>1 -5   >>2  -3
		System.out.println("number = " + number); 
		
		
		int n = 10 ;
		int m = 20 ;
		
		// n = 20  m = 10
		
	}
	
}