/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Heranças.Global;

    public class Estabelecimento_backup extends Global{
        
    private String cnpj;
    private String endereco;

    
    public Estabelecimento_backup() {
        
    }
    
    public Estabelecimento_backup(String nome, String endereco, String cnpj){
        super(nome, null, null, 0);
        this.cnpj = cnpj;        
    }
    
//    Usado por:      Cadastro_Estabelecimento   e   Login_Estabelecimento
    public Estabelecimento_backup(String nome, String email, String senha, String cnpj, int nada){
    super(nome, email, senha, 0);
    this.cnpj = cnpj;
    }
    
    public String toString(){
        String aux = String.format("%-20s" + super.getCadastro()) +
                     String.format("%-20s" + super.getSenha()) + 
                     String.format("%-20s" + getCnpj()); 
        return aux;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    } 
}
