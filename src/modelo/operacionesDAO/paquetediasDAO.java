/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacionesDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.conexion.MiConexion;
import modelo.entidadesDTO.Interfaz_OperacionesPaqueteDias;
import modelo.entidadesDTO.paquetedias;

/**
 *
 * @author Dexx
 */
public class paquetediasDAO implements Interfaz_OperacionesPaqueteDias{
     private MiConexion micon;
    private Connection con;
    private PreparedStatement sentenciaPreparada;
    private Statement sentencia;
    private ResultSet resultset;
    
     @Override
    public int guardarAula(paquetedias paque) {
        int res = 0;
        micon = new MiConexion(); // inicializo
        //obtener conexion
        con = micon.getConection(); // mi clase de obtencion
        if (con == null) {
            return 0;
        } else {
            // insertar
            String sql = "insert into paquetedias "
                    + "(codigo,lunes,martes,miercoles, jueves,"
                    + "viernes,sabado,domingo,hora_inicio,hora_fin) "
                    + "values (?,?,?,?,?,?,?,?,?,?)";
            try {
                //crear una sentencia preparada
                sentenciaPreparada = con.prepareStatement(sql);
                //prepararla para su ejecucion 
                sentenciaPreparada.setString(1, paque.getCodigo());
                sentenciaPreparada.setBoolean(2, paque.isLunes());
                sentenciaPreparada.setBoolean(3, paque.isMartes());
                sentenciaPreparada.setBoolean(4, paque.isMiercoles());
                sentenciaPreparada.setBoolean(5, paque.isJueves());
                sentenciaPreparada.setBoolean(6, paque.isViernes());
                sentenciaPreparada.setBoolean(7, paque.isSabado());
                sentenciaPreparada.setBoolean(8, paque.isDomingo());
                sentenciaPreparada.setInt(9, paque.getHora_inicio());
                sentenciaPreparada.setInt(10, paque.getHora_fin());
                
                //ejecutar la sentencia
                res = sentenciaPreparada.executeUpdate();
                if(res >=1)
                System.out.println(" proceso de guardar paquete ");
                // executeUpdate ejecuta sentencias de insert, update y delete
                // y retorna un int con el numero de filas afectadas
            } catch (SQLException sqle) {
                System.out.println("error en guardar paquete dias disponible");
                System.out.println(sqle.getMessage());
            } finally {
                try {
                    con.close();
                } catch (SQLException sqle) {
                    System.out.println("Guardar paquete de dias disponible: error en cerrar conexion");
                    System.out.println(sqle.getMessage());
                }
            }

        }

        return res;
    }

