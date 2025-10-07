import java.util.Scanner;


public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int x=s.nextInt();
     int y=s.nextInt();
     if(x>0&&y>0){
         System.out.println("Quadrant I");
     }else if(x<0&&y>0){
         System.out.println("Quadrant II");
     }else if(x<0&&y<0){
         System.out.println("Quadrant III");
     }else if(x>0&&y<0){
         System.out.println("Quadrant IV");
     }else if(x==0&&y==0){
         System.out.println("origin");
     }else if(x==0){
         System.out.println("y-axis");
  } else{
      System.out.println("x-axis");
  }
}}
