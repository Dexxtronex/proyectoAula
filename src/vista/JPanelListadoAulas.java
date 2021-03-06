/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.entidadesDTO.Aula;
import modelo.entidadesDTO.Reservacion;
import modelo.operacionesDAO.aulaDAO;
import modelo.operacionesDAO.reservacionDAO;

/**
 *
 * @author Dexx
 */
public class JPanelListadoAulas extends javax.swing.JPanel {
    ArrayList<Aula> lista;
    aulaDAO objAulaDao = null;

    /**
     * Creates new form JPanelListadoAulas
     */
    public JPanelListadoAulas() {
        initComponents();
        cargarTabla("");  


    }
   
public void cargarTabla(String criterio){
        aulaDAO auladao = new aulaDAO();
        lista = auladao.consultaAulas(criterio);
 
        reservacionDAO obj_reser = new reservacionDAO();
        //mostrar lista de productos en la tabla 
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ID","Codigo","idPaqueteDias","Existe Reservacion","tipoAula"};
        modelo.setColumnIdentifiers(columnas);
        Object [] producto = new Object[5];
        for(int i = 0; i <lista.size(); i++){
            producto[0] = lista.get(i).getId();
            producto[1] = lista.get(i).getCodigo();
            int x = 0;
            if(obj_reser.existenciaReservacionPorCodigo(Integer.toString(lista.get(i).getId()))>0){
                x = obj_reser.existenciaReservacionPorCodigo(Integer.toString(lista.get(i).getId()));
            }
            producto[2] = lista.get(i).getIdDias();
            producto[3] = x;
            producto[4] = lista.get(i).toString();
            System.out.println("tamaño de lista"+lista.size()+" tostring "+lista.get(i).toString());
            modelo.addRow(producto);

        }
        //establecer el modelo de al JTABLE
        jTableAula.setModel(modelo);
    }
public void cargarTablaTipo(String criterio,String tipo){
        aulaDAO auladao = new aulaDAO();
        lista = auladao.consultaAulasPorTipo(criterio,tipo);
 

        //mostrar lista de productos en la tabla 
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ID","Codigo","idPaqueteDias","Existe Reservacion","tipoAula"};
        modelo.setColumnIdentifiers(columnas);
        Object [] producto = new Object[5];
        for(int i = 0; i <lista.size(); i++){
            producto[0] = lista.get(i).getId();
            producto[1] = lista.get(i).getCodigo();
            producto[2] = lista.get(i).getIdDias();
            producto[3] = lista.get(i).getIdReservacion();
            producto[4] = lista.get(i).toString();
            System.out.println("tamaño de lista"+lista.size()+" tostring "+lista.get(i).toString());
            modelo.addRow(producto);

        }
        //establecer el modelo de al JTABLE
        jTableAula.setModel(modelo);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelBuscar = new javax.swing.JLabel();
        jTextFieldbuscar = new javax.swing.JTextField();
        jComboBoxBuscar = new javax.swing.JComboBox<>();
        jButtonBuscarAula = new javax.swing.JButton();
        jButtonVer = new javax.swing.JButton();
        jButtonNuevo = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAula = new javax.swing.JTable();

        setLayout(new javax.swing.BoxLayout(this, javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jLabelBuscar.setText("Buscar:");
        jPanel1.add(jLabelBuscar);

        jTextFieldbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jTextFieldbuscar);

        jComboBoxBuscar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ID", "CODIGO", "TIPO" }));
        jPanel1.add(jComboBoxBuscar);

        jButtonBuscarAula.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesIconos/search_book_open_search_locate_6178 (1).png"))); // NOI18N
        jButtonBuscarAula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBuscarAulaMouseClicked(evt);
            }
        });
        jButtonBuscarAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBuscarAulaActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonBuscarAula);

        jButtonVer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesIconos/detailed3x_87019.png"))); // NOI18N
        jButtonVer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonVer);

        jButtonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesIconos/new_page_document_16676.png"))); // NOI18N
        jButtonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonNuevo);

        jButtonEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesIconos/documentediting_editdocuments_text_documentedi_2820.png"))); // NOI18N
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEditar);

        jButtonEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesIconos/document_delete_256_icon-icons.com_75995.png"))); // NOI18N
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar);

        add(jPanel1);

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTableAula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableAula);

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBuscarAulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBuscarAulaMouseClicked
        
        
        cargarTablaTipo(jTextFieldbuscar.getText(),jComboBoxBuscar.getSelectedItem().toString());
    }//GEN-LAST:event_jButtonBuscarAulaMouseClicked

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
int i = JOptionPane.showConfirmDialog((Component)evt.getSource(),
                "Esta Seguro de Eliminar el AULA?", "Mensaje",
                JOptionPane.YES_NO_OPTION);
        
        if(i==JOptionPane.YES_NO_OPTION){   
                EliminarProducto();
        }

    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void jButtonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNuevoActionPerformed

        JFrameNuevaAula obj = new JFrameNuevaAula();
        obj.setVisible(true);
        obj.setJFrameListar(this);

    }//GEN-LAST:event_jButtonNuevoActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
               int fila = jTableAula.getSelectedRow();
                 

        if(fila >=0 ){
            String codigo  = jTableAula.getValueAt(fila,1).toString();
            JFrameEditarAula obj = new JFrameEditarAula(codigo);
        obj.setJFrameListar(this);
        obj.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Error, seleccione una aula para editar");
        }
        
                

    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonBuscarAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBuscarAulaActionPerformed
         // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBuscarAulaActionPerformed

    private void jTextFieldbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldbuscarActionPerformed
 cargarTablaTipo(jTextFieldbuscar.getText(),jComboBoxBuscar.getSelectedItem().toString());
 // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldbuscarActionPerformed

    private void jButtonVerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerActionPerformed
               int fila = jTableAula.getSelectedRow();
                 

        if(fila >=0 ){
            String codigo  = jTableAula.getValueAt(fila,1).toString();
            JFrameVisualizar obj = new JFrameVisualizar(codigo);
        obj.setJFrameListar(this);
        obj.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Error, seleccione una aula para Visualizar");
        }
        



    }//GEN-LAST:event_jButtonVerActionPerformed
private void EliminarProducto(){
   objAulaDao = new aulaDAO();
    int fila = jTableAula.getSelectedRow();
   if( (Integer.parseInt( jTableAula.getValueAt(fila, 3).toString()))>0){
        JOptionPane.showMessageDialog(null, "ERROR, No se puede eliminar una AULA con Reservacion");
  cargarTabla("");
   }else{
        if(objAulaDao.eliminarPorId(Integer.parseInt( jTableAula.getValueAt(fila, 0).toString()))>0)
        {
               JOptionPane.showMessageDialog(null, "Eliminacion correcta de Aula");
            cargarTabla("");
        }
        else{
            JOptionPane.showMessageDialog(null,"ERROR AL ELIMINAR AULA");
        }
            
   }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBuscarAula;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonNuevo;
    private javax.swing.JButton jButtonVer;
    private javax.swing.JComboBox<String> jComboBoxBuscar;
    private javax.swing.JLabel jLabelBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAula;
    private javax.swing.JTextField jTextFieldbuscar;
    // End of variables declaration//GEN-END:variables
}
