/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.operacionesDAO;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.conexion.MiConexion;
import modelo.entidadesDTO.Aula;
import modelo.entidadesDTO.Interfaz_OperacionesSala;
import modelo.entidadesDTO.aulaAuditorio;
import modelo.entidadesDTO.aulaGrande;
import modelo.entidadesDTO.aulaLaboratorio;
import modelo.entidadesDTO.aulaPequeña;
import modelo.entidadesDTO.paquetedias;

/**
 *
 * @author Dexx
 */
public class aulaDAO implements Interfaz_OperacionesSala{
     private MiConexion micon;
    private Connection con;
    private PreparedStatement sentenciaPreparada;
    private Statement sentencia;
    private ResultSet resultset;
    
     @Override
    public int guardarAula(Aula au) {
        int res = 0;
        micon = new MiConexion();
        //obtener conexion
        con = micon.getConection();
        String sql = null;
        int existenciaTipoAula = 0;
        if (con == null) {
            return 0;
        }
        if(au instanceof aulaLaboratorio){
            sql = "insert into aula "
                + "(codigo,Capacidad_alumnos,Cantidad_Pizarras,numeros_pupitres, tipo_ventilacion,"
                + "cantidad_ventilacion,ruta_imagen, foto,idDias,cantidad_Reservacion,tipo_Aula,numero_Computadoras,nombre_Pasante) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            existenciaTipoAula=1;
        }
        else if(au instanceof aulaGrande){
            sql = "insert into aula "
                + "(codigo,Capacidad_alumnos,Cantidad_Pizarras,numeros_pupitres, tipo_ventilacion,"
                + "cantidad_ventilacion,ruta_imagen, foto,idDias,cantidad_Reservacion,tipo_Aula,tela_Proyector,proyector) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            existenciaTipoAula=2;
        }
        else if(au instanceof aulaPequeña){
            sql = "insert into aula "
                + "(codigo,Capacidad_alumnos,Cantidad_Pizarras,numeros_pupitres, tipo_ventilacion,"
                + "cantidad_ventilacion,ruta_imagen, foto,idDias,cantidad_Reservacion,tipo_Aula) "
                + "values (?,?,?,?,?,?,?,?,?,?,?)";
            existenciaTipoAula=3;
        }
        else if(au instanceof aulaAuditorio){
            sql = "insert into aula "
                + "(codigo,Capacidad_alumnos,Cantidad_Pizarras,numeros_pupitres, tipo_ventilacion,"
                + "cantidad_ventilacion,ruta_imagen, foto,idDias,cantidad_Reservacion,tipo_Aula,cantidad_Parlantes,cantidad_Microfonos) "
                + "values (?,?,?,?,?,?,?,?,?,?,?,?,?)";
            existenciaTipoAula=4;
        }
         
        try {
            //crear una sentencia preparada
            sentenciaPreparada = con.prepareStatement(sql);
            //prepararla para su ejecucion
            sentenciaPreparada.setString(1, au.getCodigo());
            sentenciaPreparada.setInt(2, au.getCapacidad_alumnos());
            sentenciaPreparada.setInt(3, au.getCantidad_Pizarras());
            sentenciaPreparada.setInt(4, au.getNumeros_pupitres());
            sentenciaPreparada.setString(5, au.getTipo_ventilacion());
            sentenciaPreparada.setInt(6, au.getCantidad_ventilacion());
            sentenciaPreparada.setString(7, au.getRuta_imagen());
            sentenciaPreparada.setBinaryStream(8, au.getArchivoFotoParaGuardar());
            sentenciaPreparada.setInt(9, au.getDias().getId());
            sentenciaPreparada.setInt(10, au.getIdReservacion());
            sentenciaPreparada.setString(11, au.getTipoAula());

            if(existenciaTipoAula==1){
            sentenciaPreparada.setInt(12, au.getNumero_Computadoras());
            sentenciaPreparada.setString(13, au.getNombrePasante());

            }
            else if(existenciaTipoAula==2){
            sentenciaPreparada.setBoolean(12, au.isTela_Proyector());
            sentenciaPreparada.setBoolean(13, au.isProyector());
            }
            else if(existenciaTipoAula==4){
            sentenciaPreparada.setInt(12, au.getCantidad_Parlantes());
            sentenciaPreparada.setInt(13, au.getCantidad_Microfonos());

            }
            
            
            //ejecutar la sentencia
            res = sentenciaPreparada.executeUpdate();
            
            //executeUpdate ejecuta sentencias de insert, update y delete
            //y retorna un int con el numero de filas afectadas
        } catch (SQLException sqle) {
            System.out.println("error en guardar aula");
            System.out.println(sqle.getMessage());
        } finally {

            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Guardar Aula: error en cerrar conexion");
                System.out.println(sqle.getMessage());
            }

        }
        return res;
    }

     @Override
    public int editar(Aula au) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        String sql = null;
        int existenciaTipoAula = 0;
        try {
            if(au instanceof aulaLaboratorio){
            sql = "UPDATE aula  SET codigo = ?,"
                    + "Capacidad_alumnos = ?,Cantidad_Pizarras = ?,"
                    + "numeros_pupitres = ?, tipo_ventilacion = ?,"
                    + "cantidad_ventilacion = ?, ruta_imagen = ?, "
                    + "foto = ?,idDias = ?, cantidad_Reservacion = ?, tipo_Aula = ?, numero_Computadoras = ?, nombre_Pasante = ?"+ " WHERE id = '"+ au.getId() +"'";
                System.out.println("Existencia Aula Laboratorio");
            existenciaTipoAula=1;
        }
        else if(au instanceof aulaGrande){
           sql = "UPDATE aula  SET codigo = ?,"
                    + "Capacidad_alumnos = ?,Cantidad_Pizarras = ?,"
                    + "numeros_pupitres = ?, tipo_ventilacion = ?,"
                    + "cantidad_ventilacion = ?, ruta_imagen = ?, "
                    + "foto = ?,idDias = ?, cantidad_Reservacion = ?, tipo_Aula = ?, tela_Proyector = ?, proyector = ?"+ " WHERE id = '"+ au.getId() +"'";
                           System.out.println("Existencia Aula Grande");

            existenciaTipoAula=2;
        }
        else if(au instanceof aulaPequeña){
            sql = "UPDATE aula  SET codigo = ?,"
                    + "Capacidad_alumnos = ?,Cantidad_Pizarras = ?,"
                    + "numeros_pupitres = ?, tipo_ventilacion = ?,"
                    + "cantidad_ventilacion = ?, ruta_imagen = ?, "
                    + "foto = ?,idDias = ?, cantidad_Reservacion = ?, tipo_Aula = ?"+ " WHERE id = '"+ au.getId() +"'";
                   System.out.println("Existencia Aula Pequeña");

            existenciaTipoAula=3;
        }
        else if(au instanceof aulaAuditorio){
           
            
            sql = "UPDATE aula  SET codigo = ?,"
                    + "Capacidad_alumnos = ?,Cantidad_Pizarras = ?,"
                    + "numeros_pupitres = ?, tipo_ventilacion = ?,"
                    + "cantidad_ventilacion = ?, ruta_imagen = ?, "
                    + "foto = ?,idDias = ?, cantidad_Reservacion = ?, tipo_Aula = ?,"
                    + "cantidad_Parlantes = ?, cantidad_Microfonos = ?"+ " WHERE id = '"+ au.getId() +"'"; 
        
                   System.out.println("Existencia Aula AUDITORIO");

            existenciaTipoAula=4;
        }
         
          
            sentenciaPreparada = con.prepareStatement(sql);
            sentenciaPreparada.setString(1, au.getCodigo());
            sentenciaPreparada.setInt(2, au.getCapacidad_alumnos());
            sentenciaPreparada.setInt(3, au.getCantidad_Pizarras());
            sentenciaPreparada.setInt(4, au.getNumeros_pupitres());
            sentenciaPreparada.setString(5, au.getTipo_ventilacion());
            sentenciaPreparada.setInt(6, au.getCantidad_ventilacion());
            sentenciaPreparada.setString(7, au.getRuta_imagen());
            sentenciaPreparada.setBinaryStream(8, au.getArchivoFotoParaGuardar());
            sentenciaPreparada.setInt(9, au.getDias().getId());
            sentenciaPreparada.setInt(10, au.getIdReservacion());
            sentenciaPreparada.setString(11, au.getTipoAula());
            if(existenciaTipoAula==1){
            sentenciaPreparada.setInt(12, au.getNumero_Computadoras());
            sentenciaPreparada.setString(13, au.getNombrePasante());

            }
            else if(existenciaTipoAula==4){

            sentenciaPreparada.setInt(12, au.getCantidad_Parlantes());
            sentenciaPreparada.setInt(13, au.getCantidad_Microfonos());
            }
            else if(existenciaTipoAula==2){
                     System.out.println("Valor del id del aula GRANDE"+au.getId());
                sentenciaPreparada.setBoolean(12,au.isTela_Proyector());
            sentenciaPreparada.setBoolean(13,au.isProyector());
             
                
            }
            else if(existenciaTipoAula==3){
                System.out.println("Valor del id del aula pequeña"+au.getId());
            }

            //ejecutar la sentencia
            //retorn el numero de filas afectadas
            r = sentenciaPreparada.executeUpdate();

            System.out.println("Valor de proceso de r en editar "+r);

        } catch (SQLException ex) {
            System.out.println("Error editar Aula");
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
    public int consultaId(String criterio) {
        ArrayList<Aula> lista = null;
        //taer todos los campos de la tabla producto a la cual se llama p, y tambien de la tabla categoria llamado c 
        //cuando p.estado sea igual a 1 y p.idecategoria sea igual a c.id
// consultar
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion

        //String query2 = "select * from producto where estado=1 and talla='s'";
        String query = "select * from aula as p, paquetedias as c where"
                + " p.codigo='" + criterio + "' and p.idDias=c.id ";

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda

                //  query = query + " and p.nombre=?"; // debe escribir igualito
//
                query = query + " and p.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 
                sentenciaPreparada = con.prepareStatement(query);
                sentenciaPreparada.setString(1, criterio);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset != null) {
                lista = new ArrayList();

            } else {
                return 0;
            }
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer

                System.out.println("VALOR DEL ID A BUSCAR ES DE "+resultset.getInt("p.id"));
               return   resultset.getInt("p.id");
                

            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar ID  Aula ");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar   consultar ID  Aula");
                System.out.println(sqle.getMessage());
            }
        }

        return 0;
    }

