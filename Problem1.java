import java.util.Scanner;
class Calculator{
    public void operation(double a,double b,String s){
        switch(s){
            case "+":
            System.out.println("Addition of "+a+" and "+b+" is: "+(a+b));
            break;
            case "-":
            System.out.println("Subtraction of "+a+" and "+b+" is: "+(a-b));
            break;
            case "*":
            System.out.println("Multiplication of "+a+" and "+b+" is: "+(a*b));
            break;
            case "/":
            System.out.println("Division of "+a+" and "+b+" is: "+(a/b));
            break;
            default:
            System.out.println("You have enter wrong operator");
        }
    }
}
public class Problem1 {
    public static void main(String[] args) {
        Calculator c=new Calculator();
        Scanner sc=new Scanner(System.in);
        double op1=sc.nextDouble();
        double op2=sc.nextDouble();
        String operator=sc.next();
        c.operation(op1, op2, operator);
        sc.close();
    }
}
