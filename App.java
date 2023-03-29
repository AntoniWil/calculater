import java.time.Year;
import java.util.Scanner;

public class App
{
    static final Scanner inputScanner = new Scanner(System.in);
    
    private static String getString(String prompt){
        System.out.println(prompt);
        return inputScanner.nextLine();
    }

    private static double getDouble(String prompt) 
    {
        System.out.println(prompt);
        return inputScanner.nextDouble();
    }

    public static void main(String[] args){

        App app1 = new App();
        Calculater calc1 = new Calculater();
        Scanner newScan = new Scanner(System.in);
        String ans = app1.getString("Do you want to start the calculation? y/n ");
        String whtMant = ("");
        
        String add = "add";
        String subtract = "subtract";
        String multiply = "multiply";
        String divide = "divide";
        

        while(ans.equals("y")){ 
            
            double num1 = app1.getDouble("enter a double: ");
            double num2 = app1.getDouble("enter another double: ");

            System.out.println("What kind of calculation do you want to do? (choices: add, subtract, multiply, or divide) ");
            whtMant = newScan.nextLine();
            
            if(whtMant.equals(add)){
                System.out.println("Add: " + calc1.add(num1, num2)); 
            }
            if(whtMant.equals(subtract)){
                System.out.println("Subtract: " + calc1.subtract(num1, num2)); 
            }
            if(whtMant.equals(multiply)){
                System.out.println("Multipy: " + calc1.multiply(num1, num2)); 
            }
            else if(whtMant.equals(divide)){
                System.out.println("Divide: " + calc1.divide(num1, num2)); 
            }
            
            System.out.println("Do you want to continue? y/n ");
            ans = newScan.nextLine();

        }

        System.out.println("Goodbye");

         
      


        }
    
        
        
}
    



 



