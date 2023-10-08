import Arrays.Arrays;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static java.util.Locale.filter;

public class Product {
    private String type;
    private double price;
    private boolean discount;

    //1.1 Отримання всіх продуктів у вигляді списку, категорія яких еквівалентна "Book" та ціна більше 250:
    List<Product> result;

    public Product() {
        Arrays products = null;
        result = products.stream()
                .filter(product -> "Book".equals(product.getType()) && product.getPrice() > 250)
                .collect(Collectors.toList());
    }

    List<Product> result = products.stream()
            .filter(product -> "Book".equals(product.getType()))
            .map(product -> {
                if (product.isDiscount()) {
                    product.setPrice(product.getPrice() * 0.9);
                }
                return product;
            })
            .collect(Collectors.toList());

    private Optional<Object> products;
    Optional<Product> cheapestBook = products.stream()
            .filter(product -> "Book".equals(product.getType()))
            .min(Comparator.comparing(Product::getPrice));

    private static <U> U getPrice(Object o) {
        U o1 = null;
        return o1;
    }

if(cheapestBook.isPresent())

    {
        Product cheapest;
        cheapest = cheapestBook.get();
        System.out.println("Найдешевший продукт: " + cheapest.getName() + " за ціною " + cheapest.getPrice());
    }

    private String getName() {
        return null;
    }

    private static String getPrice() {
        String o = null;
        return o;
    } else

    {
        throw new RuntimeException("Продукт [категорія: Book] не знайдено");
    }
//4.2 Отримання трьох останніх доданих продуктів:

    List<Product> lastThreeProducts = products.stream()
            .sorted(Comparator.comparing(Product::getAddDate).reversed())
            .limit(3)
            .collect(Collectors.toList());

    private static <U> U getAddDate(Object o) {
    }
//5.2 Калькуляція загальної вартості продуктів за заданими критеріями:

    double totalCost = products.stream()
            .filter(product -> product.getAddDate().getYear() == Year.now().getValue()
                    && "Book".equals(product.getType()) && product.getPrice() <= 75)
            .mapToDouble(Product::getPrice)
            .sum();
//6.2 Групування об'єктів за типом продукту у форматі "Словник":

    Map<String, List<Product>> groupedProducts = products.stream()
            .collect(Collectors.groupingBy(Product::getType));
}



        
