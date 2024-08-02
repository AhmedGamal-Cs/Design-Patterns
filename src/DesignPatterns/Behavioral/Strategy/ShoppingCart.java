/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Behavioral.Strategy;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;

    void setPaymentStrategy(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }
    void checkout(int amount){
        paymentStrategy.pay(amount);
    }
}
