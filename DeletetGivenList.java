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
    next= null;
   }
}

class DeleteList{
    Node head;
    
    
    void add(int data){
       Node n = new Node(data);
       n.next = head;
       head = n;
    }
    
    //delete in any position
    void deleteAnyPosition(int val){
      Node prev = head;
     
      int count = 1;
      if(val == 1){
        head = head.next;
      }else{
        while(count< val-1){
             prev = prev.next;
             count++;
        }
        Node current = prev.next;
        prev.next = current.next;
      }        
    }
    
    //Delete any Value in the linkedList
    void deleteAnyValue(int val){
     Node current = head;
     Node prev = null;
     
     if(current != null && current.data == val){
      head = head.next;
      return;
     }
     
     while(current != null){
         if(current.data == val){
           prev.next = current.next;
           return;
         }
         
         prev = current;
         current = current.next;
     }
    
    }
    
    void print(){
     Node current = head;
     while(current != null){
      System.out.println(current.data + " ");
      current = current.next;
     }
    }
    
    
}

public class DeletetGivenList {
       public static void main(String[] args) {
        
        DeleteList list = new DeleteList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        
      
         list.deleteAnyValue(5);
         list.deleteAnyPosition(4);
          list.print();
      }
}
