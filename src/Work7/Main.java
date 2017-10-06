package Work7;

import com.sun.org.apache.regexp.internal.RE;

public class Main {
    public static void main(String[] args) {
        Line line = new Line(new Point(2, 2), new Point(5, 6));
        System.out.println(line.toString());
        System.out.println(line.getLength());
        Rectangle rectangle = new Rectangle(new Point(3, 3), new Point(5, 6));
        System.out.println(rectangle.toString());
        System.out.println(rectangle.getLengthOfDiagonal());
        System.out.println(rectangle.getLength());
        Circle circle = new Circle(5,5,3);
        System.out.println(circle.toString());
        System.out.println(circle.getSquare());
        System.out.println(circle.getLength());
        Ring ring = new Ring(1, 1, 2, 5);
        System.out.println(ring.toString());
        System.out.println(ring.getSquare());
    }
}
