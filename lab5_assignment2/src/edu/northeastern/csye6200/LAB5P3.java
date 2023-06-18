package edu.northeastern.csye6200;

public class LAB5P3 {
    public static void main(String[] args) {
        // Create products
        Product p1 = new Product("Milk", 3.7);
        Product p2 = new Product("Bread", 2.25);
        Product p3 = new Product("Eggs", 4.3);

        // Create cart
        Cart cart = new Cart();

        // Add products to the cart
        cart.addProduct(p1);
        cart.addProduct(p3);

        // Print the products
        System.out.println("Creating the below products");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Print adding products to the cart
        System.out.println("\nAdding Milk and Eggs to Cart");

        // Print the cart
        System.out.println("Cart: " + cart);

        // Print the total cart value
        System.out.println("Total Cart Value: $" + cart.getCartTotal());

        // Calculate change after payment
        double payment = 10.0;
        double change = cart.calculateChange(payment);

        // Print the payment and change
        System.out.println("\nCustomer payment: $" + payment);
        System.out.println("Total Change: $" + change);
    }
}
