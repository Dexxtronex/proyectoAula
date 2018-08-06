/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.entidadesDTO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Blob;
import static java.sql.JDBCType.BLOB;
import java.util.ArrayList;

/**
 *
 * @author Dexx
 */
public abstract class Aula   {
    private int id;
    private String codigo ;
    private int Capacidad_alumnos;
    private int Cantidad_Pizarras;
    private int numeros_pupitres;
    private String tipo_ventilacion;
    private int cantidad_ventilacion;
    private String ruta_imagen;
    private Blob foto;
    
    
    
    private int hora_inicio;
    private int hora_final;
    private int idDias;
    private paquetedias dias;
    private int idReservacion;
    private ArrayList<Reservacion>   reservacion = null;
    FileInputStream archivoFotoParaGuardar;
    private int idTipoAula;   
    private String tipoAula;

    @Override
    public String toString() {
        return "Aula{" + "id=" + id + ", codigo=" + codigo + ", Capacidad_alumnos=" + Capacidad_alumnos + ", Cantidad_Pizarras=" + Cantidad_Pizarras + ", numeros_pupitres=" + numeros_pupitres + ", tipo_ventilacion=" + tipo_ventilacion + ", cantidad_ventilacion=" + cantidad_ventilacion + ", ruta_imagen=" + ruta_imagen + ", foto=" + foto + ", hora_inicio=" + hora_inicio + ", hora_final=" + hora_final + ", idDias=" + idDias + ", dias=" + dias + ", idReservacion=" + idReservacion + ", reservacion=" + reservacion + ", archivoFotoParaGuardar=" + archivoFotoParaGuardar + ", idTipoAula=" + idTipoAula + ", tipoAula=" + tipoAula + '}';
    }

    public Aula() {
    }

    public int getIdDias() {
        return idDias;
    }

    public void setIdDias(int idDias) {
        this.idDias = idDias;
    }
  
   

    public abstract int getNumero_Computadoras();
    public abstract String getNombrePasante();
 public abstract void setNumero_Computadoras(int a);
 public abstract void setNombrePasante(String s);


 
 public abstract int getCantidad_Parlantes() ;

    public abstract void setCantidad_Parlantes(int cantidad_Parlantes);

    public abstract int getCantidad_Microfonos() ;

    public abstract void setCantidad_Microfonos(int cantidad_Microfonos);
    

    public paquetedias getDias() {
        return dias;
    }

    public void setDias(paquetedias dias) {
        this.dias = dias;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoAula() {
        return tipoAula;
    }

    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCapacidad_alumnos() {
        return Capacidad_alumnos;
    }

    public void setCapacidad_alumnos(int Capacidad_alumnos) {
        this.Capacidad_alumnos = Capacidad_alumnos;
    }

    public int getCantidad_Pizarras() {
        return Cantidad_Pizarras;
    }

    public void setCantidad_Pizarras(int Cantidad_Pizarras) {
        this.Cantidad_Pizarras = Cantidad_Pizarras;
    }

    public int getNumeros_pupitres() {
        return numeros_pupitres;
    }

    public void setNumeros_pupitres(int numeros_pupitres) {
        this.numeros_pupitres = numeros_pupitres;
    }

    public String getTipo_ventilacion() {
        return tipo_ventilacion;
    }

    public void setTipo_ventilacion(String tipo_ventilacion) {
        this.tipo_ventilacion = tipo_ventilacion;
    }

    public int getCantidad_ventilacion() {
        return cantidad_ventilacion;
    }

    public void setCantidad_ventilacion(int cantidad_ventilacion) {
        this.cantidad_ventilacion = cantidad_ventilacion;
    }

    public String getRuta_imagen() {
        return ruta_imagen;
    }

    public void setRuta_imagen(String ruta_imagen) {
        this.ruta_imagen = ruta_imagen;
        try
        {
                         this.archivoFotoParaGuardar= new FileInputStream(ruta_imagen);

        }catch(FileNotFoundException ex){
            System.out.println("Error al asignar ruta para guardar");
            System.out.println(ex);
        }
    }

    public Blob getFoto() {
        return foto;
    }

    public void setFoto(Blob foto) {
        this.foto = foto;
    }

    public int getHora_inicio() {
        return hora_inicio;
    }

    public void setHora_inicio(int hora_inicio) {
        this.hora_inicio = hora_inicio;
    }

    public int getHora_final() {
        return hora_final;
    }

    public void setHora_final(int hora_final) {
        this.hora_final = hora_final;
    }

   



    public int getIdReservacion() {
        return idReservacion;
    }

    public void setIdReservacion(int idReservacion) {
        this.idReservacion = idReservacion;
    }

    public ArrayList<Reservacion> getReservacion() {
        return reservacion;
    }

    public void setReservacion(ArrayList<Reservacion> reservacion) {
        this.reservacion = reservacion;
    }

    public FileInputStream getArchivoFotoParaGuardar() {
        return archivoFotoParaGuardar;
    }

    public void setArchivoFotoParaGuardar(FileInputStream archivoFotoParaGuardar) {
        this.archivoFotoParaGuardar = archivoFotoParaGuardar;
    }

    public int getIdTipoAula() {
        return idTipoAula;
    }

    public void setIdTipoAula(int idTipoAula) {
        this.idTipoAula = idTipoAula;
    }

 
    
            
    
}
