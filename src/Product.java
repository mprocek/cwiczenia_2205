class Product {
    String name;
    String producer;
    double price;
    String category;

    Product(String name, String producer, String category){
        this.name=name;
        this.producer=producer;
        this.category=category;
    }

    Product(String name, String producer, double price, String category){
        this(name,producer,category);
        this.price=price;
    }

    void showInfo(){
        System.out.println(name + " " + producer + " " + price + " " + category);
    }
}