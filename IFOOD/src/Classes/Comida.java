/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Heranças.Global2;


    public class Comida extends Global2 {
    private String tipoCozinha; //tipo 
    private String saude; //se é veg, vegetariano ou comum
    private String teste;
    private String descricao;
    
    public Comida() {
    }
    
    public Comida(String tipoCozinha, String saude, String nome, String descricao, double preco, int tempoPreparo) {
        super(nome, preco, tempoPreparo);
        this.tipoCozinha = tipoCozinha;
        this.saude = saude;
        this.descricao = descricao;
    }
    
    @Override
    public String toString(){
   String info = String.format("\nNome: " + getNome() + "\nDescrição: " + getDescricao() + "\nPreço: " + super.getPreco()+ "\nTipo: " + getSaude() + "\nTempo de preparo: " + super.getTempoPreparo() + "tipo de restaurante: "+ getTipoCozinha()+ "\n");
    return info;
    }
    
     public String nomee(){
    String info = String.format(getNome());
    return info;
    }

    public String getTipoCozinha() {
        return tipoCozinha;
    }

    public void setTipoCozinha(String tipoCozinha) {
        this.tipoCozinha = tipoCozinha;
    }

    public String getSaude() {
        return saude;
    }

    public void setSaude(String saude) {
        this.saude = saude;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }   

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
