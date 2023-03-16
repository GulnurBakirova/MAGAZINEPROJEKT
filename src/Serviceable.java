import productStore.product.Product;

import java.util.List;

public interface Serviceable {

    void addNewProduct(List<Product> productList);
    void sortByDiscount(List<Product>productA);
    void matchesManager(List<Product>productB);
}
