import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String[] s1=s.nextLine().split(",");
        int t=s.nextInt();
        int count=-1;
        for(String n:s1){
            int a=Integer.parseInt(n);
            count+=1;
            if(a==t){
                System.out.println(count);
                break;
            }
        }
        
        
        }}
