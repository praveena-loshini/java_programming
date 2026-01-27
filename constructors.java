import java.lang.Math;
public class Main {
    public static void main(String[] args) {
       constructors c=new constructors();
       constructors c1=new constructors(10);
      
    }}
class constructors{
    int a;
    constructors(){
        System.out.println("u got nothing.");//default constructor
    }
    constructors(int a){
        System.out.println("u got "+a+" for an MCQ");//parameterized constructor
    }
}
output:
u got nothing.
u got 10 for an MCQ
