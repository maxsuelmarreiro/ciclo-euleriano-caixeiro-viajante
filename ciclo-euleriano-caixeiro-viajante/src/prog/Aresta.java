package prog;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author kelyane
 */
public class Aresta {

    private int idVertice;
    private String rotulo;
    

    public Aresta(int idVertice, String rotulo) {
        this.idVertice = idVertice;
        this.rotulo = rotulo;
    }

    public int getIdVertice() {
        return idVertice;
    }

    public void setIdVertice(int idVertice) {
        this.idVertice = idVertice;
    }

    public String getRotulo() {
        return rotulo;
    }

    public void setRotulo(String rotulo) {
        this.rotulo = rotulo;
    }
    
    
}