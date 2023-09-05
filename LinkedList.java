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
    this.data =  data;
    next=  null;
    }
}

class List{
   
    Node head;
       int data;
       Node next;


    void add(int data){
    Node node = new Node(data);
    node.next = head;
    head = node;
    }
   
    void print(){
     
        Node n = head;
        
        while(n!= null){
        System.out.println(n.data);
        n = n.next;
         }
    }
    
    boolean searchNodee(int x){
      Node n =head;
      
      while(n.next != null){
        if(n.data == x){
          return true;
        }
        n = n.next;
      }
      return false;
             
    }
    
 
}



public class LinkedList {
      public static void main(String[] args) {
        
          List n =  new List();
          n.add(2);
          n.add(3);
          n.add(5);
         
          n.print();
          
          System.out.println(n.searchNodee(53));
      }
}
