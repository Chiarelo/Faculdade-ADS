package br.edu.fatecfranca;

import br.edu.fatecfranca.Product;
import br.edu.fatecfranca.ShoppingCart;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product prod1 = new Product(1, "Bola de Basquete", 400);
        Product prod2 = new Product(2, "Bola de Futebol", 300);
        Product prod3 = new Product(3, "Bola de Volei", 200);

        ShoppingCart cart1 = new ShoppingCart(100, new Date(), "Franca",
                "Pix", 0);
        cart1.addCarItem(prod1, 2, 10);
        cart1.addCarItem(prod2, 5, 12);
        cart1.calculateTotalPrice();
        System.out.println(cart1);

        ShoppingCart cart2 = new ShoppingCart(101, new Date(), "Ipuã",
                "CC", 0);
        cart2.addCarItem(prod1, 4, 11);
        cart2.addCarItem(prod3, 10, 13);
        cart2.calculateTotalPrice();
        System.out.println(cart2);


    }
}