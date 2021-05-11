package exercises.lesson.six;

public class Computer extends AbstractEntity{
    private int ram;
    private int storage;
    private boolean hasScreen;

    public Computer (int storage, int ram, boolean hasScreen) {
        this.ram = ram;
        this.storage = storage;
        this.hasScreen = hasScreen;
    }

    public void increaseRam(int number) {
        this.ram = this.ram + number;
    }
}
