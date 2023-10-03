/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priorityqueuearraylinkedlist;

import java.util.Scanner;

    

/**
 *
 * @author Student
 */

public class PriorityqueueArrayLinkedlist {

    private int data;
    private priorityqueuarray next;
    private int priority;

    
   
    private class priorityqueuarray {
        
    int priority;
    int data;
    priorityqueuarray  next;
   }
    
     private priorityqueuarray front;
     
    private void insertion (int item, int priority) {
        priorityqueuarray node = new priorityqueuarray ();
        node.data = item;
        node.priority = priority;
        node.next=null;
        
        if (front==null|| priority <= front.priority) {
           node.next= front;
           front = node;
           
        } else {
         priorityqueuarray temp = front;
         while (temp.next!= null && temp.next.priority <= priority) {
            temp = temp.next;
            
         }
         node.next= temp.next;
         temp.next= node;
         
         
        }
        
        
    }
    
    public int delition () throws Exception {
        if (front == null) {
            throw new Exception("Queue is empty");
            
        }
        int temp = front.data;
        front = front.next;
        return temp;
        
        
    }
    
    public void display ()throws Exception {
        if (front == null) {
            throw new Exception("Queue is empty");
            
        }
        priorityqueuarray temp = front;
        System.out.println("priority value");
        
        while (temp!= null) {            
            System.out.println(temp.priority +"temporary.data");
            temp = temp.next;
            
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scn = new Scanner (System.in);
      PriorityqueueArrayLinkedlist list = new PriorityqueueArrayLinkedlist();
      
        while (true) {            
            System.out.println("1. to insert");
            System.out.println("2. to delete");
            System.out.println("3. to display");
            
            if (scn.hasNextInt()) {
                int input = scn.nextInt();
                switch (input){
                    
                    case 1:
                        System.out.println("number to insert");
                        list.insertion (input, input);
                }
            }
        }
       
    }
    
}
