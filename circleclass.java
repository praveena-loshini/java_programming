import java.lang.Math;
public class Main {
    public static void main(String[] args) {
    Circle c=new Circle();
    System.out.println(c.radius);
    c.radius=10;
    c.area();
    c.circumference();
    System.out.println(c.radius);
    c.area();
    c.circumference();
    }
}
class Circle{
    int radius=9;
    public void area(){
        System.out.println((Math.PI)*radius*radius);
    }
    public void circumference(){
        System.out.println(2*(Math.PI)*radius);
    }
}
output:
9
314.1592653589793
62.83185307179586
10
314.1592653589793
62.83185307179586
