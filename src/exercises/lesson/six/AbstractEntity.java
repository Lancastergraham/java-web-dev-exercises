package exercises.lesson.six;

import java.util.concurrent.ThreadLocalRandom;

public abstract class AbstractEntity {
    private int ID = 0;

    public AbstractEntity() {
//        this.ID = ThreadLocalRandom.current().nextInt(0, 100+1);
        this.ID += 1;
        this.ID = this.ID;
    }

    public int getId() {
        return this.ID;
    }
}
