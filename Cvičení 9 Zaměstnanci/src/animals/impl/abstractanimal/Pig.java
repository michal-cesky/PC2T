package animals.impl.abstractanimal;

import animals.AbstractAnimal;

public class Pig extends AbstractAnimal {

    @Override
    public String sound() {
        return "Prase dela: chro chro";
    }

    @Override
    public String toString() {
        return "Pig [age=" + age + "]";
    }

}