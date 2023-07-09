package animals.impl.animal;

import animals.Animal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;


public class GoatImpl implements Animal {

    private byte age;

    public GoatImpl() {}

    public GoatImpl(byte age) {
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
        return "GoatImpl [age=" + age + "]";
    }

    @Override
    public String sound() {
        return null;
    }
}