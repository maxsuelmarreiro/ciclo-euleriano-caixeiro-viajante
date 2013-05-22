/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prog;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author kelyane
 */
public class LerArquivoGrafo {
    
    public static Grafo criarGrafo(String nomeArquivo) throws FileNotFoundException, IOException{
        Grafo grafo;
        try (FileReader file = new FileReader(nomeArquivo); BufferedReader buffer = new BufferedReader(file)) {
            grafo = new Grafo();
            while (buffer.ready()){
                String linha = buffer.readLine();            
                if(linha.equals("#")){break;}
                int indexVetorVertice = grafo.addVertice(linha);            
            }
            while (buffer.ready()){
                String linha = buffer.readLine();                    
                String[] parts = linha.split(" ");
                String verticeInicio = parts[0];
                String verticeFim = parts[1];
                String rotulo = "";
                if (parts.length > 2){
                    rotulo = parts[2];
                }            
                grafo.addAresta(verticeInicio,verticeFim,rotulo);
                
            }
        }
        return grafo;
    }
    
}