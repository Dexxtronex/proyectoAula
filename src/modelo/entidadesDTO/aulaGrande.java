/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidadesDTO;

/**
 *
 * @author Dexx
 */
public class aulaGrande extends Aula{

    @Override
    public int getNumero_Computadoras() {
        return 0;
    }

    @Override
    public String toString() {
        return "Aula Grande";
    }

    @Override
    public String getNombrePasante() {
        return "";
    }

    @Override
    public void setNumero_Computadoras(int a) {
        System.out.println("NO IMPLEMENTA");
    }

    @Override
    public void setNombrePasante(String s) {
        System.out.println("NO IMPLEMENTA");
    }

    @Override
    public int getCantidad_Parlantes() {
return 0;    }

    @Override
    public void setCantidad_Parlantes(int cantidad_Parlantes) {
        System.out.println("NO IMPLEMENTA");
    }

    @Override
    public int getCantidad_Microfonos() {
return 0;    
    }

    @Override
    public void setCantidad_Microfonos(int cantidad_Microfonos) {
        System.out.println("NO IMPLEMENTA");
    }
    
}
