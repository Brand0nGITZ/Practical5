/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package client;

import adt.LinkedStack;
import adt.StackInterface;

/**
 *
 * @author studentc
 */
public class TestLinkedStack {
    public static void main(String [] args) {
        
        StackInterface <Integer> stack1 = new LinkedStack<>();
        
        stack1.push(1);
        stack1.push(2);
        stack1.push(3);
        
        System.out.println("Pop 1 : " + stack1.pop());
        System.out.println("Pop 1 : " + stack1.peek());
        System.out.println("Pop 1 : " + stack1.pop());
        System.out.println("Pop 1 : " + stack1.pop());
    }
}
