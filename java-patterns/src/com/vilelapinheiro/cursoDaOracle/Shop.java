package com.vilelapinheiro.cursoDaOracle;

import java.math.BigDecimal;

public class Shop {
    public static void main(String... args) {
        Product p1 = new Product();

//        p1.setId(101);
//        p1.setName("Tea");
        p1.setPrice(BigDecimal.valueOf(1.99));

        System.out.println(p1.getId()+" "+p1.getName()+" "+p1.getPrice()+" "+p1.getDiscount());

        Rating rating = Rating.NOT_RATED;

        System.out.println("estrelas: " + rating.getStars());

        Object p2 = null;
        try {
            p2 = p1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(p1.hashCode());
        if (p2 != null) {
            System.out.println(p2.hashCode());
        }
    }
}
