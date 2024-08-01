/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Structural.Adapter;


public class Car implements Vehicle{

    @Override
    public void accelerate() {
        System.out.println("Car Start moving ");
    }

    @Override
    public void pushBreak() {
        System.out.println("Car stopped");
    }

    @Override
    public void soundHorn() {
        System.out.println("Beeb beeb...");
    }
    
}
