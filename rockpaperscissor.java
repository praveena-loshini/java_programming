import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     String a=s.nextLine();
     String b=s.nextLine();
     if(a.equals("rock")){
         if(b.equals("paper")){System.out.println("b win");}else if(b.equals("scissor")){
             System.out.println("a win");
         }else{System.out.println("draw");
         }
     }else if(a.equals("paper")){
           if(b.equals("paper")){System.out.println("draw");
         }else if(b.equals("scissor")){System.out.println("b win");
         }
         else{ System.out.println("a win");
         }}
    else{
        if(b.equals("paper")){
             System.out.println("a win");
         }else if(b.equals("scissor")){
             System.out.println("draw");
         }else{
             System.out.println("b.win");
         }}}}
