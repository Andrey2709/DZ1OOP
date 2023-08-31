import java.util.ArrayList;
import java.util.List;

public class ProductHeandler {
    static List<Product> products = init();

    public static List<Product> init() {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Milk", 100, 6));
        products.add(new Product("Apple", 50, 8));
        products.add(new Product("Bread", 40, 5));
        products.add(new Product("Pasta", 80, 1));
        products.add(new Product("Dumplings", 150, 9));
        return products;

    }

    public static void info() {

        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i).toString());
            System.out.println("========================================>");
        }

    }


    public static Product getProductFromStore(String name) {
        Product p = products.stream().filter(product -> product.getName().equals(name)).findFirst().orElseThrow();
        products.remove(p);
        return p;
    }
}
