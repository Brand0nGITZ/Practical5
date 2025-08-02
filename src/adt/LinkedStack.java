/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

import samplecode.Node;

/**
 *
 * @author studentc
 */
public class LinkedStack<T> implements StackInterface {
     
    private Node topNode;

    @Override
    public void push(Object newEntry) {
        
        Node newNode = new Node((T) newEntry);
        newNode.next = topNode;
        //node newNode = newNode(newEntry, topNode);
        topNode = newNode;
        
        
        
    }

    @Override
    public Object pop() {
        
        if (topNode != null) {
            
            T topData = topNode.data;
            topNode = topNode.next;
            
            return topData;
        }
        return null;    
            }

    @Override
    public Object peek() {
       if (topNode != null) {
           return topNode.data;
           
       }
       return null;
    }

    @Override
    public boolean isEmpty() {
       return topNode == null;
    }

    @Override
    public void clear() {
        topNode = null;
        }
    
    
    private class Node {
        
        private T data;
        private Node next;
        
        private Node (T data) {
            this.data = data;
            this.next = next;
            
        }
        
     private Node (T data, Node next) {
        this.data = data;
        this.next = next;
    }
    }
    
   
}
