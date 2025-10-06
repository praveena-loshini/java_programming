import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        String s2=s.nextLine();
        String[] a1=s1.split(":");
        String[] a2=s2.split(":");
        int ar[]=new int[a1.length];
        int arr[]=new int[a2.length];
        for(int i=0;i<ar.length;i++){
            ar[i]=Integer.parseInt(a1[i]);
            arr[i]=Integer.parseInt(a2[i]);
        }
        int a=(ar[0]*3600)+(ar[1]*60)+ar[2];
        int b=(arr[0]*3600)+(arr[1]*60)+arr[2];
        System.out.println((a-b));
    }
}
