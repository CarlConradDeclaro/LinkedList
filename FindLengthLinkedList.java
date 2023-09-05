/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.retailstore;

/**
 *
 * @author carlconrad
 */

class Node{
    int data;
    Node next;
    Node(int data){
    this.data= data;
    next =null;
    }
}

class LengthOfList{
    Node head;
   
    
    void add(int data){
    Node node = new Node(data);
    node.next = head;
    head =node;
    }
    
    
    // find the length in Iteritive way
    void length(){
       Node current= head;
       int count =0;
       while(current != null){
          count++;
          current = current.next;
       }      
       System.out.println(count);
    }
    
    
    
    // find the length of the list in recursive way
    int getCountRec(Node head){
       if(head == null)
           return 0;    
       return 1 + getCountRec(head.next);
    }   
    int getCount(){return getCountRec(head);}
    
}


public class FindLengthLinkedList {
      public static void main(String[] args) {
        
        LengthOfList list = new LengthOfList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
        list.length();
       System.out.println( list.getCount());
      }
}
