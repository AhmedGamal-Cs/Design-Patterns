/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Creational.Factory;
import DesignPatterns.Creational.Factory.Sandwich;
public class Excutor {
    public static void main(String[] args){
        Sandwich sandwich = SandwichFactory.createSandwich(SandwichFactory.CHEESE_BURGER);
        sandwich.prepare();
        Sandwich sandwich2 = SandwichFactory.createSandwich(SandwichFactory.CHICKEN_BURGER);
        sandwich2.prepare();
    }
}
