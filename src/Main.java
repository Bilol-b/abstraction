//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GeometricFigure triangle = new Triangle(3,4,5);
        GeometricFigure trapezium = new Trapezium(3,4,5);
        GeometricFigure rectangale = new Rectangale(3,4);

        System.out.println("uchburchak peremetri; " + triangle.perimeter());
        System.out.println("uchburchak yuzasi; " + triangle.area());
        System.out.println("trapetsiya yuzasi; " + trapezium.area());
        System.out.println("trapetsiya peremetri; " + trapezium.perimeter());
        System.out.println("Tortburchak peremetri; " + rectangale.perimeter());
        System.out.println("Tortburchak yuzasi; " + rectangale.area());

        Animal dog = new Dog("dog");
        Animal cat = new Cat("cat");
        Animal duck = new Duck("duck");

        System.out.println(dog.getName() + " says; ");
        dog.sound();
        System.out.println(cat.getName() + " says; ");
        cat.sound();
        System.out.println(duck.getName() + " says; ");
        duck.sound();
    }
}