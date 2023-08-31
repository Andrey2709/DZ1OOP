import java.util.List;

public class Categories {
    private String name;
    private List<Product> products;

    public Categories(String name, List<Product> products) {
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public List<Product> getProducts() {
        return products;
    }


}
