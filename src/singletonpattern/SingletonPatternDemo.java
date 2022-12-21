/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonpattern;

/**
 *
 * @author Umman Hasan
 */
public class SingletonPatternDemo
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // illegal construct
        // Compile Time Error: The constructor SingleObject() isn't visible
        // SingleObject object = new SingleObject();
        
        // Get the only object available 
        SingleObject object = SingleObject.getInstance();
        object.showMessage();
      
    }
    
}
