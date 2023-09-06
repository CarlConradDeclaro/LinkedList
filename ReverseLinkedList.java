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
      this.data = data;
      next = null;
    }
}

class ReverseList{
   Node head;
   
   
   void add(int data){
    Node n = new Node(data);
    n.next = head;
    head= n;
   }
   
   Node reverse(){
    Node prev =null;
    Node current  =head;
    Node next = null;
       
       while(current != null){
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
        
       }
       
       head = prev;
      return head;
   }
   
   void print() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
        System.out.println();
    }

}


public class ReverseLinkedList {
     public static void main(String[] args) {
        
        ReverseList list = new ReverseList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
      
        list.reverse();
        list.print();
      }
}
