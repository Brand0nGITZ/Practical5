/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adt;

import java.util.Iterator;

/**
 *
 * @author studentc
 */
public class CircularLinkedqueeue<T> implements QueueInterface<T> {

    private Node lastNode;
        
    @Override
    public Iterator<T> getIterator() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry);
        
        if (isEmpty()) {
            newNode.next = newNode;
            
        } else {
            newNode.next = lastNode.next;
            lastNode = newNode;
        }
    }

    @Override
    public T dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T getFront() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
