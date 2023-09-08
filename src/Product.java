public class Product {

    private String name;
    private int price;
    private long serialNumber; // or barcode
    private int productKanban;
    private int productAvailable;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public long getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(long serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getProductKanban() {
        return productKanban;
    }

    public void setProductKanban(int productKanban) {
        this.productKanban = productKanban;
    }

    public int getProductAvailable() {
        return productAvailable;
    }

    public void setProductAvailable(int productAvailable) {
        this.productAvailable = productAvailable;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", serialNumber=" + serialNumber +
                ", productKanban=" + productKanban +
                ", productAvailable=" + productAvailable +
                '}';
    }
}