import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     boolean a=true,b=false;
     if(a||methoda()){
         System.out.println("aa");
     }
     if(a&& methoda()){
         System.out.println("a");
     }
     if(b||methodb()){
         System.out.println("bb");
     }
     if(b&&methodb()){
         System.out.println("b");
     }
    }
 public static boolean methoda(){
     System.out.println("A");
     return false;
 }
 public static boolean methodb(){
     System.out.println("B");
     return true;
 }
}
