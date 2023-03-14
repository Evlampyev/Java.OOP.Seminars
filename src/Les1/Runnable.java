package Les1;

public interface Runnable {
    int getRunSpeed();

    default String getType() {
        return this.getClass().getSimpleName();
    }
}
