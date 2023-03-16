import productStore.product.MyException;
import productStore.product.Product;
import productStore.product.flourProduct.Bread;
import productStore.product.flourProduct.Pasta;
import productStore.product.flourProduct.Buns;
import productStore.product.meatProduct.Fish;
import productStore.product.milkProduct.Cheese;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        List<Product> products = new ArrayList<>();

        products.add(new Bread(1,"Baradinskiy","Nur", LocalDate.of(2023,3,10)));
        products.add(new Bread(2,"Stolichnyi","Vash hleb", LocalDate.of(2023,3,12)));
        products.add(new Bread(3,"Zavarnoy","Nur", LocalDate.of(2023,6,9)));
        products.add(new Bread(4,"Rjanoy","Moya Semeynya", LocalDate.of(2023,3,15)));
        products.add(new Bread(5,"Chiabatta","Nur", LocalDate.of(2023,3,11)));

        products.add(new Pasta(6,"Fetuchini","Barilla",LocalDate.of(2023,3,14)));
        products.add(new Pasta(7,"Kannelloni","Nur",LocalDate.of(2023,3,17)));
        products.add(new Pasta(8,"Farfalle","Barilla",LocalDate.of(2023,4,12)));
        products.add(new Pasta(9,"Penne","Nur",LocalDate.of(2023,5,14)));

        products.add(new Buns(10,"Ulitka","Nur",LocalDate.of(2023,9,14)));
        products.add(new Buns(11,"Grebeshok","Yashkino",LocalDate.of(2023,7,17)));
        products.add(new Buns(12,"Rogalik","Nur",LocalDate.of(2023,6,4)));
        products.add(new Buns(13,"Plushka","Nur",LocalDate.of(2023,4,7)));

        products.add(new Fish(14,"Lasos","Leor",LocalDate.of(2023,5,16)));
        products.add(new Fish(15,"Forel","Toyboss",LocalDate.of(2023,6,16)));
        products.add(new Fish(16,"Seledka","Toiboss",LocalDate.of(2023,9,16)));
        products.add(new Fish(17,"Kambala","Leor",LocalDate.of(2023,10,23)));

        products.add(new Cheese(18,"Camamber","Markovskiy",LocalDate.of(2023,3,19)));
        products.add(new Cheese(18,"Parmezan","Milka",LocalDate.of(2023,3,16)));
        products.add(new Cheese(18,"Dorblu","President",LocalDate.of(2023,7,10)));
        products.add(new Cheese(18,"Mazarella","Milka",LocalDate.of(2023,11,9)));


        StoreService service = new StoreService();
        service.addNewProduct(products);
        service.sortByDiscount(products);

        try {
            service.matchesManager(products);
        }catch (MyException a){
            System.out.println(a.getMessage());
        }
































    }

}