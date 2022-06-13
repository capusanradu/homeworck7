package HomeWorck7;

public class Product {
    private String name;
    private int price;
    private int quantity;
    private String category;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCategory() {
        return category;
    }

    public boolean hasStock() {
       return this.quantity < 0;
    }

    public boolean isCategorie(String otherProduct) {
        return this.category == otherProduct;
    }
}

