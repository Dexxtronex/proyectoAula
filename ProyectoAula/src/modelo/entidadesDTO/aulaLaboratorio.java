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
public class aulaLaboratorio extends Aula{
    private int numero_Computadoras;
    private String nombrePasante;

    public aulaLaboratorio() {
        
    }

      @Override
    public String toString() {
        return "Laboratorio";
    }
    

    @Override
    public int getNumero_Computadoras() {
        return numero_Computadoras;
    }
    @Override
    public String getNombrePasante() {
        return nombrePasante;
    }
    public void setNumero_Computadoras(int numero_Computadoras) {
        this.numero_Computadoras = numero_Computadoras;
    }

  

    public void setNombrePasante(String nombrePasante) {
        this.nombrePasante = nombrePasante;
    }

  
   
    
   
  
    
    
}
