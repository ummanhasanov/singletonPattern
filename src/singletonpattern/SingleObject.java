/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Umman Hasan
 */
public class SingleObject
{
    // create an object of SingleObject   

    private static SingleObject instance = new SingleObject();

    // make the constructor private to that this class cannot be instantiated
    private SingleObject() {

    }

    // get the only object available
    public static SingleObject getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello world!");
    }

}
