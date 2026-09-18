public class RectangleA extends ShapeA{

    double length;
    double weight;

    RectangleA(double length, double weight){
        this.length = length;
        this.weight = weight;
    }

    @Override
    double area() {
        return length * weight;
    }
}
