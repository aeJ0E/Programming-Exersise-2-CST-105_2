import java.util.*;

public class convertTemp {
    public static void main(String[] args) throws Exception {
        
        double type = 0;
        if (type == 0) {	
        
            Scanner kbINPUT = new Scanner(System.in);
            // ask the user to input a temp in F
            System.out.println("Enter a temperature in Fahrenheit");
        
            double temp = kbINPUT.nextDouble();
            
            // Calculate temp 
            
//			C = (F �32) * 5/9
            double convertedTemp = (temp - 32) * 5/9;
            
            System.out.println("in C: "+ convertedTemp);
            type = 1; 
        }
        
        
        if(type == 1)	{
            Scanner kbINPUT = new Scanner(System.in);
            // ask the user to input a temp in C
            System.out.println("Enter a temperature in Celsius");
        
            double temp = 0;
            temp = kbINPUT.nextDouble();
            
            // Calculate temp 
            
//			F = 9/5*C + 32.
            double convertedTemp = 9.0/5.0 * temp + 32;
            
            System.out.println("in F: "+ convertedTemp);
            
        }
        
        }
}

