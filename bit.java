import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       int num=s.nextInt();
       int a=(num>>3)&1;
       int b=(num>>15)&1;
       int c=(num>>31)&1;
       System.out.println("4th bit:"+a);
       System.out.println("16th bit:"+b);
       System.out.println("32th bit:"+c);
     
    }}
