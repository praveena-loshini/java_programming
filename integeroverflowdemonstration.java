import java.util.Scanner;


public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
     int c=a*b;
     long d=(long)a*b;
     System.out.println("int:"+c+" long:"+d);
  }
}
