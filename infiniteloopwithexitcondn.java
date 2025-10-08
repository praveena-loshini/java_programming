import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int sum=0;
       while(true){
           int s1=s.nextInt();
           sum+=s1;
           if(sum>1000){
               break;
           }
       }
       System.out.println(sum);
    }
}
