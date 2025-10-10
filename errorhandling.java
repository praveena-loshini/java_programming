import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner s1=new Scanner(System.in);
        String s=s1.nextLine();
        try{
            System.out.println(Integer.parseInt(s));
               System.out.println("integer");
        }
        catch(Exception e){
            
            try{
            System.out.println(Double.parseDouble(s));
            System.out.println("Double");
            }catch(Exception a){
            System.out.println("String");
            System.out.println(s);
            }
        }
            
    }
}
