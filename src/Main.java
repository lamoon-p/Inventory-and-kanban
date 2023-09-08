public class Main {

    public static void main(String[] args) {
	// write your code here
        Product product1 = new Product();
        product1.setName("Screwdriver");
        product1.setPrice(666);
        product1.setSerialNumber(326549785437L);
        product1.setProductKanban(35);
        product1.setProductAvailable(35);

        Product product2 = new Product();
        product2.setName("Chef knife");
        product2.setPrice(1969);
        product2.setSerialNumber(7943581666785L);
        product2.setProductKanban(500);
        product2.setProductAvailable(2147483647);

        Product product3 = new Product();
        product3.setName("Lollipop");
        product3.setPrice(5);
        product3.setSerialNumber(46132181621L);
        product3.setProductKanban(500);
        product3.setProductAvailable(100);

        Product product4 = new Product();
        product4.setName("24K gold");
        product4.setPrice(5000000);
        product4.setSerialNumber(888888888888L);
        product4.setProductKanban(2);
        product4.setProductAvailable(10);

        Inventory stock = new Inventory();
        stock.addProductToStock(product1);
        stock.addProductToStock(product2);
        stock.addProductToStock(product3);
        stock.addProductToStock(product4);

        stock.removeProductFromStock(3);

        stock.whatShouldOrder();
    }
}