public ArrayList<Aula> consultaAulasPorTipo(String criterio,String tipo) {
        ArrayList<Aula> lista = null;
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
                query = "select * from aula as p";

                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda
                query = "select * from aula as p, paquetedias as c where"
                + "  p.idDias=c.id ";

                 //query = query + " and p.codigo=?"; // debe escribir igualito
//          
                   if(tipo.equals("ID")){
                      query = query + " and p.id like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 

                   }else  if(tipo.equals("TIPO")){
                      query = query + " and p.tipo_Aula like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 

                   }else  if(tipo.equals("CODIGO")){
                      query = query + " and p.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 

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
            Aula p = null;
            paquetedias dias = null;
            paquetediasDAO operaciondias;
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
                    String tipoAula =resultset.getString("p.tipo_Aula");
                    
                 if(tipoAula.equals("Laboratorio") == true){
                    p = new aulaLaboratorio();
                    existenciaTipoAula = 1;
                     System.out.println("Escogió Aula Laboratorio");
                } else if (tipoAula.equals("Aula Grande") == true) {
                    p = new aulaGrande();
                    existenciaTipoAula = 2;
                     System.out.println("Escogió Aula Grande");

                } else if (tipoAula.equals("Aula Pequeño") == true) {
                    p = new aulaPequeña();
                    existenciaTipoAula = 3;
                      System.out.println("Escogió Aula Pequeña");

                }
                else if (tipoAula.equals("Auditorio") == true) {
                    p = new aulaAuditorio();
                    existenciaTipoAula = 4;
                      System.out.println("Escogió Aula Auditorio");

                }                 
                 
                operaciondias = new paquetediasDAO();
                                    reservacionDAO op = new reservacionDAO();

                if(existenciaTipoAula == 1){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));

                    p.setNumero_Computadoras(resultset.getInt("p.numero_Computadoras"));
                    p.setNombrePasante(resultset.getString("p.nombre_Pasante"));
                    
                    
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));
                }
                else if(existenciaTipoAula == 2){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));
                    p.setTela_Proyector(resultset.getBoolean("p.tela_Proyector"));
                    p.setProyector(resultset.getBoolean("p.proyector"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                else if(existenciaTipoAula == 3){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));
                    p.setNumero_Computadoras(resultset.getInt("p.numero_Computadoras"));
                    p.setNombrePasante(resultset.getString("p.nombre_Pasante"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                else if(existenciaTipoAula == 4){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));
                    p.setCantidad_Parlantes(resultset.getInt("p.cantidad_Parlantes"));
                    p.setCantidad_Microfonos(resultset.getInt("p.cantidad_Microfonos"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                
                lista.add(p);

            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar Aulas");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar consultar Aulas");
                System.out.println(sqle.getMessage());
            }
        }

        return lista;
    }
    
     @Override
    public ArrayList<Aula> consultaAulas(String criterio) {
        ArrayList<Aula> lista = null;
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
                query = "select * from aula as p";

                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda
                query = "select * from aula as p, paquetedias as c where"
                + "  p.idDias=c.id ";

                 //query = query + " and p.codigo=?"; // debe escribir igualito
//
                query = query + " and p.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 
                
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
            Aula p = null;
            paquetedias dias = null;
            paquetediasDAO operaciondias;
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
                    String tipoAula =resultset.getString("p.tipo_Aula");
                    
                 if(tipoAula.equals("Laboratorio") == true){
                    p = new aulaLaboratorio();
                    existenciaTipoAula = 1;
                     System.out.println("Escogió Aula Laboratorio");
                } else if (tipoAula.equals("Aula Grande") == true) {
                    p = new aulaGrande();
                    existenciaTipoAula = 2;
                     System.out.println("Escogió Aula Grande");

                } else if (tipoAula.equals("Aula Pequeño") == true) {
                    p = new aulaPequeña();
                    existenciaTipoAula = 3;
                      System.out.println("Escogió Aula Pequeña");

                }
                else if (tipoAula.equals("Auditorio") == true) {
                    p = new aulaAuditorio();
                    existenciaTipoAula = 4;
                      System.out.println("Escogió Aula Auditorio");

                }                 
                 
                operaciondias = new paquetediasDAO();
                                    reservacionDAO op = new reservacionDAO();

                if(existenciaTipoAula == 1){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));

                    p.setNumero_Computadoras(resultset.getInt("p.numero_Computadoras"));
                    p.setNombrePasante(resultset.getString("p.nombre_Pasante"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                else if(existenciaTipoAula == 2){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));
                    p.setTela_Proyector(resultset.getBoolean("p.tela_Proyector"));
                    p.setProyector(resultset.getBoolean("p.proyector"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                else if(existenciaTipoAula == 3){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));
                    p.setNumero_Computadoras(resultset.getInt("p.numero_Computadoras"));
                    p.setNombrePasante(resultset.getString("p.nombre_Pasante"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                else if(existenciaTipoAula == 4){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));
                    p.setCantidad_Parlantes(resultset.getInt("p.cantidad_Parlantes"));
                    p.setCantidad_Microfonos(resultset.getInt("p.cantidad_Microfonos"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                
                lista.add(p);

            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar Aulas");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar consultar Aulas");
                System.out.println(sqle.getMessage());
            }
        }

        return lista;
    }
    
    public Aula consultaAulas1(String criterio) {
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
                query = "select * from aula as p";

                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda
                query = "select * from aula as p, paquetedias as c where"
                + "  p.idDias=c.id ";

                 //query = query + " and p.codigo=?"; // debe escribir igualito
//
                query = query + " and p.id like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 
                
                sentenciaPreparada = con.prepareStatement(query);
           sentenciaPreparada.setString(1, criterio);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset != null) {
                

            } else {
                return null;
            }
            Aula p = null;
            paquetedias dias = null;
            paquetediasDAO operaciondias;
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
                    String tipoAula =resultset.getString("p.tipo_Aula");
                    
                 if(tipoAula.equals("Laboratorio") == true){
                    p = new aulaLaboratorio();
                    existenciaTipoAula = 1;
                     System.out.println("Escogió Aula Laboratorio");
                } else if (tipoAula.equals("Aula Grande") == true) {
                    p = new aulaGrande();
                    existenciaTipoAula = 2;
                     System.out.println("Escogió Aula Grande");

                } else if (tipoAula.equals("Aula Pequeño") == true) {
                    p = new aulaPequeña();
                    existenciaTipoAula = 3;
                      System.out.println("Escogió Aula Pequeña");

                }
                else if (tipoAula.equals("Auditorio") == true) {
                    p = new aulaAuditorio();
                    existenciaTipoAula = 4;
                      System.out.println("Escogió Aula Auditorio");

                }                 
                 
                operaciondias = new paquetediasDAO();
                                    reservacionDAO op = new reservacionDAO();

                if(existenciaTipoAula == 1){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));

                    p.setNumero_Computadoras(resultset.getInt("p.numero_Computadoras"));
                    p.setNombrePasante(resultset.getString("p.nombre_Pasante"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                else if(existenciaTipoAula == 2){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));
                    p.setTela_Proyector(resultset.getBoolean("p.tela_Proyector"));
                    p.setProyector(resultset.getBoolean("p.proyector"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                else if(existenciaTipoAula == 3){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));
                    p.setNumero_Computadoras(resultset.getInt("p.numero_Computadoras"));
                    p.setNombrePasante(resultset.getString("p.nombre_Pasante"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                else if(existenciaTipoAula == 4){
                    p.setId(resultset.getInt("p.id"));
                    p.setCodigo(resultset.getString("p.codigo"));
                    p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                    p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                    p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                    p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                    p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                    p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                    p.setFoto(resultset.getBlob("p.foto"));

                    dias = operaciondias.consultaId(Integer.toString(resultset.getInt("p.idDias")));

                    p.setDias(dias);
                    p.setIdDias(resultset.getInt("p.idDias"));
                    p.setTipoAula(resultset.getString("p.tipo_Aula"));
                    p.setIdReservacion(resultset.getInt("p.cantidad_Reservacion"));
                    p.setCantidad_Parlantes(resultset.getInt("p.cantidad_Parlantes"));
                    p.setCantidad_Microfonos(resultset.getInt("p.cantidad_Microfonos"));
                    p.setReservacion(op.consultaAulasPorTipo(Integer.toString(resultset.getInt("p.id"))));

                }
                
                return p;
            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar Aulas");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar consultar Aulas");
                System.out.println(sqle.getMessage());
            }
        }

        return null;
    }
     @Override
    public int eliminar(Aula au) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "DELETE FROM aula WHERE id = '" + au.getId()+ "' and cantidad_Reservacion = 0";

            sentenciaPreparada = con.prepareStatement(sql);

            r = sentenciaPreparada.executeUpdate();

           
        } catch (SQLException ex) {
            System.out.println("Error eliminar Aula");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                            System.out.println("Error conexion eliminar Aula");

                System.out.println(ex.getMessage());
            }
        }
        return r;
    }
    public int eliminarPorId(int id) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "DELETE FROM aula WHERE id = '" + id+ "' and cantidad_Reservacion = 0";

            sentenciaPreparada = con.prepareStatement(sql);

            r = sentenciaPreparada.executeUpdate();

           
        } catch (SQLException ex) {
            System.out.println("Error eliminar Aula");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                            System.out.println("Error conexion eliminar Aula");

                System.out.println(ex.getMessage());
            }
        }
        return r;
    }
    public int existenciaAulaPorCodigo(String criterio) {
        int respuesta = 0;
        
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion
         //String query2 = "select * from producto where estado=1 and talla='s'";
       String query = "select * from aula as p where"
                + " p.codigo='" + criterio + "' ";

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda

                //  query = query + " and p.nombre=?"; // debe escribir igualito
//
                query = query + " and p.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 
                sentenciaPreparada = con.prepareStatement(query);
                sentenciaPreparada.setString(1, criterio);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset == null) {
                                return 0;
            }
            
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
              
                if(criterio.equals(resultset.getString("p.codigo"))==true){
                    return 1;
                }
               
            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar existencia Aula ");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar Aula: cerrar conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return respuesta ;
    }
    
