import java.util.Scanner;
public class Main{
  public static void main(String[] args){
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int count=0;
     while(n>1){
         if(n%2==0){
             n=n/2;
             count+=1;
         }else{
             n=3*n+1;
             count+=1;
         }
     }
     System.out.println(count);
    }}
