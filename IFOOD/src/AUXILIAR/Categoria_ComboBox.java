/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AUXILIAR;

public class Categoria_ComboBox {
    
    private String Tipo_de_Alimento;
    private int id;

    public Categoria_ComboBox() {
    }
    
    public Categoria_ComboBox(String Tipo_de_Alimento, int id) {
        this.Tipo_de_Alimento = Tipo_de_Alimento;
    }

    public String getTipo_de_Alimento() {
        return Tipo_de_Alimento;
    }

    public void setTipo_de_Alimento(String Tipo_de_Alimento) {
        this.Tipo_de_Alimento = Tipo_de_Alimento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    @Override
    public String toString(){
    return getTipo_de_Alimento();
    }

}
