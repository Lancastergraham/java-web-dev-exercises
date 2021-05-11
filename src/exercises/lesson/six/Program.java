package exercises.lesson.six;

public class Program {
    public static void main(String[] args) {
        Laptop myLappy = new Laptop(800, 16, true, 100);
        SmartPhone mySmarty = new SmartPhone(16, 32, true, 100);

        System.out.println(myLappy.getId());
        System.out.println(mySmarty.getId());
    }
}
