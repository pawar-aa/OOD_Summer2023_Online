package edu.northeastern.csye6200;

import java.util.List;
import java.util.ArrayList;

public class Cart {
    private List<Product> products;
    private double cartTotal;

    public Cart() {
        products = new ArrayList<>();
        cartTotal = 0.0;
    }

    public double getCartTotal() {
        return cartTotal;
    }

    public void addProduct(Product product) {
        products.add(product);
        cartTotal += product.getPrice();
    }

    public double calculateChange(double payment) {
        return payment - cartTotal;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Cart{");
        for (int i = 0; i < products.size(); i++) {
            sb.append(" \"").append(products.get(i).getItemName()).append("\"");
            if (i != products.size() - 1) {
                sb.append(",");
            }
        }
        sb.append(" }");
        return sb.toString();
    }
}
