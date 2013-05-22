package prog;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kelyane
 */
public class ListAdj {
           
    private List<Aresta> listaAdj = new LinkedList<>();
    
    public void addAdj(int verticeFim, String rotulo){
        listaAdj.add(new Aresta(verticeFim, rotulo));
    }

    List<Integer> obtemAdj() {
        List<Integer> adjLista = new ArrayList<>();
        for(Aresta aresta: listaAdj){
            adjLista.add(aresta.getIdVertice());
        }
        return adjLista;
    }
    
    public int getSize() {
        return listaAdj.size();
    }
    
    public Aresta getAresta(int i) {
        return listaAdj.get(i);
    }

    public String obtemRotulo(int verticeFim) {
        for(Aresta aresta: listaAdj){
            if(aresta.getIdVertice() == verticeFim){
                return aresta.getRotulo();
            }
        }
        //não deve chegar aqui
        return "";
    }
    
}