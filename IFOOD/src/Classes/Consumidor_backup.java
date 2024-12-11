/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Classes;

import Heranças.Global;

public class Consumidor_backup extends Global{
    
    private String celular;

    public Consumidor_backup() {
        
    }

    public Consumidor_backup(String cadastro, String senha, String celular) {
       super(null,cadastro,senha,0);
        this.celular = celular;
    }
    
    @Override
    public String toString(){
        String aux = String.format("%-20s" + super.getId()) +
                     String.format("%-20s" + super.getCadastro()) + 
                     String.format("%-20s" + super.getSenha()) +
                     String.format("%-20s" + getCelular()); 
        return aux;
    }
    
    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    } 
}