/*
    public ArrayList<Aula> consultaPequeño(String criterio) {
        ArrayList<Aula> lista = null;
        //taer todos los campos de la tabla producto a la cual se llama p, y tambien de la tabla categoria llamado c 
        //cuando p.estado sea igual a 1 y p.idecategoria sea igual a c.id
// consultar
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion

        //String query2 = "select * from producto where estado=1 and talla='s'";
        String query = "select * from aula as p, paquetedias as c, pequeña as l where"
                + " p.codigo='" + criterio + "' and p.idDias=c.id and p.codigo = l.codigo";

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda

                //  query = query + " and p.nombre=?"; // debe escribir igualito
//
                query = query + " and p.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 
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
            Aula p = null;
            paquetedias dias = null;
            paquetediasDAO operaciondias;
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer

                p = new aulaPequeña();
                operaciondias = new paquetediasDAO();
                p.setId(resultset.getInt("p.id"));

                p.setCodigo(resultset.getString("p.codigo"));
                p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                p.setFoto(resultset.getBlob("p.foto"));
          

                dias = operaciondias.consulta(criterio);

                p.setDias(dias);
                p.setIdDias(resultset.getInt("p.idDias"));

                p.setIdReservacion(resultset.getInt("p.idReservacion"));

                lista.add(p);

            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar  Aula pequeña");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar Aula pequeña: cerrar conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return lista;
    }
   /*
    private int editarLaboratorio(Aula au) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "update  laboratorio  set codigo =?,"
                    + " numeros_Computadoras=?,nombre_Pasante=?,"
                    + "where codigo='" + au.getCodigo() + "'";

            sentenciaPreparada = con.prepareStatement(sql);
            sentenciaPreparada.setString(1, au.getCodigo());
            sentenciaPreparada.setInt(2, au.getNumero_Computadoras());
            sentenciaPreparada.setString(3, au.getNombrePasante());

            //ejecutar la sentencia
            //retorn el numero de filas afectadas
            r = sentenciaPreparada.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error editar Aula Laboratorio");
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

    private int editarAulaPequeña(Aula au) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "update  pequeña  set codigo =?,"
                    //    + " numeros_Computadoras=?,nombre_Pasante=?,"
                    + "where codigo='" + au.getCodigo() + "'";

            sentenciaPreparada = con.prepareStatement(sql);
            sentenciaPreparada.setString(1, au.getCodigo());
            //   sentenciaPreparada.setInt(2, au.getNumero_Computadoras());
            // sentenciaPreparada.setString(3, au.getNombrePasante());

            //ejecutar la sentencia
            //retorn el numero de filas afectadas
            r = sentenciaPreparada.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error editar Aula pequeñá");
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

    private int editarAulaGrande(Aula au) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "update  grande  set codigo =?,"
                    //    + " numeros_Computadoras=?,nombre_Pasante=?,"
                    + "where codigo='" + au.getCodigo() + "'";

            sentenciaPreparada = con.prepareStatement(sql);
            sentenciaPreparada.setString(1, au.getCodigo());
            //   sentenciaPreparada.setInt(2, au.getNumero_Computadoras());
            // sentenciaPreparada.setString(3, au.getNombrePasante());

            //ejecutar la sentencia
            //retorn el numero de filas afectadas
            r = sentenciaPreparada.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("Error editar Aula grande");
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
*/
    
    /*public int existenciaCodigoGrande(String criterio) {
        int respuesta = 0;
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion
         //String query2 = "select * from producto where estado=1 and talla='s'";
        String query = "select * from aula as p, paquetedias as c, grande as l where"
                + " p.codigo='" + criterio + "' and p.idDias=c.id and p.codigo = l.codigo";

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda

                //  query = query + " and p.nombre=?"; // debe escribir igualito
//
                query = query + " and p.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 
                sentenciaPreparada = con.prepareStatement(query);
                sentenciaPreparada.setString(1, criterio);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset != null) {
               

            } else {
                return 0;
            }
            Aula p = null;
            paquetedias dias = null;
            paquetediasDAO operaciondias;
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer

                if(criterio.equals(resultset.getString("l.codigo"))){
                    return 1;
                }
               
            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar existencia Aula grande");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar Aula grande: cerrar conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return respuesta ;
    }
    public int existenciaCodigoPequeña(String criterio) {
        int respuesta = 0;
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion
         //String query2 = "select * from producto where estado=1 and talla='s'";
       String query = "select * from aula as p, paquetedias as c, pequeña as l where"
                + " p.codigo='" + criterio + "' and p.idDias=c.id and p.codigo = l.codigo";

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda

                //  query = query + " and p.nombre=?"; // debe escribir igualito
//
                query = query + " and p.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 
                sentenciaPreparada = con.prepareStatement(query);
                sentenciaPreparada.setString(1, criterio);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset != null) {
               

            } else {
                return 0;
            }
            Aula p = null;
            paquetedias dias = null;
            paquetediasDAO operaciondias;
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer

                if(criterio.equals(resultset.getString("l.codigo"))){
                    return 1;
                }
               
            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar existencia Aula pequeña");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar Aula pequeña: cerrar conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return respuesta ;
    }
    public int existenciaCodigoLaboratorio(String criterio) {
        int respuesta = 0;
        
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion
         //String query2 = "select * from producto where estado=1 and talla='s'";
       String query = "select * from aula as p, paquetedias as c, laboratorio as l where"
                + " p.codigo='" + criterio + "' and p.idDias=c.id and p.codigo = l.codigo";

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda

                //  query = query + " and p.nombre=?"; // debe escribir igualito
//
                query = query + " and p.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 
                sentenciaPreparada = con.prepareStatement(query);
                sentenciaPreparada.setString(1, criterio);

            }
            //eejecutar la sentencia 
            // executeQuery para sentencia select
            resultset = sentenciaPreparada.executeQuery();
            if (resultset != null) {
            

            } else {
                return 0;
            }
            
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer
              
                if(criterio.equals(resultset.getString("l.codigo"))==true){
                    return 1;
                }
               
            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar existencia Aula laboratorio");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar Aula laboratorio: cerrar conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return respuesta ;
    }

    public ArrayList<Aula> consultaGrande(String criterio) {
        ArrayList<Aula> lista = null;
        //taer todos los campos de la tabla producto a la cual se llama p, y tambien de la tabla categoria llamado c 
        //cuando p.estado sea igual a 1 y p.idecategoria sea igual a c.id
// consultar
        micon = new MiConexion();
        con = micon.getConection(); // mi clase de obtencion

        //String query2 = "select * from producto where estado=1 and talla='s'";
        String query = "select * from aula as p, paquetedias as c, grande as l where"
                + " p.codigo='" + criterio + "' and p.idDias=c.id and p.codigo = l.codigo";

        // preparar la sentencia
        try {

            if (criterio.equals("")) {
                sentenciaPreparada = con.prepareStatement(query);
            } else { // si hay criterio de busqueda

                //  query = query + " and p.nombre=?"; // debe escribir igualito
//
                query = query + " and p.codigo like concat('%',?,'%')"; //bastaconqueloque usuario escriba este 
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
            Aula p = null;
            paquetedias dias = null;
            paquetediasDAO operaciondias;
            //recorre resultset
            while (resultset.next()) {//mientras haya un siguiente registro por leer

                p = new aulaGrande();
                operaciondias = new paquetediasDAO();
                p.setId(resultset.getInt("p.id"));

                p.setCodigo(resultset.getString("p.codigo"));
                p.setCapacidad_alumnos(resultset.getInt("p.Capacidad_alumnos"));
                p.setCantidad_Pizarras(resultset.getInt("p.Cantidad_Pizarras"));
                p.setNumeros_pupitres(resultset.getInt("p.numeros_pupitres"));
                p.setTipo_ventilacion(resultset.getString("p.tipo_ventilacion"));
                p.setCantidad_ventilacion(resultset.getInt("p.cantidad_ventilacion"));
                p.setRuta_imagen(resultset.getString("p.ruta_imagen"));
                p.setFoto(resultset.getBlob("p.foto"));             
                dias = operaciondias.consulta(criterio);

               // para obtener todo el paquete 
               
               p.setDias(dias);
                p.setIdDias(resultset.getInt("p.idDias"));
                p.setIdReservacion(resultset.getInt("p.idReservacion"));

                lista.add(p);

            }

        } catch (SQLException sqle) {
            System.out.println("error en consultar  Aula grande");
            System.out.println(sqle.getMessage());
        } finally {
            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("error en cerrar Aula grande: cerrar conexion");
                System.out.println(sqle.getMessage());
            }
        }

        return lista;
    }
*/
    
    
/*
    private int eliminarLaboratorio(String criterio) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "DELETE FROM laboratorio WHERE codigo = '" + criterio + "'";

            sentenciaPreparada = con.prepareStatement(sql);

            r = sentenciaPreparada.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error eliminar laboratorio");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                System.out.println("error al cerrar eliminar laboratorio");
                System.out.println(ex.getMessage());
            }
        }
        return r;
    }

    private int eliminarAulaPequeña(String criterio) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "DELETE FROM pequeña WHERE codigo = '" + criterio + "'";

            sentenciaPreparada = con.prepareStatement(sql);

            r = sentenciaPreparada.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error eliminar aula pequeña");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                System.out.println("error al cerrar eliminar aula pequeña");
                System.out.println(ex.getMessage());
            }
        }
        return r;
    }

    private int eliminarAulaGrande(String criterio) {
        //obtener conexion
        micon = new MiConexion();
        con = micon.getConection();
        int r = 0;
        try {
            // preparar la sentencia
            //sentencia para actualizacion
            String sql = "DELETE FROM grande WHERE codigo = '" + criterio + "'";

            sentenciaPreparada = con.prepareStatement(sql);

            r = sentenciaPreparada.executeUpdate();
        } catch (SQLException ex) {
            System.out.println("Error eliminar aula grande");
            System.out.println(ex.getMessage());
        } finally {
            try {
                con.close(); //cerrar la conexion
            } catch (SQLException ex) {
                System.out.println("error al cerrar eliminar aula grande");
                System.out.println(ex.getMessage());
            }
        }
        return r;
    }
*/
    /*
    private int guardarAulaLaboratorio(Aula au) {
        int res = 0;
        micon = new MiConexion();
        //obtener conexion
        con = micon.getConection();
        if (con == null) {
            return 0;
        }

        // insertar
        String sql = "insert into laboratorio"
                + "(codigo,numeros_Computadoras,nombre_Pasante)"
                + "values (?,?,?)";
        try {
            //crear una sentencia preparada
            sentenciaPreparada = con.prepareStatement(sql);
            //prepararla para su ejecucion
            sentenciaPreparada.setString(1, au.getCodigo());
            sentenciaPreparada.setInt(2, au.getNumero_Computadoras());
            sentenciaPreparada.setString(3, au.getNombrePasante());

            //ejecutar la sentencia
            res = sentenciaPreparada.executeUpdate();

            //executeUpdate ejecuta sentencias de insert, update y delete
            //y retorna un int con el numero de filas afectadas
        } catch (SQLException sqle) {
            System.out.println("error en guardar aula Laboratorio");
            System.out.println(sqle.getMessage());
        } finally {

            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Guardar Aula Laboratorio: error en cerrar conexion");
                System.out.println(sqle.getMessage());
            }

        }
        return res;

    }

    private int guardarAulaPequeña(Aula au) {
        int res = 0;
        micon = new MiConexion();
        //obtener conexion
        con = micon.getConection();
        if (con == null) {
            return 0;
        }

        // insertar
        String sql = "insert into pequeña"
                + "(codigo)"
                + "values (?)";
        try {
            //crear una sentencia preparada
            sentenciaPreparada = con.prepareStatement(sql);
            //prepararla para su ejecucion
             //prepararla para su ejecucion
            sentenciaPreparada.setString(1, au.getCodigo());
             //ejecutar la sentencia
            res = sentenciaPreparada.executeUpdate();

            //executeUpdate ejecuta sentencias de insert, update y delete
            //y retorna un int con el numero de filas afectadas
        } catch (SQLException sqle) {
            System.out.println("error en guardar aula pequeña");
            System.out.println(sqle.getMessage());
        } finally {

            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("Guardar Aula Pequeña: error en cerrar conexion");
                System.out.println(sqle.getMessage());
            }

        }
        return res;

    }

    private int guardarAulaGrande(Aula au) {
        int res = 0;
        micon = new MiConexion();
        //obtener conexion
        con = micon.getConection();
        if (con == null) {
            return 0;
        }

        // insertar
        String sql = "insert into grande"
                + "(codigo)"
                + "values (?)";
        try {
            //crear una sentencia preparada
            sentenciaPreparada = con.prepareStatement(sql);
            //prepararla para su ejecucion
            sentenciaPreparada.setString(1,au.getCodigo());

            //ejecutar la sentencia
            res = sentenciaPreparada.executeUpdate();

            //executeUpdate ejecuta sentencias de insert, update y delete
            //y retorna un int con el numero de filas afectadas
        } catch (SQLException sqle) {
            System.out.println("error en guardar aula Grande");
            System.out.println(sqle.getMessage());
        } finally {

            try {
                con.close();
            } catch (SQLException sqle) {
                System.out.println("guardar Aula Grande: error en cerrar conexion");
                System.out.println(sqle.getMessage());
            }

        }
        return res;

    }
*/
}
