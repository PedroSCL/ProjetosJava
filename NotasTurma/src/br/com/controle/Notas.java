package br.com.controle;

//Faça um programa que pegue duas notas de entrada de vários alunos
// A) qual a maior média da turma e o nome do aluno da maior media
// b) quantos alunos tiveram media entre 6.0 e 8.0
// c) qual foi a media da turma
public class Notas {
    private double nota1;
    private double nota2;
    private double mediaTurma;
    private double maiorNota = 0;
    private int entre6e8 = 0;
    private double media;
    private String nome;
    private String nomeMaiorNota;
    
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

    public String getNomeMaiorNota() {
        return nomeMaiorNota;
    }

    public void setNomeMaiorNota(String nomeMaiorNota) {
        this.nomeMaiorNota = nomeMaiorNota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEntre6e8() {
        return entre6e8;
    }

    public void setEntre6e8(int entre6e8) {
        this.entre6e8 = entre6e8;
    }
    public double media(double n1, double n2){
        this.media = (n1 +n2) /2;
        if(this.media >= 6 && this.media <= 8){
            entre6e8++;
        }
        return this.media;
    }
    
    public double calculoMaiorNota(){
        if (this.media > this.maiorNota){
            this.nomeMaiorNota = this.nome;
            return this.maiorNota = this.media;
        } 
        return this.maiorNota;
    }
    
}
