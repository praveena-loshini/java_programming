import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        for(int i=1;i<=10000;i++){
            int count=0;
            for(int j=1;j<i;j++){
                
                if(i%j==0){
                    count+=j;
                }
            }
            if(count==i){
                System.out.println(i);
            }
        }}
}
