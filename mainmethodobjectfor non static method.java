import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    sum(s.nextInt(),s.nextInt());
    Main m=new Main();//
       m.multiply(s.nextInt(),s.nextInt());
    }
 public static void sum(int a,int b){
    System.out.println(a+b);
}
 public void multiply(int a,int b){//npn static
    System.out.println(a*b);
}}
output:
3 5
8
3 5
15
