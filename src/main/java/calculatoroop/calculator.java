package calculatoroop;

/**
 * Created by IntelliJ IDEA.<br>
 * User: Alexey<br>
 * Date: 02.04.2018<br>
 * Time: 1:09<br>
 * todo javadoc
 */

import sun.plugin2.message.*;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        //String i = scanner.next();
        //String j = scanner.next();
        //Float a = Float.parseFloat(i);
        //Float b = Float.parseFloat(j);

        //System.out.printf("%.4f", a+b);
        //scanner.close();
        float result;
        float num1 = GetFloat();
        float num2 = GetFloat();
        //GetOperation();
        switch (GetOperation()){
            case "+":
                result = Addition();
                System.out.printf("%.4f", result);
                break;
            case "-":
                result = Substraction();
                System.out.printf("%.4f", result);
                break;
            case "*":
                result = Multiplication();
                System.out.printf("%.4f", result);
                break;
            case "/":
                result = Division();
                System.out.printf("%.4f", result);
                break;

        }


    }
    public static float GetFloat(){
        System.out.println("Введите число");
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        Float num = Float.parseFloat(i);
        scanner.close();
        return num;
    }

    public static String GetOperation(){
        System.out.println("Введите знак операции (+, -, *, /)");
        String operation;
        Scanner scanner = new Scanner(System.in);
        String i = scanner.next();
        operation = GetOperation();
        scanner.close();
        return operation;
    }

    public static float Addition(float num1, float num2){
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
