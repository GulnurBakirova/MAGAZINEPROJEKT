package productStore.product;

public class Manager {
    private final String login="gulnur0993";

    private final String password="qazplm9093";

    public Manager(){
    };

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Manager " +
                "Login-> " + login + '\'' +
                "Password-> " + password;
    }
}



