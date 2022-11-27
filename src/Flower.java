import java.text.DecimalFormat;

import static valid.ValidateUtils.validateString;

public class Flower {
    private final static String DEFAULT_MESSAGE = "Тип цветка не указан";
    private final static String getDEFAULT_MESSAGE = "Россия";
    private final String flowerName;
    private final String country;
    private final double cost;
    private int lifeSpan;

    public Flower(String flowerName, String country, double cost, int lifeSpan) {
        this.flowerName = validateString(flowerName, DEFAULT_MESSAGE);
        this.country = validateString(country, getDEFAULT_MESSAGE);
        this.cost = validateCost(cost);
        this.lifeSpan = lifeSpan;
    }

    public static Double validateCost(Double cost) {
        return cost == null || cost <= 0 ? 1 : cost;
    }

    public String getFlowerName() {
        return flowerName;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;//<= 0 ? 0 : cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        } else
            this.lifeSpan = lifeSpan;
    }

    @Override
    public String toString() {
        String pattern = ".00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);

        return "Flower{" +
                "flowerName='" + flowerName + '\'' +
                ", country='" + country + '\'' +
                ", cost=" + decimalFormat.format(cost) +
                ", lifeSpan=" + lifeSpan + '}';
    }
}