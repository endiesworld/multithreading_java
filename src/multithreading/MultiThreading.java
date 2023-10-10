/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading;

/**
 *
 * @author endie
 */
public class MultiThreading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("The main thread has started");
        
        Thread threadOne = new Thread1("ThreadOne") ;
        threadOne.start();
        
        Thread threadTwo = new Thread(new Thread2(), "threadTwo");
        threadTwo.start();
        
        System.out.println("Main thread has stoped execution");
    }
    
}
