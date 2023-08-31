public class User {
    private  Bascket bascket;
    private String login;
    private String password;

    public  void buy(String p){
        bascket.lay(p);
    }

    public User(Bascket bascket, String login, String password) {
        this.bascket = bascket;
        this.login = login;
        this.password = password;
    }


    public  void infoBuy(){
        System.out.println(this.login+" купил:");
        bascket.info();
    }
}
