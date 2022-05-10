package Model;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;

public class Car {
    private String name;
    private String country;
    private int value;

    public Car() {
    }

    public Car(String name, String country, int value) {
        this.name = name;
        this.country = country;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
