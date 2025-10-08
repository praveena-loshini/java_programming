import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int m=s.nextInt();
        for(int i=1;i<100;i++){
            if(i%m==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}
