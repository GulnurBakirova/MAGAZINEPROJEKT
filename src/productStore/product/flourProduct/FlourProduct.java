package productStore.product.flourProduct;

import productStore.product.Product;

import java.time.LocalDate;

public abstract class FlourProduct  extends Product {
    public FlourProduct(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
