public class Triangle extends GeometricFigure{
    private  double sideA;
    private  double sideB;
    private  double sideC;


    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    @Override
    double area() {
        double s = (getSideA() + getSideB() + getSideC()) / 2;
        return Math.sqrt(s * (s - getSideA()) * (s - getSideB()) * (s - getSideC()));
    }

    @Override
    double perimeter() {
        return getSideA() + getSideB() + getSideC();
    }
}
