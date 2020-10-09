package Assignment_6_EXTRA_SPICY;

public class Question_4 {

	public static void main(String[] args) {
	/*	Write a Java program to print the following pattern

1
10
101
1010
10101
101010
1010101

	 */
		
		for(int i=1;i<=7;i++) {
			for(int j=7-i;j<7;j++) {
				if((i+j)%2==0) {
				System.out.print("0");
				}else
				System.out.print("1");
				}System.out.println();
			}	
		}	
		
	}
	
