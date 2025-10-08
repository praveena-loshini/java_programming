import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        for(int i=1;i<10;i++){
            for(int j=1;j<=10;j++){
                if(((j+i)%7)==0){
                    continue;
                }
                System.out.print("("+i+","+j+")");
            }
        }
    }
}
