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
    private boolean tela_Proyector;
    private boolean proyector;

    public boolean isTela_Proyector() {
        return tela_Proyector;
    }

    public void setTela_Proyector(boolean tela_Proyector) {
        this.tela_Proyector = tela_Proyector;
    }

    public boolean isProyector() {
        return proyector;
    }

    public void setProyector(boolean proyector) {
        this.proyector = proyector;
    }
    
    
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
