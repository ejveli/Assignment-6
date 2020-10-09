package Assignment_6_EXTRA_SPICY;

public class Question_3 {

	public static void main(String[] args) {
		/*	Write a Java program to print the following pattern

1 2 3 4 5 6 7
 2 3 4 5 6 7
  3 4 5 6 7
   4 5 6 7
    5 6 7
     6 7
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7

		 */
		
		for (int i = 1; i <= 7; i++) {
			for (int k = 1; k < i; k++) { //space loop
				System.out.print(" ");
			}
			for (int j = i; j <= 7; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}
		
		for (int i = 1; i <= 6; i++) {
			for (int k = 1;  k<= 6-i; k++) {    //space loop
				
				System.out.print(" ");
			}
			
			for (int j =7-i ; j <= 7; j++) {
				
				System.out.print(j + " ");
			}
			System.out.println();

		}
	}
	}
