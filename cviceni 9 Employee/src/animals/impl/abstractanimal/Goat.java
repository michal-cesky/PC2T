package animals.impl.abstractanimal;

import animals.AbstractAnimal;


public class Goat extends AbstractAnimal {



    @Override
    public String sound() {
        return "Koza dela: bee";
    }

    @Override
    public String toString() {
        return "Goat [age=" + age + "]";
    }

}