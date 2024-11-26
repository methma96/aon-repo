/**
 * Use Decorator pattern to make the code transparent without modifying existing classes.
 */

public class TimeIncDec implements IncDec {

    private IncDec instance;

    public TimeIncDec(IncDec instance) {
        this.instance = instance;
    }

    @Override
    public void increment() {

        long startTime = System.nanoTime();
        instance.increment();
        long endTime = System.nanoTime();
        System.out.println("increment took " + (endTime - startTime) + " ms");

    }

    @Override
    public void decrement() {

        long startTime = System.nanoTime();
        instance.decrement();
        long endTime = System.nanoTime();
        System.out.println("decrement took " + (endTime - startTime) + " ms");

    }
}
