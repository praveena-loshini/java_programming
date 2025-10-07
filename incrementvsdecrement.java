import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int i=s.nextInt();
     int j=i++ + ++i;
     System.out.println(j);
    }}
