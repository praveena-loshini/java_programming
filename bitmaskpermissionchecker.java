import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int userperm=s.nextInt();
     int checkperm=s.nextInt();
     //1-read,2=write,4=execute,7=read+write+execute
     if((userperm&checkperm)==checkperm){
         System.out.println("Access granted");
     }else{
         System.out.println("Acess denied");
     }
    }}
