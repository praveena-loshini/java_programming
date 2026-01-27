import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Box b=new Box(s.nextInt(),s.nextInt(),s.nextInt());
    System.out.println("vol: "+b.volume());
}}
class Box{
    int width,height,depth;
    Box(int width,int height,int depth){
        this.width=width;
        this.height=height;this.depth=depth;
    }
    public int volume(){
        return height*width*depth;
    }
}
op:
1 2 3
vol: 6
