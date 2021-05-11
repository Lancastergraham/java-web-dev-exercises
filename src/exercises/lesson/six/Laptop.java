package exercises.lesson.six;

public class Laptop extends Computer {

    private int batteryLife;

    public Laptop(int storage, int ram, boolean hasScreen, int batteryLife) {
        super(storage, ram, hasScreen);
        this.batteryLife = batteryLife;
    }

    public boolean needsToPlugin() {
        if (batteryLife < 10) {
            return true;
        } else {
            return false;
        }
    }
}
