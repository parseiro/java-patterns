package com.vilelapinheiro.patterns.Iterator;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class BikeRepository implements  Iterable<String> {

    private String[] bikes;
    private int index;

    public BikeRepository() {
        bikes = new String[10];
        index = 0;
    }

    public BikeRepository addBike(String bike) {
        if (index == bikes.length) {
            String[] largeBikes = new String[bikes.length + 5];
            System.arraycopy(bikes, 0, largeBikes, 0, bikes.length);
            bikes = largeBikes;
        }

        bikes[index] = bike;
        index++;

        return this;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int currentIndex = 0;

            @Override
            public boolean hasNext() {
                return currentIndex < bikes.length && bikes[currentIndex] != null;
            }

            @Override
            public String next() {
                return bikes[currentIndex++];
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

    }

}
