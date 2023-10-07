public class SingletonThread extends Thread {

    private Thread t;
    private String threadName;

    SingletonThread(String name) {
        threadName = name;
        System.out.println("Creating " + threadName);
    }

    @Override
    public void run() {
        System.out.println("Running " + threadName);
        System.out.println(threadName + " HASHCODE: " + LazyInitializedSingleton.getInstance().hashCode());
    }

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            SingletonThread newThread = new SingletonThread("Thread #" + (i+1));
            newThread.start();
        }
    }
}