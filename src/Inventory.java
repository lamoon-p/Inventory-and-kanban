import java.util.ArrayList;
import java.util.List;

public class Inventory {

    private List<Product> stock = new ArrayList<>();

    public List<Product> getStock() {
        return stock;
    }

    public void setStock(List<Product> stock) {
        this.stock = stock;
    }

    // add/remove product from inventory
    public void addProductToStock(Product product) {
        stock.add(product);
        System.out.println(product.getName() + " added to inventory!");
    }

    public void removeProductFromStock(int stockIndex) {
        String nameTemp = stock.get(stockIndex).getName();
        stock.remove(stockIndex);
        System.out.println(nameTemp + " removed from inventory!");
    }

    // compare available stock
    public void whatShouldOrder() {

        List<String> order = new ArrayList<>();

        for (Product product : stock) {
            if (product.getProductAvailable() <= product.getProductKanban()) {
                order.add(product.getName());
            }
        }

        System.out.println(order + " on low inventory, must be ORDER NOW!");

    }

    @Override
    public String toString() {
        return "Inventory{" +
                "stock=" + stock +
                '}';
    }
}
