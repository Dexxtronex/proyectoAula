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
import modelo.entidadesDTO.Reservacion;

/**
 *
 * @author Dexx
 */
public class reservacionDAO {
    private MiConexion micon;
    private Connection con;
    private PreparedStatement sentenciaPreparada;
    private Statement sentencia;
    private ResultSet resultset;
    
     public int guardarReservacion(Reservacion reser) {
        int res = 0;
        micon = new MiConexion();
        //obtener conexion
        con = micon.getConection();
        String sql = null;
        int existenciaTipoAula = 0;
        if (con == null) {
            return 0;
        }
       
            sql = "insert into reservacion "
                + "(id_aula,codigo,encargado,hora_inicio,hora_fin,"
                + "dia_letra,dia, mes,anio) "
                + "values (?,?,?,?,?,?,?,?,?)";
        
        try {
            //crear una sentencia preparada
            sentenciaPreparada = con.prepareStatement(sql);
            //prepararla para su ejecucion
            sentenciaPreparada.setInt(1,reser.getId_aula());
            sentenciaPreparada.setString(2, reser.getCodigo());
            sentenciaPreparada.setString(3, reser.getEncargado());
            sentenciaPreparada.setInt(4, reser.getHora_inicio());
            sentenciaPreparada.setInt(5, reser.getHora_fin());
            sentenciaPreparada.setString(6, reser.getDia_letra());
            sentenciaPreparada.setInt(7, reser.getDia());
            sentenciaPreparada.setInt(8, reser.getMes());
            sentenciaPreparada.setInt(9, reser.getAño());

            
            //ejecutar la sentencia
            res = sentenciaPreparada.executeUpdate();
            
            //executeUpdate ejecuta sentencias de insert, update y delete
            //y retorna un int con el numero de filas afectadas
        } catch (SQLException sqle) {
            System.out.println("error en guardar reservacion");
            System.out.println(sqle.getMessage());
        } finally {

            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Guardar Reservacion: error en cerrar conexion");
                System.out.println(sqle.getMessage());
            }

        }
        return res;
    }
     public int editar(Reservacion au) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        String sql = null;
        int existenciaTipoAula = 0;
        try {
           
            
            sql = "UPDATE reservacion  SET id_aula = ?,"
                    + "codigo = ?,encargado = ?,"
                    + "hora_inicio = ?, hora_fin = ?,"
                    + "dia_letra = ?, dia = ?, "
                    + "mes = ?,anio = ?"+ " WHERE id_reservacion = '"+ au.getId_reservacion()+"'"; 
        

        
         
          
            sentenciaPreparada = con.prepareStatement(sql);
            sentenciaPreparada.setInt(1, au.getId_aula());
            sentenciaPreparada.setString(2, au.getCodigo());
            sentenciaPreparada.setString(3, au.getEncargado());
            sentenciaPreparada.setInt(4, au.getHora_inicio());
            sentenciaPreparada.setInt(5, au.getHora_fin());
            sentenciaPreparada.setString(6, au.getDia_letra());
            sentenciaPreparada.setInt(7, au.getDia());
            sentenciaPreparada.setInt(8, au.getMes());
            sentenciaPreparada.setInt(9, au.getAño());
          

            //ejecutar la sentencia
            //retorn el numero de filas afectadas
            r = sentenciaPreparada.executeUpdate();


        } catch (SQLException ex) {
            System.out.println("Error editar Reservacion");
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
     public int eliminar(Reservacion au) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "DELETE FROM reservacion WHERE id_reservacion = '" + au.getId_reservacion()+ "'";

            sentenciaPreparada = con.prepareStatement(sql);

            r = sentenciaPreparada.executeUpdate();

           
        } catch (SQLException ex) {
            System.out.println("Error eliminar Reservacion");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                            System.out.println("Error conexion eliminar Reservacion");

                System.out.println(ex.getMessage());
            }
        }
        return r;
    }
     
     public int validacionReservacionPermitida(Reservacion reser){
         int respuesta = 1;
            ArrayList<Reservacion> lista = consultaAulasPorTipo(Integer.toString(reser.getId_aula()));
            if(lista == null){
                return 1;
            }else{
                
                for(int i = 0; i <lista.size(); i++){
                        System.out.println(lista.get(i).getDia()+"-"+lista.get(i).getMes()+"-"+lista.get(i).getAño());
                        System.out.println(reser.getDia()+"-"+reser.getMes()+"-"+reser.getAño());
                        if(reser.getDia() == lista.get(i).getDia() &&  reser.getMes()== lista.get(i).getMes() && reser.getAño()== lista.get(i).getAño()){
                            System.out.println("validacion de igualdad entrando ");
                        
                         if(reser.getHora_inicio()<= lista.get(i).getHora_inicio() &&  reser.getHora_fin() <=lista.get(i).getHora_fin()){
                            
                             return 0;
                        }
                        if(reser.getHora_inicio()>= lista.get(i).getHora_inicio() &&  reser.getHora_fin() <=lista.get(i).getHora_fin()){
                            return 0;
                        }
                        if(reser.getHora_inicio()== lista.get(i).getHora_inicio() &&  reser.getHora_fin() ==lista.get(i).getHora_fin()){
                            return 0;
                        }
                     
                            
                        }
                        
                        
            
                 }
            }
            
         
         return respuesta;
     }
     
     public ArrayList<Reservacion> consultaAulasPorTipo(String criterio) {
        ArrayList<Reservacion> lista = null;
        //taer todos los campos de la tabla producto a la cual se llama p, y tambien de la tabla categoria llamado c 
        //cuando p.estado sea igual a 1 y p.idecategoria sea igual a c.id
// consultar
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion
        int existenciaTipoAula = 0;
        //String query2 = "select * from producto where estado=1 and talla='s'";
        String query =null;

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                query = "select * from reservacion as p";

                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda
                query = "select * from reservacion as p "
                + " where p.id_aula= ?";

                 //query = query + " and p.codigo=?"; // debe escribir igualito
//                          
                sentenciaPreparada = con.prepareStatement(query);
           sentenciaPreparada.setString(1, criterio);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset != null) {
                lista = new ArrayList();

            } else {
                return null;
            }
            Reservacion p = null;
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
                    
                          p = new Reservacion();
                 
               
                    p.setId_reservacion(resultset.getInt("p.id_reservacion"));
                    p.setId_aula(resultset.getInt("p.id_aula"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setEncargado(resultset.getString("p.encargado"));
                    p.setHora_fin(resultset.getInt("p.hora_fin"));
                    p.setHora_inicio(resultset.getInt("p.hora_inicio"));
                    p.setDia_letra(resultset.getString("p.dia_letra"));
                    p.setDia(resultset.getInt("p.dia"));
                    p.setMes(resultset.getInt("p.mes"));
                    p.setAño(resultset.getInt("p.anio"));
                
                lista.add(p);

            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar Reservacion");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar consultar Reservar Conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return lista;
    }
     public int existenciaReservacionPorCodigo(String criterio) {
        int respuesta = 0;
        
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion
         //String query2 = "select * from producto where estado=1 and talla='s'";
       String query = "select * from reservacion as p where"
                + " p.id_aula='" + criterio + "' ";

        // preparar la sentencia
        try {

                sentenciaPreparada = con.prepareStatement(query);
             
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset == null) {
                                return 0;
            }
            
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
              
                if(criterio.equals(resultset.getString("p.id_aula"))==true){
                    respuesta++;
                }
               
            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar existencia RESERVACION ");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar RESERVACION: cerrar conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return respuesta ;
    }
     
    public int eliminarPorId(int id) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "DELETE FROM reservacion WHERE id_reservacion = '" + id+ "'";

            sentenciaPreparada = con.prepareStatement(sql);

            r = sentenciaPreparada.executeUpdate();

           
        } catch (SQLException ex) {
            System.out.println("Error eliminar Reservacion");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                            System.out.println("Error conexion eliminar Reservacion");

                System.out.println(ex.getMessage());
            }
        }
        return r;
    }
    public ArrayList<Reservacion> consultaReservacionPorTipo(String criterio,String tipo) {
        ArrayList<Reservacion> lista = null;
        //taer todos los campos de la tabla producto a la cual se llama p, y tambien de la tabla categoria llamado c 
        //cuando p.estado sea igual a 1 y p.idecategoria sea igual a c.id
// consultar
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion
        int existenciaTipoAula = 0;
        //String query2 = "select * from producto where estado=1 and talla='s'";
        String query =null;

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                query = "select * from reservacion as c";

                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda
                query = "select * from aula as p, reservacion as c where"
                + "  p.id =c.id_aula ";

                 //query = query + " and p.codigo=?"; // debe escribir igualito
//          
                   if(tipo.equals("ID")){
                      query = query + " and c.id_reservacion like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 

                   }else  if(tipo.equals("ENCARGADO")){
                      query = query + " and c.encargado like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 

                   }else  if(tipo.equals("CODIGO")){
                      query = query + " and c.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 

                   }
                
                sentenciaPreparada = con.prepareStatement(query);
           sentenciaPreparada.setString(1, criterio);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset != null) {
                lista = new ArrayList();

            } else {
                return null;
            }
            Reservacion obj = null;
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
                    
                obj = new Reservacion();
                obj.setId_reservacion(resultset.getInt("c.id_reservacion"));
                obj.setId_aula(resultset.getInt("c.id_aula"));
                obj.setCodigo(resultset.getString("c.codigo"));
                obj.setEncargado(resultset.getString("c.encargado"));
                obj.setDia_letra(resultset.getString("c.dia_letra"));
                obj.setDia(resultset.getInt("c.dia"));
                obj.setMes(resultset.getInt("c.mes"));
                obj.setAño(resultset.getInt("c.anio"));
                obj.setHora_inicio(resultset.getInt("c.hora_inicio"));
                obj.setHora_fin(resultset.getInt("c.hora_fin"));
                
                
                lista.add(obj);

            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar reservacion");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar consultar reservacion");
                System.out.println(sqle.getMessage());
            }
        }

        return lista;
    }

}
