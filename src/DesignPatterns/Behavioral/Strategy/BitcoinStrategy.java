/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Behavioral.Strategy;

public class BitcoinStrategy implements PaymentStrategy {
    private String walletId;
    
    public BitcoinStrategy(String walletId) {
        this.walletId = walletId;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using Bitcoin.");
    }
}
