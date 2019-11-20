public class Operator03{
	
	public static void main(String [] args){
		
		/*
			位运算符
				&  |  ^  <<(左移)   >>(带符号右移)   >>>(无符号右移)
				
				<< 左移  相当于左移的数字乘2
				
				>> 和 >>>区别:
				
				>>：有符号右移运算
					若参与运算的数字为正，则在高位补0，若为负则在高位补1

				>>>:无符号右移运算
					无论参与运算的数字为正数还是负数，都在高位补0
				
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