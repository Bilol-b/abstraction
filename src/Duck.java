public class Duck extends Animal{
    public Duck(String name) {
        super(name);
    }

    @Override
     void sound() {
        System.out.println(" quack quack");
    }
}
