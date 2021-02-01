import java.util.Scanner;
public class addPostitveDigits {
	private static void addPostitveDigits() {
		
	}

		public static void main(String[] args) {
			 
		
			addPostitveDigits();	{
			
			Scanner kbINPUT = new Scanner(System.in);
			// ask the user to input a positive integer
			System.out.println("Enter a 5 digit postive interger. Example: 12345");
		
			int numbers = kbINPUT.nextInt();
			int total = 0;
			// Calculate int
			 
            int numArr[] = new int[5];
            for(int i=0; i<5; i++) {
                numArr[i] = numbers % 10;
                total += numArr[i];
                numbers = numbers / 10;
            }
			System.out.print(total);
			kbINPUT.close();
            
			}   
		}
		}



