import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int i=s.nextInt();
     if(i>0){
         if(i%2==0){
             System.out.println("positive and even");
         }else{
             System.out.println("positive and odd");
 
         }
     }else if(i<0){
         if(i%2==0){
                          System.out.println("negative and even");

         }else{
                          System.out.println("negative and odd");

         }
     }else{
                          System.out.println("zero");

     }
    }}
