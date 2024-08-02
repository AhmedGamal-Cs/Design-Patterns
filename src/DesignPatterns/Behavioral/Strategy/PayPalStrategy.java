/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Behavioral.Strategy;

public class PayPalStrategy implements PaymentStrategy{
    private String emailId;
    private String password;
    
    public PayPalStrategy(String emailId, String password) {
        this.emailId = emailId;
        this.password = password;
    }
    
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid using PayPal.");
    }
}
