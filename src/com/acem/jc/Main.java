package com.acem.jc;
import java.util.Scanner;

import com.acem.jc.mathematicaloperations.*;

public class Main{
    
    public static void main(String args[]){
    Scanner op = new Scanner(System.in);
    System.out.println("Enter the operation(+,-,*,/,^)");
    String operator = op.nextLine();

    System.out.println("Enter the first operand");
    double operand1 = op.nextDouble();

    System.out.println("Enter the second operand");
    double operand2= op.nextDouble();
    
    MathematicalOperations operation = null;
    switch (operator){
        case ("+"):
            operation = new AddCommand();
            break;
        case ("-"):
            operation = new SubCommand();
            break;
        case ("*"):
            operation = new MultiplyCommand();
            break;
        case ("/"):
            operation = new DivisionCommand();
            break;
        case("^"):
            operation = new Power();
            break;
        default:
            System.out.println("Invalid Input");
            break;
    }
    double result = operation.calculation(operand1, operand2);
    System.out.println("The result is: "+ result);

}
}