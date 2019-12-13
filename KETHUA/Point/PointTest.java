package KETHUA.Point;

public class PointTest{
    public static void main(String[] args) {
        Point point = new Point(3f, 4f);
        System.out.println(point.ToString());

        MovablePoint movablePoint = new MovablePoint(2f, 3f, 3f, 4f);
        System.out.println(movablePoint.toString());

        System.out.println(movablePoint.move());
    }
}
