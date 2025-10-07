import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     char c=s.next().charAt(0);
     if(Character.isLetter(c)){
         System.out.println("letter");
     }
     if(Character.isDigit(c)){
         System.out.println("digit");
     }else if(Character.isUpperCase(c)){
         System.out.println("uppercase");
     }else if(Character.isLowerCase(c)){
         System.out.println("lowercase");
     }else if(Character.isWhitespace(c)){
         System.out.println("whitespace");
     }else{
         System.out.println("invalid");
     }
     
}}
