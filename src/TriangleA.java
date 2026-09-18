public class TriangleA extends ShapeA{

    double base;
    double height;

    TriangleA(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

