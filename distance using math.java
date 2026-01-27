import java.lang.Math;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Point p1=new Point(s.nextDouble(),s.nextDouble());
    Point p2=new Point(s.nextDouble(),s.nextDouble());
   System.out.println( p2.distance(p1,p2));
    }}
 
class Point{
    double x,y;
   Point(double x,double y){
       this.x=x;
       this.y=y;
   }
  public static double distance(Point p1,Point p2){
       return Math.sqrt(Math.pow((p1.x-p2.x),2)+Math.pow((p1.y-p2.y),2));
    
    }}
    output:
    2.0 3.0 1.0 2.0
1.4142135623730951
