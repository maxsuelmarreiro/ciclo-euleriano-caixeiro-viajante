/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prog;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 *
 * @author Kelyane
 */
public class Hierholzer {
    
    public Hierholzer(){
        
    }
    
    public List<Integer> ExecutaHierholzer(int vertice, Grafo grafo){
        Stack pilha = new Stack();
        List<Integer> c = new LinkedList<>();
        
        
        pilha.add(vertice);
        
        while (!pilha.empty()){
            Integer u = (Integer) pilha.pop();
            c.add(u);
            while (!grafo.obtemAdj(u).isEmpty()){    
                pilha.push(u);
                /**/
                pilha.remove(u.getAresta(v));
                
                u = v;
            }
        }
        
        
        return c;
    }
    
}
