package HomeWork4.tsk1;

/*
Задание 4.
        Допустимыми фигурами являются круг Ring, треугольник Triangle,
        параллелограмм Parallelogram и трапеция Trapezium. В классе допустимых
        фигур Shape определить операцию сложения, если суммой фигур служит
        сумма их площадей.
// Static square+=…
*/

public abstract class Shape{

    abstract double figSquare();

    static double calculateSum(Shape shape1, Shape shape2) {
        return (shape1.figSquare()+shape2.figSquare());
    }
    public static void main (String[] args){

        Triangle triangle = new Triangle(6.8, 6.0);
        Trapezium trapezium = new Trapezium(6.8, 10.0, 15.8);
        Parallelogram parallelogram = new Parallelogram(8.7, 2.0);
        Ring ring = new Ring(5.7);

        System.out.println(calculateSum(trapezium, triangle));
        System.out.println(calculateSum(ring, parallelogram));

        double sum = trapezium.figureSquare() + triangle.figureSquare() + parallelogram.figureSquare() + ring.figureSquare();
        System.out.println("The whole sum is:\t" + sum);
    }

}
