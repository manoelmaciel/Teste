/*
 * C�digo fonte reproduzido do livro 
 * Testes Automatizados: um guia pr�tico
 * Maur�cio Aniche
 * Caso do C�digo
 * http://www.casadocodigo.com.br/products/livro-testes-de-software
 */
package fontes_Versao1;

/**
 *
 * @author curcino
 */
public class Lance {
    
    private Usuario usuario;
	
    private Double valor;

    public Lance(Usuario usuario, Double valor) {
        this.usuario = usuario;
        this.valor = valor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Double getValor() {
        return valor;
    }
}
