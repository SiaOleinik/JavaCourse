package day11.task1;

public interface Worker {
    public void doWork();

    public default int bonus() {
        return 0; // question??
    }


}
