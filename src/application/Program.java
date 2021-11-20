package application;

import entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Program {
    public static void main (String[] args){

        Locale.setDefault(Locale.US);
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV",900.00));
        list.add(new Product("Mouse",50.00));
        list.add(new Product("Tablet",350.00));
        list.add(new Product("HD Case",80.90));

        double min =100.0;


        //Implementacao por lambda Inline
        list.removeIf(p -> p.getPrice() >= min);

        list.forEach(product -> System.out.println(product));
    }
}
