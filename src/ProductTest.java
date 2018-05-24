public class ProductTest {
    public static void main(String[] args) {
        Product product = new Product("Koń", "Przyroda", 1234, "Zwierzę");
        Product product1 = new Product("Lampa", "Ikea", "Dom");

        product.showInfo();
        product1.showInfo();
    }
}
