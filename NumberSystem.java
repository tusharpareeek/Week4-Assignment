/**
* Week 4 Assignment Task: Number System program -> Arithematic operations and Base conversion
* 
* @author Tushar Pareek
* @since  26/09/2024
*/
import java.util.*;

public class NumberSystem{
    public static Scanner scanner = new Scanner(System.in);
    // Main Method
    public static void main(String[] args) throws InterruptedException {
        
        printwelcome();
        int input ;
        do{
            System.out.println(NumberSystemConstant.options);
            input = scanner.nextInt();

        switch (input) {
            case 1:
            System.out.println(NumberSystemConstant.userPrompt2);
            System.out.print(NumberSystemConstant.enterBaseNumber1);
            int base1 = scanner.nextInt();
            scanner.nextLine();
            System.out.print(NumberSystemConstant.enternumber1);
            String firstNumber = scanner.nextLine();
            scanner.nextLine();
           
            System.out.print(NumberSystemConstant.enterBaseNumber2);
            int base2 = scanner.nextInt();
            scanner.nextLine();
            System.out.print(NumberSystemConstant.enternumber2);
            String secondNumber = scanner.nextLine();
            scanner.nextLine(); 
            int firstNumberDecimal = givenToDecimal(firstNumber, base1);
            int secondNumberDecimal = givenToDecimal(secondNumber, base2);
            System.out.println(NumberSystemConstant.operationOptions);
            int operationChoice = scanner.nextInt();

            switch (operationChoice) {
                case 1:
                int addOutput = firstNumberDecimal + secondNumberDecimal;
                System.out.println( NumberSystemConstant.requiredOutput + addOutput );
                    
                    break;
                case 2:
                int subtractOutput = firstNumberDecimal - secondNumberDecimal;
                System.out.println(NumberSystemConstant.requiredOutput + subtractOutput );
                    
                    break;
                case 3:
                int multiplicationOutput = firstNumberDecimal * secondNumberDecimal;
                System.out.println(NumberSystemConstant.requiredOutput + multiplicationOutput );
                    
                    break;
                case 4:
                float divisionOutput = firstNumberDecimal / secondNumberDecimal;
                System.out.println(NumberSystemConstant.requiredOutput + divisionOutput );
                    
                    break;
            
                default:
                System.out.println(NumberSystemConstant.invalid);
                break;
            }
            System.out.println(NumberSystemConstant.exitStatement);
            String exit = scanner.nextLine();
            scanner.nextLine();
            if(exit.contains(NumberSystemConstant.exit)){
                break;
            }
            break;
        
            case 2:
            System.out.println(NumberSystemConstant.userPrompt);
            System.out.println(NumberSystemConstant.baseInputNumber);
            int inputNumBase = scanner.nextInt();
            scanner.nextLine();
            System.out.println(NumberSystemConstant.enterNumber);
            String inputNum = scanner.nextLine();
            scanner.nextLine();
            int output = givenToDecimal(inputNum, inputNumBase);
            System.out.println(NumberSystemConstant.conversionBase);
            int requiredBase = scanner.nextInt();
            scanner.nextLine();
            
            if (requiredBase == inputNumBase){
                System.out.println(NumberSystemConstant.requiredOutput + inputNum);
            }
            String output1 = decimalToRequired(output, requiredBase);
            System.out.println(NumberSystemConstant.requiredOutput + output1);
            System.out.println(NumberSystemConstant.exitStatement);
            String exit1 = scanner.nextLine();
            if(exit1.contains(NumberSystemConstant.exit)){
                break;
            }
        }
        
    }
    while(input != 3);
}
    // This method prints a welcome screen for user which looks beautiful in the start
    public static void printwelcome() throws InterruptedException{
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tHOLA AMIGO");
        Thread.sleep(1000,2);
        System.out.print("\033[H\033[2J");
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tनमस्ते");
        Thread.sleep(1000,2);
        System.out.print("\033[H\033[2J");  
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tسلام");
        Thread.sleep(1000,2);
        System.out.print("\033[H\033[2J");  
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tolá");
        Thread.sleep(1000,2);
        System.out.print("\033[H\033[2J");  
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tہیلو");
        Thread.sleep(1000,2);
        System.out.print("\033[H\033[2J");  
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tこんにちは");
        Thread.sleep(1000,2);
        System.out.print("\033[H\033[2J");  
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tHallo");
        Thread.sleep(1000,2);
        System.out.print("\033[H\033[2J");  
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tBonjour");
        Thread.sleep(1000,2);
        System.out.print("\033[H\033[2J");  
        System.out.println("\n\n\n\t\t\t\t\t\t\t\tTHE APPLICATION IN LOADING PLEASE WAIT...");
        Thread.sleep(1000,2);
        System.out.print("\033[H\033[2J");  
        System.out.println("\n\n\n\t\t\t\t\t\t\t\t\tLOADING...");
        Thread.sleep(3000,2);
        System.out.print("\033[H\033[2J");
    }

    //This method converts the given input number of any base to decimal
    public static int givenToDecimal(String input , int base){
        try {
            int output = Integer.parseInt(input, base);
            return output;
            
        } catch (NumberFormatException e) {
            System.out.println(NumberSystemConstant.invalidinput);
           
        }
        return 0;
    }
    // This method converts the converted decimal base into other required base
    private static String  decimalToRequired(int n, int base) throws InterruptedException{

        // This string contains numbers and alphabetic symbol used in number system.
        String digits = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if( base == 0){
            System.out.println(NumberSystemConstant.invalidinput);
        }
        if( base < 2 || base > 36){
            throw new IllegalArgumentException(NumberSystemConstant.basevalues);
        }
        StringBuilder result = new StringBuilder();
        boolean negative = n < 0;
        n = Math.abs(n);
        
        while (n > 0) {
            result.insert(0, digits.charAt(n % base));
            n /= base;
        }
        
        if (negative) {
            result.insert(0, "-");
        }
        
        return result.toString();
}
    
}