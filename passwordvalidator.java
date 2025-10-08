import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        boolean upper=false,lower=false,digit=false;
        for(int i=0;i<s1.length();i++){
            char c=s1.charAt(i);
            if(Character.isDigit(c)){ digit=true;
            }else if(Character.isUpperCase(c)){ upper=true;
            }else if(Character.isLowerCase(c)){
                lower=true;
            }
            if(digit&&upper&&lower){
                System.out.println("Valid");
                return; }}
            System.out.println("invalid");}
        
}
