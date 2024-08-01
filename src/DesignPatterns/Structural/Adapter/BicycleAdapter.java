/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Structural.Adapter;
public class BicycleAdapter implements Vehicle{
    public Bicycle bike;

    public BicycleAdapter(Bicycle bike){
        this.bike=bike;
    }
    
    @Override
    public void accelerate() {
        this.bike.pedal();
    }

    @Override
    public void pushBreak() {
        this.bike.stop();
    }

    @Override
    public void soundHorn() {
        this.bike.ring();
    }
    
}
