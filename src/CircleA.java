public class CircleA extends ShapeA{

    double radius;

    CircleA(double radius){
        this.radius = radius;
    }



    @Override
    double area(){
        return Math.PI * radius * radius;
    }
}
