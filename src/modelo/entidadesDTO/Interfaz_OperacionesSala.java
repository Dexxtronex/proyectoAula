/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidadesDTO;

import java.util.ArrayList;

/**
 *
 * @author Dexx
 */
public interface Interfaz_OperacionesSala {
        public int guardarAula(Aula au);
        public int editar(Aula au) ;
        public int consultaId(String criterio) ;
        public ArrayList<Aula> consultaAulas(String criterio); 
        public int eliminar(Aula au);


}
