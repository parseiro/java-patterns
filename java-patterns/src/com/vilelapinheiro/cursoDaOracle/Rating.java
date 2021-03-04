package com.vilelapinheiro.cursoDaOracle;

public enum Rating {
    NOT_RATED("Nenhuma estrela"),
    ONE_STA("1 estrela"),
    TWO_STARS("2 estrelas"),
    THREE_START("3 estrelas"),
    four_starrs("4 estrelas"),
    five_stars("5 estrelas");

    private String stars;

    Rating(String stars) {
        this.stars = stars;
    }


    public String getStars() {
        return this.stars;
    }
}
