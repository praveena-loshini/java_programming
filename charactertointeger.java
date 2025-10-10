import java.util.*;
public class Main{
    public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       char c=s.next().charAt(0);
       char c1=s.next().charAt(0);
       
       int sum=(c-48)+(c1-48);
       System.out.println(sum);
    }
}
