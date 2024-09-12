/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controle;

/**
 *
 * @author pedrohenrique.clima
 */
public class Semestre {
    private double nota1;
    private double nota2;
    private double media;

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    
    public double media(double n1, double n2){
        return this.media = (n1 +n2) /2;
    }
    
    public String media(String v1, String v2){
        return String.valueOf((Double.parseDouble(v1)+ Double.parseDouble(v2))/2);
    }
}

//Faça um programa duas notas de entrada de vários alunos
// A) qual a maior média da turma e o nome do aluno da maior media
// b) quantos alunos tiveram media entre 6.0 e 8.0
// c) qual foi a media da turma
