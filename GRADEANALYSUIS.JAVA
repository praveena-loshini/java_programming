import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     char c=s.next().charAt(0);
     switch(c){
         case 'A':
             System.out.println("excellent");
             break;
        case 'B':
             System.out.println("good");
             break;
        case 'C':
             System.out.println("average");
             break;
        case 'D':
             System.out.println("below average");
             break;
        case 'F':
             System.out.println("failing");
             break;
        default:
             System.out.println("invalid");
             
     }
    }}
