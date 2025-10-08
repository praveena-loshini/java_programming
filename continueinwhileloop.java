import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int sum=0;
        while(true){
            int n=s.nextInt();
            if(n%2==0){
                continue;
            }
            if(n==-1){
                break;
            }
                sum+=n;
            
            
        }System.out.println(sum);
        }}
