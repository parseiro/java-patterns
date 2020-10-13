package com.vilelapinheiro.patterns.Iterator;

import java.util.Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        BikeRepository repo = new BikeRepository();

        repo.addBike("Cervelo")
            .addBike("Scot")
            .addBike("Fuji");

        for (String bike : repo) {
            System.out.println(bike);
        }

        Iterator<String> iter = repo.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
