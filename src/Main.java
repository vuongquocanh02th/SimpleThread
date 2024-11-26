public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new NumberGenerator();
        NumberGenerator generator2 = new NumberGenerator();
        //
        Thread thread = new Thread(generator);
        Thread thread2 = new Thread(generator2);
        //Dat do uu tien cho cac thread
        thread.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.MIN_PRIORITY);
        //In ra thong tin ve do uu tien cho cac thread
        System.out.println("Thread 1 priority: " + thread.getPriority());
        System.out.println("Thread 2 priority: " + thread2.getPriority());
        //Chay cac thread
        thread.start();
        thread2.start();
    }
}