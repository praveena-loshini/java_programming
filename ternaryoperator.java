import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     char a=(n>=90&&n<=100)?'A':(n>=80)?'B':(n>=70)?'c':(n>=60)?'D':'F';
     System.out.println(a);

}}
