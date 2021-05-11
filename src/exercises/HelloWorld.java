package exercises;

public class HelloWorld {

    private String message = "Hello World";

    @SuppressWarnings("AccessStaticViaInstance")
    void sayHello() {
        String message = "Goodbye World";

        //System.out.println(HelloWorld.message);
        System.out.println(this.message);
        //Here we can see variable shadowing, because message in the method has higher
        // priority. We will get goodbye world.
        System.out.println(message);
    }
}
