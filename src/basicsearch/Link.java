/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicsearch;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sengkhunlim
 */
public class Link {

    List<Link> child;
    int value;

    public Link(int n) {
        
        value = n;
        child = new ArrayList<Link>();

    }
    
    public void addChild( int n ) {
        
        // initial the child with value
        Link newChild = new Link( n );
        
        // Add newLink to the child
        this.child.add( newChild );
            
    }

}
