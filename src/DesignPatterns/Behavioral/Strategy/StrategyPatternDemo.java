/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Behavioral.Strategy;

public class StrategyPatternDemo {
    public static void main(String[] args){
        ShoppingCart cart = new ShoppingCart();
        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9101-1121","John Doe"));
        cart.checkout(100);
        
        cart.setPaymentStrategy(new PayPalStrategy("asd.7shaltwatz@gmail.com","Hello World"));
        cart.checkout(150);
        
        cart.setPaymentStrategy(new BitcoinStrategy("my-wallet-id"));
        cart.checkout(300);
    }
}
