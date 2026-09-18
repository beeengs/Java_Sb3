public class abstraction {
    public static void main(String[] args) {

        // abstract = Used to define abstract classes and methods.
        //            Abstraction is the process of hiding implementation details
        //            and showing only the essential features;
        //            Abstract classes CAN'T be instantiated directly
        //            Can contain 'abstract' methods (which must be implemented)
        //            Can contain 'concrete' methods (which are inherited)

       CircleA circleA = new CircleA(3);
       TriangleA triangleA = new TriangleA(4,5);
       RectangleA rectangleA = new RectangleA(6,7);

       circleA.display();
       triangleA.display();
       rectangleA.display();

        System.out.println();

        System.out.println(circleA.area());
        System.out.println(triangleA.area());
        System.out.println(rectangleA.area());

    }
}
