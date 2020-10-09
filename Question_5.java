package Assignment_6_EXTRA_SPICY;

public class Question_5 {

	public static void main(String[] args) {
	/*	Write a Java program to print the following pattern

1111111
1111122
1111333
1114444
1155555
1666666
7777777

	 */
		
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				
				if(8-i<=j) {
					
				System.out.print(i);
				
				}else System.out.print("1");
				
				}System.out.println();
			}	
		}	
		
	}
	
