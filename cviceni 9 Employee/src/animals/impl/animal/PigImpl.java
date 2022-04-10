package animals.impl.animal;

import animals.Animal;

public class PigImpl implements Animal {

    private byte age;

    public PigImpl() {}

    public PigImpl(byte age) {
        super();
        this.age = age;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "PigImpl [age=" + age + "]";
    }


    @Override
    public String sound() {
        return null;
    }
}