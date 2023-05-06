package org.example;

import java.util.ArrayList;
import java.util.List;

public class Hobby {
    private String name;
    private int frequency;
    public List<Adress> adressList = new ArrayList<>();

    public Hobby(String name, int frequency, List<Adress> adressList) {
        this.name = name;
        this.frequency = frequency;
        this.adressList = adressList;
    }
}
