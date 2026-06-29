// File: test.java
public interface test {
    int square(int x);
}

// File: Arithmetic.java
public class Arithmetic implements test {
    @Override
    public int square(int x) {
        return x * x;
    }
}

// File: ToTestInt.java
public class ToTestInt {
    public static void main(String[] args) {
        Arithmetic obj = new Arithmetic();
        System.out.println("Square of 5 = " + obj.square(5));
    }
}
// File: Outer.java
public class Outer {
    public void display() {
        System.out.println("Display from Outer class");
    }

    public class Inner {
        public void display() {
            System.out.println("Display from Inner class");
        }
    }
}

// File: TestOuter.java
public class TestOuter {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.display();

        Outer.Inner inner = outer.new Inner();
        inner.display();
    }
}
// File: Point.java
public class Point {
    private int x, y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void printPoint() {
        System.out.println("Point(" + x + ", " + y + ")");
    }
}

// File: TestPoint.java
public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.printPoint();

        Point p2 = new Point(3, 4);
        p2.printPoint();

        p2.setXY(10, 20);
        p2.printPoint();
    }
}
// File: Box.java
public class Box {
    protected double length, breadth;

    public Box(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }
}

// File: Box3d.java
public class Box3d extends Box {
    private double height;

    public Box3d(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    public double volume() {
        return length * breadth * height;
    }
}

// File: TestBox.java
public class TestBox {
    public static void main(String[] args) {
        Box box = new Box(5, 4);
        System.out.println("Area of Box = " + box.area());

        Box3d box3d = new Box3d(5, 4, 3);
        System.out.println("Area of Box3d = " + box3d.area());
        System.out.println("Volume of Box3d = " + box3d.volume());
    }
}
