/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Behavioral.Strategy;

public class CreditCardStrategy implements PaymentStrategy {
    private String cardNumber;
    private String cardHolderName;
    
    public CreditCardStrategy(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with credit card.");
    }
}
