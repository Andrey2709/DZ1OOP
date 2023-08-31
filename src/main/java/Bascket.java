import java.util.List;

public class Bascket {


    private List<Product> products;


    public Bascket(List<Product> products) {
        this.products = products;
    }

    public void lay(String nameProduct) {

        products.add(ProductHeandler.getProductFromStore(nameProduct));
    }


    public void info() {
        for (int i = 0; i <products.size() ; i++) {
            System.out.println(products.get(i).toString());
        }

    }
}
