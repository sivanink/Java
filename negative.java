import java.util.Scanner;

class NegativeNumberException extends Exception 
{
    public NegativeNumberException(String message)
     {
        super(message);
    }
}

public class negative 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        try 
        {
            int number = scanner.nextInt();
            if (number < 0) 
            {
                throw new NegativeNumberException("Input cannot be negative!!");
            }
            else
            {
            	System.out.println("You've entered a positive number!!");
            }
            System.out.println("You entered: " + number);
        }
         catch (NegativeNumberException e) 
         {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
