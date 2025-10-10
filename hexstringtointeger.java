// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        try{
            System.out.println("decimal"+Integer.parseInt(s1,16));
        }catch(NumberFormatException e){
            System.out.println("invalid hex string");
        }
    }
}
