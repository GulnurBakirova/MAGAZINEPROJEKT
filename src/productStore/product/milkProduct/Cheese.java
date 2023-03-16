package productStore.product.milkProduct;

import java.time.LocalDate;

public class Cheese extends MilkProduct{
    public Cheese(int id, String name, String companyName, LocalDate date) {
        super(id, name, companyName, date);
    }
}
