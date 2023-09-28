package entities.service;

import java.util.List;
import java.util.function.Predicate;

import entities.Product;

public class ProductServise {

    public double filteredSom(List<Product> list, Predicate<Product> criteria){
        double som = 0.0;
        for (Product pro : list) {
            if (criteria.test(pro)){
                som += pro.getPrice();
            }
        }
        return som;
    }
}
