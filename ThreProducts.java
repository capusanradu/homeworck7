package HomeWorck7;

public class ThreProducts {
    public static void main(String[] args) {
       Product product1 = new Product();
       product1.setName("Sniker");
       product1.setPrice(5);
       product1.setQuantity(10);
       product1.setCategory("chiocolata");

        Product product2 = new Product();
        product2.setName("Twinx");
        product2.setPrice(9);
        product2.setQuantity(10);
        product2.setCategory("chiocolata");

        Product product3 = new Product();
        product3.setName("Lapte");
        product3.setPrice(3);
        product3.setQuantity(0);
        product3.setCategory("lactate");

        System.out.println(product1.hasStock());
        System.out.println(product2.isCategorie("lactate"));
    }
}
