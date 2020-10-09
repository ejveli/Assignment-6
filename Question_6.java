package Assignment_6_EXTRA_SPICY;

public class Question_6 {

	public static void main(String[] args) {
		/*
		 Write a Java program to print the following pattern

1
2 6
3 7 10
4 8 11 13
5 9 12 14 15

		 */
		
		
		int sum=0;

		for (int i = 1; i <= 5; i++) {
			System.out.print(i + " ");

			for (int j = 1;  j< i; j++) { 
				for(int k=4;j<i;k--) {
				sum=i+k;	
				}
				
				System.out.print(sum+" ");
					
				}System.out.println();
			
				}
			
				
				}
				
			}
		
	

