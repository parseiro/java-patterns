package com.vilelapinheiro.cursoDaOracle;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class GrandeInteiroDemo {
    public static void main(String[] args) {
        BigDecimal price = BigDecimal.valueOf(1.85);
        BigDecimal rate = BigDecimal.valueOf(0.065);

        var resultado = price.subtract(price.multiply(rate)).setScale(2, RoundingMode.HALF_UP);

        System.out.println("Resultado: " + resultado);

        Locale local = Locale.UK;

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(local);
        NumberFormat percentFormat = NumberFormat.getPercentInstance(local);
        percentFormat.setMaximumFractionDigits(2);

        System.out.println("Preço: " + currencyFormat.format(price));
        System.out.println("Porcentagem: " + percentFormat.format(rate));

        LocalDate today = LocalDate.now();
        LocalTime teaTime = LocalTime.of(17,30);
        Duration timeGap = Duration.between(LocalTime.now(), teaTime);

        ZoneId katmandu = ZoneId.of("Asia/Katmandu");
        ZoneId london = ZoneId.of("Europe/London");
        var tomorrowTeaTime = LocalDateTime.of(today.plusDays(1), teaTime);
        ZonedDateTime londonTime = ZonedDateTime.of(tomorrowTeaTime, london);
        System.out.println(londonTime);
        ZonedDateTime katmanduTime = londonTime.withZoneSameInstant(katmandu);
        System.out.println(katmanduTime);

        String datePattern = "EE', 'd' de 'MMMM yyyy' às 'HH:mm z";
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern(datePattern, local);
        String timeTxt = dateFormat.format(katmanduTime);
        System.out.println(timeTxt);
    }
}
