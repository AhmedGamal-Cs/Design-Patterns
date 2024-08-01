/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Structural.Adapter;

public class Bicycle {
    void pedal(){
        System.out.println("moveing");
    }
    
    void stop(){
        System.out.println("stopp!");
    }
    
    void ring(){
        System.out.println("Ring ring ..");
    }
}
