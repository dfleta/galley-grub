package edu.poniperro.galleygrub.items;

import java.util.HashMap;
import java.util.Map;

public class Prices {

    static Map<String, Double> prices = new HashMap<String, Double>();

    public static void init_prices() {
        prices.put("cheese", 0.25d);
        prices.put("sauce", 0.50d);
        prices.put("medium", 0.25d);
        prices.put("large", 0.50d);
    }

    public static Double getPrice(String item) {
        return prices.get(item);
    }  
    
    public static boolean contains(String item) {
        return prices.containsKey(item);
    }

    public static void display() {
        prices.entrySet().stream()
                                .forEach(entry -> System.out.println("\t" + entry));
    }
}
