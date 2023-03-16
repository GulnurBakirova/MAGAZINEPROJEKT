import productStore.product.Manager;
import productStore.product.MyException;
import productStore.product.Product;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class StoreService implements Serviceable{
private final Manager manager = new Manager();

    @Override
    public void addNewProduct(List<Product> productList) {
        List<Product> productPrinyat=productList.stream().filter(f->f.getCompanyName().equals("Nur")
        || f.getCompanyName().equals("Toyboss")
        ||f.getCompanyName().equals("Milka")).filter(k->k.getDate().minusMonths(1)
                .isAfter(LocalDate.now())).toList();
        System.out.println("\nПринятые товары: ");
        productPrinyat.forEach(System.out::println);
    }

    @Override
    public void sortByDiscount(List<Product> productA) {
        productA.removeIf(g->g.getDate().isBefore(LocalDate.now()));

        List<Product>productList=productA.stream().filter(d->d.getCompanyName().equals("Toyboss")
    || d.getCompanyName().equals("Nur")
        ||d.getCompanyName().equals("Milka")).filter(a->!a.getDate().isAfter(LocalDate.now()
                .plusDays(7))).toList();
        System.out.println("Товары по акции: ");
        productList.forEach(System.out::println);
    }

    @Override
    public void matchesManager(List<Product> productB) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nНапишите ваш логин: ");
        String login = sc.nextLine();
        System.out.println("Напишите ваш пароль: ");
        String password = sc.nextLine();

        if (login.equals(manager.getLogin())
        && password.equals(manager.getPassword())){
            System.out.println("Добропожаловать! " + login);
            addNewProduct(productB);
            sortByDiscount(productB);
        }else {
            throw new MyException("Не правильный логин или пароль! Пожалуйста, напишите правильный логин и пароль!!!");
        }
    }
}
