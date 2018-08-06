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
public class aulaAuditorio  extends Aula{
    private int cantidad_Parlantes;
    private int cantidad_Microfonos;

    public int getCantidad_Parlantes() {
        return cantidad_Parlantes;
    }

    public void setCantidad_Parlantes(int cantidad_Parlantes) {
        this.cantidad_Parlantes = cantidad_Parlantes;
    }

    public int getCantidad_Microfonos() {
        return cantidad_Microfonos;
    }

    public void setCantidad_Microfonos(int cantidad_Microfonos) {
        this.cantidad_Microfonos = cantidad_Microfonos;
    }
        
    @Override
    public String toString() {
        return "Aula Auditorio";
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
    public int getNumero_Computadoras() {
       return 0;
    }

    @Override
    public boolean isTela_Proyector() {
return false;
    }

    @Override
    public void setTela_Proyector(boolean tela_Proyector) {
        System.out.println("NO IMPLEMENTA");
    }

    @Override
    public boolean isProyector() {
return false;
    }

    @Override
    public void setProyector(boolean proyector) {
        System.out.println("NO IMPLEMENTA");
    }
}
