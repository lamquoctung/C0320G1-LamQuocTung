package AdvancedObjectOrientedDesign.excercise.interfaceResizeable;

public class SquareTest {
    public static void main(String[] args) {
        Square square = new Square();
        System.out.println(square);

        square = new Square(2.3);
        System.out.println(square);

        square = new Square(5.8, "yellow", true);
        System.out.println(square);

        Square square2 = new Square();
        square2.resize(1);
    }
}
