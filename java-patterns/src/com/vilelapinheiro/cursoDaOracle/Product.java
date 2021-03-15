package com.vilelapinheiro.cursoDaOracle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;

/**
 * @author Leonardo
 * @version 1.0
 */
public class Product implements Rateable<Product> {
    private int id;
    private String name;
    private BigDecimal price;
    private Rating rating;

    /**
     * A constant that defines a {@link java.math.BigDecimal BigDecimal} value of a discount rate.
     */
    public static final BigDecimal DISCOUNT_RATE = BigDecimal.valueOf(0.1);

    /**
     * @return user id number
     */
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
//        price = BigDecimal.ONE;

        this.price = price;
    }

    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2, HALF_UP);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("Clonando...");
        return super.clone();
    }

    @Override
    public Product applyRating(Rating rating) {
        return null;
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }



/*    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && name.equals(product.name) && price.equals(product.price);
    }*/

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }
}
