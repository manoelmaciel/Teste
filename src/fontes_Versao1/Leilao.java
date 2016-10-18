/*
 * C�digo fonte reproduzido do livro 
 * Testes Automatizados: um guia pr�tico
 * Maur�cio Aniche
 * Caso do C�digo
 * http://www.casadocodigo.com.br/products/livro-testes-de-software
 */
package fontes_Versao1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author curcino
 */
public class Leilao {

    private String objetoLeiloado;
	
    private List<Lance> lances;

    public Leilao(String objetoLeiloado) {
        this.objetoLeiloado = objetoLeiloado;
        this.lances = new ArrayList<Lance>();
    }

    public String getObjetoLeiloado() {
        return objetoLeiloado;
    }

    public void propoe(Lance lance) {
        this.lances.add(lance);
    }

    public List<Lance> getLances() {
        return lances;
    }    
    
}
