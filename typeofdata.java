import java.util.Scanner;
public class Main{
   public static void main(String[] args){
       Scanner s=new Scanner(System.in);
       String str=s.nextLine();
       if(isInteger(str)){System.out.println("INTEGER");}
       else if(isDouble(str)){System.out.println("DOUBLE");
       }else if(isBoolean(str)){System.out.println("BOOLEAN");
       }else{System.out.println("String");}}
   public static boolean isInteger(String a){
       try{int a1=Integer.parseInt(a);return true;
       }catch(NumberFormatException e){
           return false;
       }
       }
    public static boolean isDouble(String a){
        try{ double a1=Double.parseDouble(a);return true;
        }catch(NumberFormatException e){
            return false;
        }
    }
    public static boolean isBoolean(String a){
        return a.equalsIgnoreCase("true")||a.equalsIgnoreCase("false");}}
