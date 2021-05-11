package exercises.lesson.six;

public class SmartPhone extends Computer {
    private int numberOfSelfies;


    public SmartPhone(int storage, int ram, boolean hasScreen, int numberOfSelfies) {
        super(storage, ram, hasScreen);
        this.numberOfSelfies = numberOfSelfies;
    }

    public int takeSelfie() {
        return this.numberOfSelfies = this.numberOfSelfies + 1;
    }
}
