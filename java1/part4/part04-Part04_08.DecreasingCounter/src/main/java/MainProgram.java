
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        DecreasingCounter counter2 = new DecreasingCounter(2);

        counter.printValue();
        counter.decrement();
        counter.decrement();
        counter.printValue();

        counter2.printValue();
        counter2.decrement();
        counter2.printValue();
        counter2.decrement();
        counter2.printValue();
        counter2.decrement();
        counter2.printValue();
        counter2.decrement();

    }
}
