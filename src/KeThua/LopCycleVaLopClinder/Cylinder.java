package KeThua.LopCycleVaLopClinder;

public class Cylinder extends Circle {
    private double height = 1.0;

    public Cylinder() {
    }

    ;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    @Override
    public double getArea() {
        return super.getArea() * 2 + super.getPerimeter() * height;
    }
    public double getVolume() {
        return super.getArea() * this.height;

    }

        @Override
    public String toString() {
        return "Hình trụ{ " +
                " height = " + height +
                " đáy = " +getRadius()+
                '}';
    }
}