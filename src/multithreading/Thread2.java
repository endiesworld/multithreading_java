/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author endie
 */
public class Thread2 implements Runnable {
    
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("This in an ops from "+ Thread.currentThread().getName() + " current count is: "+ i) ;
        }
    }
            
    
}