     @Override
    public paquetedias consultaId(String criterio) {
        paquetedias lista = null;
        //taer todos los campos de la tabla producto a la cual se llama p, y tambien de la tabla categoria llamado c 
        //cuando p.estado sea igual a 1 y p.idecategoria sea igual a c.id
// consultar
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion
        System.out.println("informacion del criterio"+criterio);
        String query2 = "select * from paquetedias where id='" + criterio + "'";
        // String query = "select * from producto as p,categoria as c where"
        //       + " p.estado=1 and p.idcategoria=c.id ";

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                sentenciaPreparada = con.prepareStatement(query2);
            } else { // si hay criterio de busqueda

                //  query = query + " and p.nombre=?"; // debe escribir igualito
//
sentenciaPreparada = con.prepareStatement(query2);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset != null) {
                System.out.println("crea lista paquetedias");
                lista = new paquetedias();

            } else {
                return null;
            }
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
                    System.out.println("Asignando valores");
                lista.setId(resultset.getInt(1));
                lista.setCodigo(resultset.getString(2));
                lista.setLunes(resultset.getBoolean(3));
                lista.setMartes(resultset.getBoolean(4));
                lista.setMiercoles(resultset.getBoolean(5));
                lista.setJueves(resultset.getBoolean(6));
                lista.setViernes(resultset.getBoolean(7));
                lista.setSabado(resultset.getBoolean(8));
                lista.setDomingo(resultset.getBoolean(9));
                lista.setHora_inicio(resultset.getInt(10));
                lista.setHora_fin(resultset.getInt(11));
                System.out.println("si llega a asignar valores");
                System.out.println(""+lista.toString());
                        return lista;
                
                

            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar paquete dias");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en consultar paquete dias: cerrar conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return lista;
    }
     @Override
     public paquetedias consultaCodigo(String criterio) {
        paquetedias lista = null;
        //taer todos los campos de la tabla producto a la cual se llama p, y tambien de la tabla categoria llamado c 
        //cuando p.estado sea igual a 1 y p.idecategoria sea igual a c.id
// consultar
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion
        System.out.println("informacion del criterio"+criterio);
        String query2 = "select * from paquetedias where codigo='" + criterio + "'";
        // String query = "select * from producto as p,categoria as c where"
        //       + " p.estado=1 and p.idcategoria=c.id ";

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                sentenciaPreparada = con.prepareStatement(query2);
            } else { // si hay criterio de busqueda

                //  query = query + " and p.nombre=?"; // debe escribir igualito
//
sentenciaPreparada = con.prepareStatement(query2);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset != null) {
                System.out.println("crea lista paquetedias");
                lista = new paquetedias();

            } else {
                return null;
            }
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
                    System.out.println("Asignando valores");
                lista.setId(resultset.getInt(1));
                lista.setCodigo(resultset.getString(2));
                lista.setLunes(resultset.getBoolean(3));
                lista.setMartes(resultset.getBoolean(4));
                lista.setMiercoles(resultset.getBoolean(5));
                lista.setJueves(resultset.getBoolean(6));
                lista.setViernes(resultset.getBoolean(7));
                lista.setSabado(resultset.getBoolean(8));
                lista.setDomingo(resultset.getBoolean(9));
                lista.setHora_inicio(resultset.getInt(10));
                lista.setHora_fin(resultset.getInt(11));
                System.out.println("si llega a asignar valores");
                System.out.println(""+lista.toString());
                        return lista;
                
                

            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar paquete dias");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en consultar paquete dias: cerrar conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return lista;
    }
     @Override
    public int editar(paquetedias paque) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "update  paquetedias set codigo=?,"
                    + " lunes=?,martes=?,"
                    + "miercoles=?, jueves=?,"
                    + "viernes=?, sabado=?, "
                    + "domingo=?,hora_inicio=?,hora_fin=?"
                    + "where id='" + paque.getId()+ "'";
            
            sentenciaPreparada = con.prepareStatement(sql);

            sentenciaPreparada.setString(1, paque.getCodigo());
            sentenciaPreparada.setBoolean(2, paque.isLunes());
            sentenciaPreparada.setBoolean(3, paque.isMartes());
            sentenciaPreparada.setBoolean(4, paque.isMiercoles());
            sentenciaPreparada.setBoolean(5, paque.isJueves());
            sentenciaPreparada.setBoolean(6, paque.isViernes());
            sentenciaPreparada.setBoolean(7, paque.isSabado());
            sentenciaPreparada.setBoolean(8, paque.isDomingo());
            sentenciaPreparada.setInt(9, paque.getHora_inicio());
            sentenciaPreparada.setInt(10, paque.getHora_fin());

            //ejecutar la sentencia
            //retorn el numero de filas afectadas
            r = sentenciaPreparada.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error editar Paquete de Dias");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return r;
    }

     @Override
    public int eliminar(String criterio) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "DELETE FROM paquetedias WHERE codigo = '" + criterio + "'";

            sentenciaPreparada = con.prepareStatement(sql);

            r = sentenciaPreparada.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error eliminar Paquete de Dias");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return r;
    }

     @Override
    public ArrayList<paquetedias> Cargar()
    {
        micon = new MiConexion(); // inicializo
        //obtener conexion
        con = micon.getConection(); // mi
        ArrayList<paquetedias>  listaPaquetes ;
      
     
        listaPaquetes = new ArrayList();
        try
        {
            sentenciaPreparada = con.prepareStatement("select * from paquetedias");
            ResultSet rs = sentenciaPreparada.executeQuery();
            paquetedias paque ;
           
                while(rs.next())
                {
                    
                 paque = new paquetedias();
                 paque.setId(rs.getInt(1));
                 paque.setCodigo(rs.getString(2));
                 paque.setLunes(rs.getBoolean(3));
                 paque.setMartes(rs.getBoolean(4));
                 paque.setMiercoles(rs.getBoolean(5));
                 paque.setJueves(rs.getBoolean(6));
                 paque.setViernes(rs.getBoolean(7));
                 paque.setSabado(rs.getBoolean(8));
                 paque.setDomingo(rs.getBoolean(9));
                 paque.setHora_inicio(rs.getInt(10));
                 paque.setHora_fin(rs.getInt(11));

                 listaPaquetes.add(paque);
                }

        }
         catch (SQLException ex) {
            System.out.println("Error consultar tabla paquetedias");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                System.out.println("error al cerrarlo");
                System.out.println(ex.getMessage());
            }
        }
        return listaPaquetes;
    }
    
}

