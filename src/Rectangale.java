public class Rectangale extends GeometricFigure{
    private double sizeA;
    private double sizeB;

    public Rectangale(double sizeA,double sizeB){
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    public double getSizeA() {
        return sizeA;
    }

    public void setSizeA(double sizeA) {
        this.sizeA = sizeA;
    }

    public double getSizeB() {
        return sizeB;
    }

    public void setSizeB(double sizeB) {
        this.sizeB = sizeB;
    }

    @Override
       double area() {
        return getSizeA() * getSizeB();
    }

    @Override
       double perimeter() {
        return 2 * (getSizeA()+ getSizeB());
    }
}
