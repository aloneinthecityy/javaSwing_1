/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maria1;

/**
 *
 * @author AMD
 */
public class Contas {

     private String titulo;
    private double valor;
    private boolean paga;

    public Contas(String titulo, double valor, boolean paga) {
        this.titulo = titulo;
        this.valor = valor;
        this.paga = paga;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isPaga() {
        return paga;
    }

    public void setPaga(boolean paga) {
        this.paga = paga;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
}
