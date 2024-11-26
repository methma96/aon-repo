public class Main {
    public static void main(String[] args) {
        // Step 1: Create a MyIncDec instance
        IncDec myIncDec = new MyIncDec(2);

        // Step 2: Wrap it with the TimedIncDec decorator
        IncDec timeIncDec = new TimeIncDec(myIncDec);

        // Step 3: Test the methods
        timeIncDec.increment();
        timeIncDec.decrement();
    }
}