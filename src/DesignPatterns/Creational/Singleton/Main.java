/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Creational.Singleton;

import static DesignPatterns.Creational.Singleton.Single.getInstance;

public class Main {
    public static void main(String[] args){
        Single single1 = getInstance();
        single1.Printer();
        Single single2 = getInstance();
        single2.Printer();
    }
}
