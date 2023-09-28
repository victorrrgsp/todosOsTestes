package util;

import java.util.function.Function;

import entities.Product;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product p) {
        // o toUpperCase vai trasformar o q estar dentro do getName em Maiusculo
        return p.getName().toUpperCase();
    }

}
