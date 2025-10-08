import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        String s3=s.nextLine();
        String s4="";
        for(int i=0;i<200;i++){
            if((s1.charAt(i)==s2.charAt(i))&&(s2.charAt(i)==s3.charAt(i))){
                s4+=s1.charAt(i);
                
        }else{
            break;
        }
        
    }
    System.out.println(s4);
    
}}
