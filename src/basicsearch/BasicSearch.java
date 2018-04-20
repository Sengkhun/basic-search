/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsearch;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author sengkhunlim
 */
public class BasicSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        // Initial Value
        int[] i = { 10, 2, 3, 7, 6, 5, 1, 20, 12, 15 };
       
        MyLinkList l = new MyLinkList( i[0] );
        
        l.root.addChild( i[1] );
        l.root.addChild( i[2] );
        l.root.addChild( i[3] );
        
        List<Link> rootChild = l.root.child;
        
        // First Child
        rootChild.get(0).addChild( i[4] );
        rootChild.get(0).addChild( i[5] );
        
        // Second Child
        rootChild.get(1).addChild( i[6] );
        rootChild.get(1).addChild( i[7] );
        rootChild.get(1).addChild( i[8] );
                
        // Last Child
        rootChild.get(2).addChild( i[9] );   
        
        System.out.print("Initial Value: ");
        print(i);
        System.out.println();
        
        System.out.print("Enter your goal: ");
        Scanner input = new Scanner(System.in);
        int goal = input.nextInt();
        
        boolean result = basicSearch(l, goal);
        
        if (result) {
            System.out.println("Found");    
        } else {
            System.out.println("Not Found");    
        }
    
    }
    
    public static boolean basicSearch(MyLinkList l, int n) {
        
        Stack<Link> s = new Stack();
        Link current;
        
        //1. set s = root
        s.push(l.root);
        
        while ( true ) {
        
            //2. if s is empty Terminates it
            if (s.empty()) {
                return false;
            }

            //3. Select a state from s
            current = s.pop();

            //4. If currentState is goal, terminate with success
            if ( current.value == n ) {
                return true;
            }

            //5. Generate successor of n and insert to open
            for (int i = 0; i < current.child.size(); i++) {
                 
                s.push( current.child.get(i) );
                
            }
        
        }
        
    }
    
    public static void print(int[] i) {
     
        for (int j = 0; j < i.length; j++) {
            
            System.out.print(i[j] + " ");
            
        }
        
    }
    
}
