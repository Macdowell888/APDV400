import java.util.Scanner;

public class Calculator201749440 {

    public static void main(String[] args) {

        Scanner sam = new Scanner(System.in);
        System.out.print("Enter two numbers: ");

        
        double first = sam.nextDouble();
        double second = sam.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sam.next().charAt(0);

        double result;

        switch(operator)
        {
            case '+':
                result = first + second;
                break;

            case '-':
                result = first - second;
                break;

            case '*':
                result = first * second;
                break;

            case '/':
                result = first / second;
                break;

          
              System.out.printf("Error! operator is not correct");
                return;
        }

        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}


