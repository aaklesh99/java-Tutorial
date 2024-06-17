// Operator : Operator are those symbol which perform operation 
//             on Operands/Variable.
// symbol = Keyword

import java.util.function.UnaryOperator;

import javax.management.relation.Relation;

public class Operator {
    public static void main(String[] args) {
       //Assignment Operator : It is use to assigning the value one variable to another variable       
    //    System.out.println("Assignment Operator");
    // System.out.println("---------------------------------");
    // System.out.println();
    //    int num1=10;
    //    int num2=num1; //Assigning the value of num1 to num2
    //    System.out.println("num1 = "+num1);
    //    System.out.println("num2 = "+num2);


    // Arthematic Operator : It is use to perform the Arthematic operation on two operand
    //    System.out.println("Arthematic Operator");
    // System.out.println("---------------------------------");
    // System.out.println();
    //    int num1=22;
    //    int num2=10;
    //    System.out.println("Addition : "+(num1+num2));   //Addition
    //    System.out.println("Subtraction : "+(num1-num2));    //Substraction
    //    System.out.println("Multiplication : "+(num1*num2)); //Multiplication
    //    System.out.println("Division : "+(num1/num2));   //Division
    //    System.out.println("Modulus : "+(num1%num2));   //Modulus

    // UnaryOperator: It is use perform task on single operand
    //    System.out.println("Unary Operator");
    // System.out.println("---------------------------------");
    // System.out.println();
    //    int num=10;
    //    System.out.println("Post Increment : "+(num++));  //Post Increment
    //    System.out.println("num = "+num);
    //    System.out.println("Pre Increment : "+(++num));  //Pre Increment
    //    System.out.println("num = "+num);
    //    System.out.println("Post Decrement : "+(num--));  //Post Decreament
    //    System.out.println("num = "+num);
    //    System.out.println("Pre Decrement : "+(--num));  //Pre Decreament
    //    System.out.println("num = "+num);

    // Relational Operator : It is use to check the condition between two operands
    //    System.out.println("Relational Operator");
    // System.out.println("---------------------------------");
    // System.out.println();
    //    int num1=10;
    //    int num2=20;
    //    System.out.println("Equal to : "+(num1==num2));  
    //    System.out.println("Not Equal to : "+(num1!=num2));
    //    System.out.println("Greater than : "+(num1>num2));
    //    System.out.println("Less than : "+(num1<num2));
    //    System.out.println("Greater than or Equal to : "+(num1>=num2));
    //    System.out.println("Less than or Equal to : "+(num1<=num2));

    // Ternary Operator : It is use to check true and false condition in single line 
    //    System.out.println("Ternary Operator");
    // System.out.println("---------------------------------");
    // System.out.println();
    //    int num1=10;
    //    int num2=20;
    //    String result=(num1>num2)?"num1 is greater than num2":"num1 is less than num2";
    //    System.out.println(result);

    // Logical operator : It is also use to check the condition but it use to compare two condition
        // (&&),(||),(!)
        // System.out.println("Logical Operator");
        // System.out.println("---------------------------------");
        // System.out.println();
        // int num1=10;
        // int num2=20;
        // boolean result=(num1>num2)&&(num1<num2);
        // System.out.println(result);
        // boolean result1=(num1>num2)||(num1<num2);
        // System.out.println(result1);
        // boolean result2=!(num1>num2);
        // System.out.println(result2);
     
    // Shift Operator : It is use to shift the operator left or right of the power of two which is given with operator
    // System.out.println("Shift Operator");
    // System.out.println("---------------------------------");
    // System.out.println();
    // int num=10;
    // System.out.println("Left Shift : "+(num<<3)); //Left Shift
    // System.out.println("Right Shift : "+(20>>2)); //Right Shift
    // System.out.println("Unsigned Right Shift : "+(20>>>2)); //Unsigned Right Shift
    // System.out.println("Unsigned Right Shift : "+(-20>>>2));

    // ShortHand operator
    
   
    System.out.println("ShortHand Operator");
    System.out.println("---------------------------------");
    int num=10;
    System.out.println();
    System.out.println("Before Increment : "+num);
    num++;
    System.out.println("After Increment : "+num);
    // num=num+10;
    num+=10;
    System.out.println("After Addition : "+num);
   
   






    }
}
