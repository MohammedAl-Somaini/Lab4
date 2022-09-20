import java.awt.*;
public class Lab4Q4 {

    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.add(0, 0);
        System.out.println("The Expected Result Is: java.awt.Rectangle[x=0,y=0,width=25,height=40]");
        System.out.println("The Actual Result Is:   " + box);
    }
}
