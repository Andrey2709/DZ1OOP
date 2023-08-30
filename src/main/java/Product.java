public class Product {
    private String name;
    private int price;
    private int rating;

    public Product(String name, int price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }


    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getRating() {
        return rating;
    }

    public static void getAll() {
    Product [] p = init();
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].toString());
            System.out.println("========================================>");
        }

    }



    public static Product[] init() {
        Product[] products = new Product[5];
        products[0] = new Product("Milk", 100, 6);
        products[1] = new Product("Apple", 50, 8);
        products[2] = new Product("Bread", 40, 5);
        products[3] = new Product("Pasta", 80, 1);
        products[4] = new Product("Dumplings", 150, 9);
        return products;

    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}
