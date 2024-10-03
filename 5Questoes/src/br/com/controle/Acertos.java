/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author pedrohenrique.clima
 */
public class Acertos {
    private double acertos;
    private double soma;

    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    public double getAcertos() {
        return acertos;
    }

    public void setAcertos(double acertos) {
        this.acertos = acertos;
        soma++;
    }
    
    public double somar(){
        return soma;
    }
    
    //public double Acertou(){
       // return acertos++;
    //}
}
