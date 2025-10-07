import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
     s.nextLine();
     String s1=s.nextLine();
     if(s1.equals("NAND")){
         System.out.println(~(a&b));
         
     }
     if(s1.equals("OR")){
         System.out.println((a|b));
     }
     if(s1.equals("AND")){
         System.out.println((a&b));
     }
     if(s1.equals("XOR")){
         System.out.println((a^b));
     }
 
     
}}
