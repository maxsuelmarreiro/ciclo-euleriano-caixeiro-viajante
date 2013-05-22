package prog;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kelyane
 */
public class Grafo {
    private ArrayList<ListAdj> vetorVertices = new ArrayList<>();
    private ArrayList<String> vetorRotulos = new ArrayList<>();
    
    public int addVertice(String rotulo){
        vetorVertices.add(new ListAdj());
        vetorRotulos.add(rotulo);
        return vetorVertices.size() - 1;
    }
    
    public void addAresta(int verticeInicio, int verticeFim, String rotulo){
        vetorVertices.get(verticeInicio).addAdj(verticeFim,rotulo);
    }
    
    public void addAresta(String rotuloInicio, String rotuloFim, String rotulo){
        int indiceInicio = getIndexDeRotulo(rotuloInicio);
        int indiceFim = getIndexDeRotulo(rotuloFim);
        addAresta(indiceInicio,indiceFim,rotulo);
    }
    
    public List<Integer> obtemAdj(int vertice){
        return vetorVertices.get(vertice).obtemAdj();        
    }
    
    public int countVertices(){
        return vetorVertices.size();        
    }
    
    public String getRotuloVertice(int idVertice){
        return vetorRotulos.get(idVertice);
    }

    private int getIndexDeRotulo(String rotuloFim) {
        int index = 0;
        for (String s: vetorRotulos) {
            
            if (s.compareTo(rotuloFim) == 0) {
                return index;
            }
            
            index++;
        }
        
        // nunca chega aqui
        return index;
    }
    
    public Grafo obtemTransposto() {
        Grafo transposto = new Grafo();
        
        for (int i = 0; i < countVertices(); i++) {
            transposto.addVertice(getRotuloVertice(i));
        }
        
        int i = 0;
        for (ListAdj adj: vetorVertices) {
            for (int vertice: adj.obtemAdj()) {
                transposto.addAresta(vertice, i, null);
            }
            i++;
        }
        return transposto;
    }
        
    public ListAdj getListaAdjacencias(int i) {
        return vetorVertices.get(i);
    }
    
    public String obtemRotuloAresta(int verticeInicio, int verticeFim){
        ListAdj listaAdj = vetorVertices.get(verticeInicio);
        return listaAdj.obtemRotulo(verticeFim);      
    }
}
