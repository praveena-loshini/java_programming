import java.util.Scanner;

public class Main{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       String[] string=str.split(",");
       String a=string[0];
       float b=Float.parseFloat(string[1]);
       int c=Integer.parseInt(string[2]);
       System.out.printf("%-12s %.3f %4d",a,b,c);
    }
}
