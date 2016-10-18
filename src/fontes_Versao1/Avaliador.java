/*
 * C�digo fonte reproduzido do livro 
 * Testes Automatizados: um guia pr�tico
 * Maur�cio Aniche
 * Casa do C�digo
 * http://www.casadocodigo.com.br/products/livro-testes-de-software
 */
package fontes_Versao1;

/**
 *
 * @author curcino
 */

public class Avaliador {
    
    private Double maiorDeTodos = Double.NEGATIVE_INFINITY;

    public void avalia(Leilao leilao) {
        for (Lance lance: leilao.getLances()) {
            if (lance.getValor() > maiorDeTodos) {
                    maiorDeTodos = lance.getValor();
        }
        }
    }

    public Double getMaiorLance() {
        return maiorDeTodos;
    }

}