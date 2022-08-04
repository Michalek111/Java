package hello;

import lombok.AllArgsConstructor;
import lombok.Getter;



public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
