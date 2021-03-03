package com.vilelapinheiro.cursoDaOracle;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static java.math.RoundingMode.HALF_UP;

/**
 * @author Leonardo
 * @version 1.0
 */
public class Product {
    private int id;
    private String name;
    private BigDecimal price;

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
}
