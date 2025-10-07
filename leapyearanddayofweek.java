import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int y=s.nextInt();
     if(((y%4==0)&& (y%100!=0))||(y%400==0)){
         System.out.println("leap year");
     }else{
         System.out.println("not a leap year");
     }
     //tuesday is 1st jan
     int a=n%7;
     switch(a){
         case 1:
            System.out.println("tuesday");
            break;
        case 2:
            System.out.println("wednesday");
             break;
        case 3:        System.out.println("thursday");
         break;
        case 4:System.out.println("friday"); break;
        case 5: System.out.println("saturday"); break;
        case 6:System.out.println("sunday"); break;
        case 0:System.out.println("monday"); break;
     }
}}
