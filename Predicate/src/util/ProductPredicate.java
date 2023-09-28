package util;

import java.util.function.Predicate;

import entities.Product;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product arg0) {
        return arg0.getPrice() >= 100.0;
    }

    
}
