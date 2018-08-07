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
public interface Interfaz_OperacionesPaqueteDias {
    public int guardarAula(paquetedias paque);

    public paquetedias consultaId(String criterio);

    public paquetedias consultaCodigo(String criterio);

    public int editar(paquetedias paque);

    public int eliminar(String criterio);

    public ArrayList<paquetedias> Cargar();

}
