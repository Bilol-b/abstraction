public class Trapezium extends GeometricFigure{
    private double sideA;
    private double sideB;
    private double high;

  public Trapezium(double sideA,double sideB,double high){
      this.sideA = sideA;
      this.sideB = sideB;
      this.high = high;
  }

  public double getSideA(){
      return sideA;
  }

  public void setSideA(double sideA){
      this.sideA = sideA;
  }

  public double getSideB(){
      return sideB;
  }

  public void setSideB(double sideB){
      this.sideB = sideB;
  }

  public double getHigh(){
      return high;
  }

  public void setHigh(double high) {
      this.high = high;
  }

  @Override
  double area(){
      return (getSideA() + getSideB()) * getHigh() /2;
  }

  @Override
  double  perimeter(){
      double f = (getSideA() - getSideB())/2;
      double yonC = Math.sqrt(Math.pow(getHigh(),2) + Math.pow(f,2));
      return getSideA() + getSideB() +2 * yonC;
  }
}
