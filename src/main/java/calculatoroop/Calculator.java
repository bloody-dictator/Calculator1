package calculatoroop;


import java.util.*;
public class Calculator {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        float result;
        float num1 = getFloat();
        float num2 = getFloat();
        //getOperation();
        switch (getOperation()){
            case '+':
                result = addition(num1, num2);
                System.out.printf("%.4f", result);
                break;
            case '-':
                result = Substraction(num1, num2);
                System.out.printf("%.4f", result);
                break;
            case '*':
                result = Multiplication(num1, num2);
                System.out.printf("%.4f", result);
                break;
            case '/':
                result = Division(num1, num2);
                System.out.printf("%.4f", result);
                break;

        }
        scanner.close();

    }
    public static float getFloat(){
        System.out.println("Введите число");
        String i = scanner.next();
        Float num = Float.parseFloat(i);
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите знак операции (+, -, *, /)");
        String operation;
        operation = scanner.next();
        return operation.charAt(0);
    }

    public static float addition(float num1, float num2){
        float sum;
        sum = num1 + num2;
        return sum;
    }

    public static float Substraction(float num1, float num2){
        float remainder;
        remainder = num1 - num2;
        return remainder;
    }

    public static float Multiplication(float num1, float num2){
        float product;
        product = num1 * num2;
        return product;
    }

    public static float Division(float num1, float num2) {
        float quotient;
        quotient = num1 / num2;
        return quotient;
    }

}
