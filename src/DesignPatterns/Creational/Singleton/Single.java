/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DesignPatterns.Creational.Singleton;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Single {
    private Integer[] numbers= {1,2,3,6,5,7};
    private List<Integer> list = Arrays.asList(numbers);
    private static Single instance;
    
    public static Single getInstance(){
        if(instance == null){
            instance = new Single();
        }
        return instance;
    }
    private Single(){
        System.out.println("Object Created");
        Collections.shuffle(list);
    }
    public void Printer(){
        for(Integer i : list){
            System.out.print(i.toString()+" ");
        }
        System.out.println();
    }
}
