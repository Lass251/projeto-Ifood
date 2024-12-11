/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Heranças.Global2;


    public class Bebida extends Global2 {
    private String tamanho;
    private String descricao;
    private String alcool;
//    private String tipo;

    public Bebida() {
    }
   
    public Bebida(String tamanho, String alcool, String nome, String descricao, String tipo, double preco, int tempoPreparo) {
        super(nome, preco, tempoPreparo);
        this.tamanho = tamanho;
        this.alcool = alcool;
        this.descricao = descricao;
//        this.tipo = tipo;                     NÃO SERVE PARA NADA!!! NÃO MEXER!!!
     
    }
        
    @Override
    public String toString(){
    String info = String.format("\nNome: " + getNome() + "\nDescrição: " + getDescricao() + "\nPreço: " + super.getPreco()+ "\nAlcoólico: " + getAlcool() + "\nTempo de preparo: " + super.getTempoPreparo() + "\ntamanho: "+ getTamanho()+ "\n");
    return info;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }    

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getAlcool() {
        return alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }    
}
