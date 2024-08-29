
package br.com.controle;

public class Calculos {
    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    public double calcularDobro(){
        return this.valor*2;
    }
}
