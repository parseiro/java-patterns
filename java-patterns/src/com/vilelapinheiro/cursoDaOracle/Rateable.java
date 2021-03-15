package com.vilelapinheiro.cursoDaOracle;

@FunctionalInterface
public interface Rateable<T> {
    public static final Rating DEFAULT_RATING = Rating.NOT_RATED;

    public default Rating getRating() {
        return DEFAULT_RATING;
    }

    T applyRating(Rating rating);

    public default T applyRating(int stars) {
        return applyRating(Rateable.convert(stars));
    }

    public static Rating convert(int stars) {
        return (stars >= 0 && stars <= 5) ? Rating.values()[stars] : DEFAULT_RATING;
    }

}
