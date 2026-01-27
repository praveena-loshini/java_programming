import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    
        System.out.println("int power:"+Calculator.powerInt(3,4));
        System.out.println("double power:"+Calculator.powerDouble(3.0,4));
}}
class Calculator{
    public static int powerInt(int num1,int num2){
        return (int)Math.pow(num1,num2);//pow generally returns dpuble value so to prevent lossy conversion from double to int
    }
    public static double powerDouble(double num1,int num2){
        return Math.pow(num1,num2);
    }
}
op:
int power:81
double power:81.0
