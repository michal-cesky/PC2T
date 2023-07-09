package animals.impl.abstractanimal;

import animals.AbstractAnimal;

public class Cow extends AbstractAnimal {

    @Override
    public String sound() {
        return "Krava dela: buu";
    }

    @Override
    public String toString() {
        return "Cow [age=" + age + "]";
    }

}