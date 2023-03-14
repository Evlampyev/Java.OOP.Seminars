package Les1;

public interface Flyable {
    int getFlyghtSpeed();

    default String getType() {
        return this.getClass().getSimpleName();
    }

}

