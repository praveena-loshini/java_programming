import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
public class Main{
   public static void main(String[] args){
      Scanner s=new Scanner(System.in);
      int n=Integer.parseInt(s.nextLine());
      BigDecimal sum=BigDecimal.ZERO;
      for(int i=0;i<n;i++){
          String a=s.nextLine();
          BigDecimal b=new BigDecimal(a);
          sum=sum.add(b);
      }
       if (n != 0) {
        BigDecimal average = sum.divide(BigDecimal.valueOf(n), 10, RoundingMode.HALF_UP);
        System.out.println("Average: " + average);
} else {
        System.out.println("Cannot divide by zero. Number of inputs is 0.");
}

     }}
