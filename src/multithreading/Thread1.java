/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading;

/**
 *
 * @author endie
 */
public class Thread1 extends Thread{
    
    public Thread1(String threadName){
        super(threadName) ;
    }
    
    @Override
    public void run(){
        for(int i = 1; i <=5; i++){
            System.out.println("This ops is from " + Thread.currentThread().getName() + " and count value is: " + i);
        }
    }
}
