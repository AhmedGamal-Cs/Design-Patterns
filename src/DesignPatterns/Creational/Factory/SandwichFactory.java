/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Creational.Factory;

public class SandwichFactory {
    static final int CHICKEN_BURGER=1;
    static final int CHEESE_BURGER=2;
    public static Sandwich createSandwich(int sandwichId){
        switch(sandwichId){
            case CHICKEN_BURGER:
                return new chickenBurger();
            case CHEESE_BURGER:
                return new cheeseBurger();
            default:
                return null;
        }
    }
}
