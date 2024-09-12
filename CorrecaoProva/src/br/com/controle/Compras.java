/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author pedrohenrique.clima
 */
public class Compras {
    private double valor;
        double soma;
        int qtd;
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
        soma+=this.valor;
        if(this.valor >= 500 && this.valor <= 700){
            qtd++;
        }
    }
    
     public double getQtd() {
        return qtd;
    }
     public double getSoma() {
        return soma;
     }
}
