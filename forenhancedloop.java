import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String[] s1=s.nextLine().split(",");
        int sum=0;
        for(String a:s1){
            int b=Integer.parseInt(a);
            if(b>0){
                sum+=b;
        }
        
}
System.out.println(sum);
}}
