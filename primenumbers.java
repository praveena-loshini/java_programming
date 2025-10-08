import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0;
        for(int i=1;i<=1000;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count+=1;
                }
            }
            if(count==2){
                System.out.println(i);
                a+=1;
            }
            if(a==n){
                break;
            }
        }
    }
}
