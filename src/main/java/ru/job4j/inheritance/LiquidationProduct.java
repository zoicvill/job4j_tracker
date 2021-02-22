package ru.job4j.inheritance;

public final class LiquidationProduct{
    private Product product;

    public Product getProduct() {
        return product;
    }

    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
    }

    public String label(){
        return product.label();
    }
    public int discount(){
        return product.price() - 30;
    }
}
