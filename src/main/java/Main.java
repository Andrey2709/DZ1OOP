import java.util.ArrayList;

public class Main {
    /**
     * 1)Создать класс Товар, имеющий переменные имя, цена, рейтинг. +
     * 2)Создать класс Категория, имеющий переменные имя и массив товаров. Создать несколько объектов класса Категория. +
     * 3)Создать класс Basket, содержащий массив купленных товаров. +
     * 4)Создать класс User, содержащий логин, пароль и объект класса Basket. Создать несколько объектов класса User. +
     * 5)Вывести на консоль каталог продуктов. (все продукты магазина)
     * 6)Вывести на консоль покупки посетителей магазина. (После покупки у пользователя добавляется товар, а из магазина - удаляется)
     *
     * @param args
     */
    public static void main(String[] args) {
        ProductHeandler.info();

        Bascket bascket = new Bascket(new ArrayList<>());
        Bascket bascket1 = new Bascket(new ArrayList<>());
        Bascket bascket2 = new Bascket(new ArrayList<>());


        User user = new User(bascket, "Anton", "qwerty");
        User user1 = new User(bascket1, "Adre", "qwerty1");
        User user2 = new User(bascket2, "Anna", "qwerty2");


        /**
         * Так как в дз четко не указана необходимость внести информацию в категории по товарам.
         * Я добавил несколько обьектов по категориям для примера их распределения.
         */
        var dairy =new Categories("Dairy", new ArrayList<>()){
            private  void findAndAdd(){
               this.getProducts().add(ProductHeandler.products.get(0));
            }
        };
        dairy.findAndAdd();
        var bakery =new Categories("Bakery", new ArrayList<>()){
            private  void findAndAdd(){
                this.getProducts().add(ProductHeandler.products.get(2));
                this.getProducts().add(ProductHeandler.products.get(3));
            }
        };
        bakery.findAndAdd();


        user.buy("Apple");
        user1.buy("Bread");
        user2.buy("Pasta");

        user.infoBuy();
        user1.infoBuy();
        user2.infoBuy();

        System.out.println("++++++++++++++++++++++++++++++++");
        ProductHeandler.info();

        System.out.println("++++++++++++++++++++++++++++++++");
        System.out.println(dairy.getProducts());
        System.out.println(bakery.getProducts());
    }
}
