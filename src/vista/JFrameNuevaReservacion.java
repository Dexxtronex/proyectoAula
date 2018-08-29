/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Component;
import java.awt.Image;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.entidadesDTO.Aula;
import modelo.entidadesDTO.Reservacion;
import modelo.entidadesDTO.paquetedias;
import modelo.operacionesDAO.aulaDAO;
import modelo.operacionesDAO.paquetediasDAO;
import modelo.operacionesDAO.reservacionDAO;

/**
 *
 * @author Dexx
 */
public class JFrameNuevaReservacion extends javax.swing.JFrame {
paquetediasDAO objPaqueteDao= null; 
    Aula objAula = null;
    paquetedias objPaque = null;
    aulaDAO objAulaDao = null;
    private int id = 0;
    /**
     * Creates new form JFrameNuevaReservacion
     */
    aulaDAO obj_Aula_DAO;
    ArrayList<Reservacion> lista = null;
    
    public JFrameNuevaReservacion() {
        initComponents();
        deshabilitarPanelLaboratorio();
        jPanelAtributosExtras2.setEnabled(false);
        jPanelAtributosAuditorio.setEnabled(false);
        jPanelAtributosAulaGrande.setEnabled(false);
        jComboBoxCODIGOAULA.requestFocus();
        jPanel5.setEnabled(false);
         bloqueoCamposTexto();
         JTextFieldRutaImagen.setEnabled(false);
         deshabilitarJCheckBoxTipoHorario();
                 jPanelDias.setEnabled(false);
                         jCheckBoxCrearHorario.setEnabled(false);
                         deshabilitar_Reservacion();

       cargarComboBox();
        
       
       /* 
        
    */
        }
   
     private void deshabilitarJCheckBoxTipoHorario() {
        jCheckBoxLunes.setSelected(false);
        jCheckBoxMartes.setSelected(false);

        jCheckBoxMiercoles.setSelected(false);

        jCheckBoxJueves.setSelected(false);

        jCheckBoxViernes.setSelected(false);

        jCheckBoxSabado.setSelected(false);

        jCheckBoxDomingo.setSelected(false);

                                    
        
        jCheckBoxTela_Proyector1.setEnabled(false);
        jCheckBoxProyector1.setEnabled(false);
        
        jCheckBoxLunes.setEnabled(false);
        jCheckBoxMartes.setEnabled(false);

        jCheckBoxMiercoles.setEnabled(false);

        jCheckBoxJueves.setEnabled(false);

        jCheckBoxViernes.setEnabled(false);

        jCheckBoxSabado.setEnabled(false);

        jCheckBoxDomingo.setEnabled(false);
         JTextFieldHora_Inicio.setText("");
       JTextFieldHora_Fin.setText("");
        JTextFieldHora_Inicio.setEnabled(false);
       JTextFieldHora_Fin.setEnabled(false);
    }
    
    private void cargarComboBox(){
         obj_Aula_DAO = new aulaDAO();
         ArrayList<Aula> obj_aulaLista ;
         obj_aulaLista = obj_Aula_DAO.consultaAulas("");
         
       
        for(int i = 0; i <obj_aulaLista.size(); i++){
           jComboBoxCODIGOAULA.addItem(obj_aulaLista.get(i).getCodigo());
           
           

        }
         
    }
    
     private void deshabilitar_Reservacion(){
         JTextFieldCodigo1.setEnabled(false);
         JTextFieldEncargado.setEnabled(false);
         JTextFieldHora_Fin1.setEnabled(false);
         JTextFieldHora_Inicio1.setEnabled(false);
         
     }
      private void habilitar_Reservacion(){
         JTextFieldCodigo1.setEnabled(true);
         JTextFieldEncargado.setEnabled(true);
         JTextFieldHora_Fin1.setEnabled(true);
         JTextFieldHora_Inicio1.setEnabled(true);
 
     }
    private void bloqueoCamposTexto(){
       this.JComboBoxTipoAula.setEnabled(false); 
        this.JComboBoxTipoHorario.setEnabled(false);
        this.JComboBoxTipoVentilador.setEnabled(false);
        this.JTextFieldCapa_Alumno.setEnabled(false);
        this.JTextFieldCapa_Pizarra.setEnabled(false);
        this.JTextFieldHora_Fin.setEnabled(false);
        this.JTextFieldHora_Inicio.setEnabled(false);
        this.JTextFieldNombreHorario.setEnabled(false);
        this.JTextFieldNombrePasante.setEnabled(false);
        this.JTextFieldNumePupitres.setEnabled(false);
        this.JTextFieldNumeroComputadoras.setEnabled(false);
        this.JTextFieldNumeroVentiladores.setEnabled(false);
        this.JTextFieldRutaImagen.setEnabled(false);
   }

    
    private void deshabilitarPanelLaboratorio(){
                jPanelAtributosExtras2.setVisible(false);

        jLabelNombrePasante.setVisible(false);
        jLabelNumeroComputadora.setVisible(false);
        JTextFieldNumeroComputadoras.setVisible(false);
        JTextFieldNombrePasante.setVisible(false);
        JTextFieldNumeroComputadoras.setText("");
        JTextFieldNombrePasante.setText("");
        JTextFieldNumeroComputadoras.setEnabled(false);
        JTextFieldNombrePasante.setEnabled(false);

    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservacion = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTextFieldCodigo1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        JTextFieldHora_Fin1 = new javax.swing.JTextField();
        JTextFieldHora_Inicio1 = new javax.swing.JTextField();
        JTextFieldEncargado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxCODIGOAULA = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNombreHorario = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanelAtributosExtras2 = new javax.swing.JPanel();
        JTextFieldNumeroComputadoras = new javax.swing.JTextField();
        jLabelNumeroComputadora = new javax.swing.JLabel();
        jLabelNombrePasante = new javax.swing.JLabel();
        JTextFieldNombrePasante = new javax.swing.JTextField();
        jPanelAtributosAulaGrande = new javax.swing.JPanel();
        jCheckBoxProyector1 = new javax.swing.JCheckBox();
        jCheckBoxTela_Proyector1 = new javax.swing.JCheckBox();
        jPanelAtributosAuditorio = new javax.swing.JPanel();
        JTextFieldNumeroParlantes = new javax.swing.JTextField();
        jLabelNumeroParlantes = new javax.swing.JLabel();
        JTextFieldNumeroMicrofonos = new javax.swing.JTextField();
        jLabelNumeroMicrofonos = new javax.swing.JLabel();
        JTextFieldHora_Fin = new javax.swing.JTextField();
        JTextFieldHora_Inicio = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        JTextFieldNumeroVentiladores = new javax.swing.JTextField();
        JComboBoxTipoAula = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTextFieldNombreHorario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTextFieldNumePupitres = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jCheckBoxCrearHorario = new javax.swing.JCheckBox();
        JComboBoxTipoHorario = new javax.swing.JComboBox();
        JTextFieldRutaImagen = new javax.swing.JTextField();
        jPanelDias = new javax.swing.JPanel();
        jCheckBoxLunes = new javax.swing.JCheckBox();
        jCheckBoxMiercoles = new javax.swing.JCheckBox();
        jCheckBoxJueves = new javax.swing.JCheckBox();
        jCheckBoxViernes = new javax.swing.JCheckBox();
        jCheckBoxMartes = new javax.swing.JCheckBox();
        jCheckBoxSabado = new javax.swing.JCheckBox();
        jCheckBoxDomingo = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        JTextFieldCapa_Alumno = new javax.swing.JTextField();
        JComboBoxTipoVentilador = new javax.swing.JComboBox();
        JTextFieldCapa_Pizarra = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        jTableReservacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableReservacion);

        jLabel1.setText("Reservaciones Hechas");

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel11.setText("COD. Reservacion:");

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel10.setText("HORA INICIO:");

        JTextFieldCodigo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextFieldCodigo1.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldCodigo1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel12.setText("FECHA:");

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel16.setText("HORA FIN:");

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel17.setText("ENCARGADO:");

        JTextFieldHora_Fin1.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldHora_Fin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldHora_Fin1ActionPerformed(evt);
            }
        });

        JTextFieldHora_Inicio1.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldHora_Inicio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldHora_Inicio1ActionPerformed(evt);
            }
        });
        JTextFieldHora_Inicio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldHora_Inicio1KeyTyped(evt);
            }
        });

        JTextFieldEncargado.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldEncargado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldEncargadoActionPerformed(evt);
            }
        });
        JTextFieldEncargado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldEncargadoKeyTyped(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel13.setText("DATOS PARA RESERVAR");

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addGap(121, 121, 121))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(JTextFieldHora_Fin1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(JTextFieldHora_Inicio1)
                                    .addComponent(JTextFieldEncargado)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JTextFieldCodigo1)
                                    .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(JTextFieldCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(JTextFieldHora_Inicio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16)
                    .addComponent(JTextFieldHora_Fin1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(JTextFieldEncargado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel2.setText("CODIGO AULA:");

        jComboBoxCODIGOAULA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        jComboBoxCODIGOAULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCODIGOAULAActionPerformed(evt);
            }
        });

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("INFORMACION DEL AULA:");

        jLabelNombreHorario.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelNombreHorario.setText("Nombre Horario");

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel28.setText("NUMERO VENTILADORES:");

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel9.setText("HORA FIN:");

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel14.setText("HORA DE INICIO:");

        jLabel29.setText("H:M:S      00:00:00");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setText("CAPACIDAD PIZARRAS:");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelAtributosExtras2.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAtributosExtras2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTextFieldNumeroComputadoras.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldNumeroComputadoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNumeroComputadorasActionPerformed(evt);
            }
        });
        JTextFieldNumeroComputadoras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldNumeroComputadorasKeyTyped(evt);
            }
        });
        jPanelAtributosExtras2.add(JTextFieldNumeroComputadoras, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 260, -1));

        jLabelNumeroComputadora.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelNumeroComputadora.setText("Numero Computadoras:");
        jPanelAtributosExtras2.add(jLabelNumeroComputadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 146, -1));

        jLabelNombrePasante.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelNombrePasante.setText("Nombre Pasante");
        jPanelAtributosExtras2.add(jLabelNombrePasante, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 119, -1));

        JTextFieldNombrePasante.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldNombrePasante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNombrePasanteActionPerformed(evt);
            }
        });
        jPanelAtributosExtras2.add(JTextFieldNombrePasante, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 260, -1));

        jPanel5.add(jPanelAtributosExtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 430, 90));

        jPanelAtributosAulaGrande.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAtributosAulaGrande.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBoxProyector1.setText(" Proyector");
        jCheckBoxProyector1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxProyector1ActionPerformed(evt);
            }
        });
        jPanelAtributosAulaGrande.add(jCheckBoxProyector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        jCheckBoxTela_Proyector1.setText("Tela Proyector");
        jPanelAtributosAulaGrande.add(jCheckBoxTela_Proyector1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel5.add(jPanelAtributosAulaGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 90));

        jPanelAtributosAuditorio.setBackground(new java.awt.Color(255, 255, 255));
        jPanelAtributosAuditorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTextFieldNumeroParlantes.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldNumeroParlantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNumeroParlantesActionPerformed(evt);
            }
        });
        JTextFieldNumeroParlantes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldNumeroParlantesKeyTyped(evt);
            }
        });
        jPanelAtributosAuditorio.add(JTextFieldNumeroParlantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 260, -1));

        jLabelNumeroParlantes.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelNumeroParlantes.setText("Numero Parlantes:");
        jPanelAtributosAuditorio.add(jLabelNumeroParlantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 146, -1));

        JTextFieldNumeroMicrofonos.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldNumeroMicrofonos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNumeroMicrofonosActionPerformed(evt);
            }
        });
        JTextFieldNumeroMicrofonos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldNumeroMicrofonosKeyTyped(evt);
            }
        });
        jPanelAtributosAuditorio.add(JTextFieldNumeroMicrofonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 260, -1));

        jLabelNumeroMicrofonos.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelNumeroMicrofonos.setText("Numero Microfonos:");
        jPanelAtributosAuditorio.add(jLabelNumeroMicrofonos, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 119, -1));

        jPanel5.add(jPanelAtributosAuditorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 90));

        JTextFieldHora_Fin.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldHora_Fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldHora_FinActionPerformed(evt);
            }
        });

        JTextFieldHora_Inicio.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldHora_Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldHora_InicioActionPerformed(evt);
            }
        });
        JTextFieldHora_Inicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldHora_InicioKeyTyped(evt);
            }
        });

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel30.setText("RUTA IMAGEN:");

        JTextFieldNumeroVentiladores.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldNumeroVentiladores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNumeroVentiladoresActionPerformed(evt);
            }
        });
        JTextFieldNumeroVentiladores.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldNumeroVentiladoresKeyTyped(evt);
            }
        });

        JComboBoxTipoAula.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "....", "Aula Pequeño", "Aula Grande", "Laboratorio", "Auditorio" }));
        JComboBoxTipoAula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxTipoAulaItemStateChanged(evt);
            }
        });
        JComboBoxTipoAula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JComboBoxTipoAulaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JComboBoxTipoAulaMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JComboBoxTipoAulaMousePressed(evt);
            }
        });
        JComboBoxTipoAula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxTipoAulaActionPerformed(evt);
            }
        });
        JComboBoxTipoAula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JComboBoxTipoAulaKeyPressed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setText("TIPO AULA");

        jLabel25.setText("H:M:S      00:00:00");

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setText("CAPACIDAD ALUMNO:");

        JTextFieldNombreHorario.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldNombreHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNombreHorarioActionPerformed(evt);
            }
        });
        JTextFieldNombreHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldNombreHorarioKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel8.setText("TIPO VENTILADOR:");

        JTextFieldNumePupitres.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldNumePupitres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldNumePupitresActionPerformed(evt);
            }
        });
        JTextFieldNumePupitres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldNumePupitresKeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel27.setText("NUMERO PUPITRES:");

        jCheckBoxCrearHorario.setText("Crear Horario");
        jCheckBoxCrearHorario.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxCrearHorarioStateChanged(evt);
            }
        });
        jCheckBoxCrearHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxCrearHorarioActionPerformed(evt);
            }
        });

        JComboBoxTipoHorario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...." }));
        JComboBoxTipoHorario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxTipoHorarioItemStateChanged(evt);
            }
        });
        JComboBoxTipoHorario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JComboBoxTipoHorarioMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JComboBoxTipoHorarioMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JComboBoxTipoHorarioMousePressed(evt);
            }
        });
        JComboBoxTipoHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxTipoHorarioActionPerformed(evt);
            }
        });
        JComboBoxTipoHorario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JComboBoxTipoHorarioKeyPressed(evt);
            }
        });

        JTextFieldRutaImagen.setEditable(false);
        JTextFieldRutaImagen.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldRutaImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldRutaImagenActionPerformed(evt);
            }
        });
        JTextFieldRutaImagen.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldRutaImagenKeyTyped(evt);
            }
        });

        jPanelDias.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        jCheckBoxLunes.setText("Lunes");
        jCheckBoxLunes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLunesActionPerformed(evt);
            }
        });

        jCheckBoxMiercoles.setText("Miercoles");
        jCheckBoxMiercoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMiercolesActionPerformed(evt);
            }
        });

        jCheckBoxJueves.setText("Jueves");
        jCheckBoxJueves.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxJuevesActionPerformed(evt);
            }
        });

        jCheckBoxViernes.setText("Viernes");
        jCheckBoxViernes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxViernesActionPerformed(evt);
            }
        });

        jCheckBoxMartes.setText("Martes");
        jCheckBoxMartes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxMartesActionPerformed(evt);
            }
        });

        jCheckBoxSabado.setText("Sabado");
        jCheckBoxSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSabadoActionPerformed(evt);
            }
        });

        jCheckBoxDomingo.setText("Domingo");
        jCheckBoxDomingo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxDomingoActionPerformed(evt);
            }
        });

        jLabel15.setText("Seleccione los días disponible:");

        javax.swing.GroupLayout jPanelDiasLayout = new javax.swing.GroupLayout(jPanelDias);
        jPanelDias.setLayout(jPanelDiasLayout);
        jPanelDiasLayout.setHorizontalGroup(
            jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiasLayout.createSequentialGroup()
                .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDiasLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15))
                    .addGroup(jPanelDiasLayout.createSequentialGroup()
                        .addComponent(jCheckBoxLunes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxMartes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCheckBoxDomingo)
                            .addGroup(jPanelDiasLayout.createSequentialGroup()
                                .addComponent(jCheckBoxMiercoles)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxJueves)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxViernes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxSabado)))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        jPanelDiasLayout.setVerticalGroup(
            jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiasLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLunes)
                    .addComponent(jCheckBoxMartes)
                    .addComponent(jCheckBoxMiercoles)
                    .addComponent(jCheckBoxJueves)
                    .addComponent(jCheckBoxViernes)
                    .addComponent(jCheckBoxSabado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBoxDomingo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JTextFieldCapa_Alumno.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldCapa_Alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldCapa_AlumnoActionPerformed(evt);
            }
        });
        JTextFieldCapa_Alumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldCapa_AlumnoKeyTyped(evt);
            }
        });

        JComboBoxTipoVentilador.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "....", "Automaticos", "Mecanicos" }));
        JComboBoxTipoVentilador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                JComboBoxTipoVentiladorItemStateChanged(evt);
            }
        });
        JComboBoxTipoVentilador.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JComboBoxTipoVentiladorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JComboBoxTipoVentiladorMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JComboBoxTipoVentiladorMousePressed(evt);
            }
        });
        JComboBoxTipoVentilador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboBoxTipoVentiladorActionPerformed(evt);
            }
        });
        JComboBoxTipoVentilador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JComboBoxTipoVentiladorKeyPressed(evt);
            }
        });

        JTextFieldCapa_Pizarra.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldCapa_Pizarra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldCapa_PizarraActionPerformed(evt);
            }
        });
        JTextFieldCapa_Pizarra.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldCapa_PizarraKeyTyped(evt);
            }
        });

        jLabel18.setText("Selecionar Horario:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(JTextFieldCapa_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(JTextFieldCapa_Pizarra, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(JTextFieldNumePupitres, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(JComboBoxTipoVentilador, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(JTextFieldNumeroVentiladores, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(JTextFieldRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel18)
                        .addGap(19, 19, 19)
                        .addComponent(JComboBoxTipoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jCheckBoxCrearHorario))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabelNombreHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(JTextFieldNombreHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanelDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(JTextFieldHora_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel29))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(JTextFieldHora_Fin, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel25))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(JComboBoxTipoAula, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(JTextFieldCapa_Alumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(JTextFieldCapa_Pizarra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldNumePupitres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JComboBoxTipoVentilador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldNumeroVentiladores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldRutaImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(JComboBoxTipoHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxCrearHorario))
                .addGap(7, 7, 7)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNombreHorario, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTextFieldNombreHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jPanelDias, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(JTextFieldHora_Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel29)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(JTextFieldHora_Fin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jLabel25)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JComboBoxTipoAula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(jComboBoxCODIGOAULA, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(29, 29, 29)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxCODIGOAULA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldHora_Fin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldHora_Fin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldHora_Fin1ActionPerformed

    private void JTextFieldHora_Inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldHora_Inicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldHora_Inicio1ActionPerformed

    private void JTextFieldHora_Inicio1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldHora_Inicio1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldHora_Inicio1KeyTyped

    private void JTextFieldCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldCodigo1ActionPerformed

    private void JTextFieldEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldEncargadoActionPerformed

    private void JTextFieldEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldEncargadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldEncargadoKeyTyped

    private void JTextFieldCapa_PizarraKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldCapa_PizarraKeyTyped
        char c = evt.getKeyChar();
        int numerocaracteres = 5;
        if((c<'0'||c>'9'))
        {

            evt.consume();

        }
        if(JTextFieldCapa_Pizarra.getText().length()>= numerocaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_JTextFieldCapa_PizarraKeyTyped

    private void JTextFieldCapa_PizarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldCapa_PizarraActionPerformed
        if((JTextFieldCapa_Pizarra.getText().length()>0)){
            JTextFieldNumePupitres.requestFocus();
            JTextFieldNumePupitres.setEnabled(true);
        }
    }//GEN-LAST:event_JTextFieldCapa_PizarraActionPerformed

    private void JComboBoxTipoVentiladorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JComboBoxTipoVentiladorKeyPressed

    }//GEN-LAST:event_JComboBoxTipoVentiladorKeyPressed

    private void JComboBoxTipoVentiladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxTipoVentiladorActionPerformed
        
    }//GEN-LAST:event_JComboBoxTipoVentiladorActionPerformed

    private void JComboBoxTipoVentiladorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoVentiladorMousePressed

        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoVentiladorMousePressed

    private void JComboBoxTipoVentiladorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoVentiladorMouseEntered

        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoVentiladorMouseEntered

    private void JComboBoxTipoVentiladorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoVentiladorMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoVentiladorMouseClicked

    private void JComboBoxTipoVentiladorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxTipoVentiladorItemStateChanged

    }//GEN-LAST:event_JComboBoxTipoVentiladorItemStateChanged

    private void JTextFieldCapa_AlumnoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldCapa_AlumnoKeyTyped
        char c = evt.getKeyChar();
        int numerocaracteres = 5;
        if((c<'0'||c>'9'))
        {

            evt.consume();

        }
        if(JTextFieldCapa_Alumno.getText().length()>= numerocaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_JTextFieldCapa_AlumnoKeyTyped

    private void JTextFieldCapa_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldCapa_AlumnoActionPerformed
        if((JTextFieldCapa_Alumno.getText().length()>0)){
            JTextFieldCapa_Pizarra.requestFocus();
            JTextFieldCapa_Pizarra.setEnabled(true);
        }
    }//GEN-LAST:event_JTextFieldCapa_AlumnoActionPerformed

    private void jCheckBoxDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDomingoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxDomingoActionPerformed

    private void jCheckBoxSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSabadoActionPerformed

    private void jCheckBoxMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMartesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMartesActionPerformed

    private void jCheckBoxViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxViernesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxViernesActionPerformed

    private void jCheckBoxJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxJuevesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxJuevesActionPerformed

    private void jCheckBoxMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMiercolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMiercolesActionPerformed

    private void jCheckBoxLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLunesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxLunesActionPerformed

    private void JTextFieldRutaImagenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldRutaImagenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldRutaImagenKeyTyped

    private void JTextFieldRutaImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldRutaImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldRutaImagenActionPerformed

    private void JComboBoxTipoHorarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioKeyPressed

    private void JComboBoxTipoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioActionPerformed

    }//GEN-LAST:event_JComboBoxTipoHorarioActionPerformed

    private void JComboBoxTipoHorarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioMousePressed

    private void JComboBoxTipoHorarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioMouseEntered

    private void JComboBoxTipoHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioMouseClicked

    private void JComboBoxTipoHorarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioItemStateChanged

    private void jCheckBoxCrearHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCrearHorarioActionPerformed

    }//GEN-LAST:event_jCheckBoxCrearHorarioActionPerformed

    private void jCheckBoxCrearHorarioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxCrearHorarioStateChanged

    }//GEN-LAST:event_jCheckBoxCrearHorarioStateChanged

    private void JTextFieldNumePupitresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNumePupitresKeyTyped
        char c = evt.getKeyChar();
        int numerocaracteres = 5;
        if((c<'0'||c>'9'))
        {

            evt.consume();

        }
        if(JTextFieldNumePupitres.getText().length()>= numerocaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_JTextFieldNumePupitresKeyTyped

    private void JTextFieldNumePupitresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumePupitresActionPerformed
        if((JTextFieldNumePupitres.getText().length()>0)){
            JComboBoxTipoVentilador.requestFocus();
            JComboBoxTipoVentilador.setEnabled(true);
        }
    }//GEN-LAST:event_JTextFieldNumePupitresActionPerformed

    private void JTextFieldNombreHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNombreHorarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNombreHorarioKeyTyped

    private void JTextFieldNombreHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNombreHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNombreHorarioActionPerformed

    private void JComboBoxTipoAulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaKeyPressed

    private void JComboBoxTipoAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaActionPerformed

    }//GEN-LAST:event_JComboBoxTipoAulaActionPerformed

    private void JComboBoxTipoAulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaMousePressed

    private void JComboBoxTipoAulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaMouseEntered

    private void JComboBoxTipoAulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaMouseClicked

    private void JComboBoxTipoAulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaItemStateChanged

    private void JTextFieldNumeroVentiladoresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNumeroVentiladoresKeyTyped
        char c = evt.getKeyChar();
        int numerocaracteres = 5;
        if((c<'0'||c>'9'))
        {

            evt.consume();

        }
        if(JTextFieldNumeroVentiladores.getText().length()>= numerocaracteres){
            evt.consume();
        }
    }//GEN-LAST:event_JTextFieldNumeroVentiladoresKeyTyped

    private void JTextFieldNumeroVentiladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumeroVentiladoresActionPerformed
        if((JTextFieldNumeroVentiladores.getText().length()>0)){
            JComboBoxTipoAula.requestFocus();
            JComboBoxTipoAula.setEnabled(true);
        }
    }//GEN-LAST:event_JTextFieldNumeroVentiladoresActionPerformed

    private void JTextFieldHora_InicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldHora_InicioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldHora_InicioKeyTyped

    private void JTextFieldHora_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldHora_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldHora_InicioActionPerformed

    private void JTextFieldHora_FinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldHora_FinActionPerformed

    }//GEN-LAST:event_JTextFieldHora_FinActionPerformed

    private void JTextFieldNombrePasanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNombrePasanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNombrePasanteActionPerformed

    private void JTextFieldNumeroComputadorasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNumeroComputadorasKeyTyped
        char c = evt.getKeyChar();
        int numerocaracteres = 2;
        if((c<'0'||c>'9'))
        {

            evt.consume();

        }
        if(JTextFieldNumeroComputadoras.getText().length()>= numerocaracteres){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNumeroComputadorasKeyTyped

    private void JTextFieldNumeroComputadorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumeroComputadorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNumeroComputadorasActionPerformed

    private void JTextFieldNumeroMicrofonosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNumeroMicrofonosKeyTyped
        char c = evt.getKeyChar();
        int numerocaracteres = 2;
        if((c<'0'||c>'9'))
        {

            evt.consume();

        }
        if(JTextFieldNumeroMicrofonos.getText().length()>= numerocaracteres){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNumeroMicrofonosKeyTyped

    private void JTextFieldNumeroMicrofonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumeroMicrofonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNumeroMicrofonosActionPerformed

    private void JTextFieldNumeroParlantesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNumeroParlantesKeyTyped
        char c = evt.getKeyChar();
        int numerocaracteres = 2;
        if((c<'0'||c>'9'))
        {

            evt.consume();

        }
        if(JTextFieldNumeroParlantes.getText().length()>= numerocaracteres){
            evt.consume();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNumeroParlantesKeyTyped

    private void JTextFieldNumeroParlantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumeroParlantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNumeroParlantesActionPerformed

    private void jCheckBoxProyector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxProyector1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxProyector1ActionPerformed

    private void jComboBoxCODIGOAULAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCODIGOAULAActionPerformed
        String validacion = jComboBoxCODIGOAULA.getSelectedItem().toString();
        
        if(validacion.equals("...")){
            JOptionPane.showMessageDialog(null,"Por favor, Seleccione un Codigo Aula");
            deshabilitar_Reservacion();
        }
        else{
            cargarTablaReservaciones();
            JTextFieldCodigo1.requestFocus();
            cargarEditado(validacion);
            habilitar_Reservacion();

        }



    }//GEN-LAST:event_jComboBoxCODIGOAULAActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(validacionHorarioAula() == 1){
            String codigo_reservacion = JTextFieldCodigo1.getText();
        int hora_inicio_reser = Integer.parseInt(JTextFieldHora_Inicio1.getText());
        int hora_fin_reser  = Integer.parseInt(JTextFieldHora_Fin1.getText());
        
        
        int año = jDateChooser1.getCalendar().get(Calendar.YEAR);
int mes = jDateChooser1.getCalendar().get(Calendar.MONTH) + 1;
int dia = jDateChooser1.getCalendar().get(Calendar.DAY_OF_MONTH);

        
        String encargado = JTextFieldEncargado.getText();
        int id_codigo = id;
       String fecha = Integer.toString(año)+"-"+Integer.toString(mes)+"-"+Integer.toString(dia);
       String dia_letra = getDiaSemana(fecha);
          System.out.println("valor de fecha "+dia_letra);
          Reservacion obj_reser = new Reservacion();
          obj_reser.setId_aula(id);
          obj_reser.setDia(dia);
          obj_reser.setMes(mes);
          obj_reser.setAño(año);
          obj_reser.setDia_letra(dia_letra);
          obj_reser.setEncargado(encargado);
          obj_reser.setCodigo(codigo_reservacion);
          obj_reser.setHora_fin(hora_fin_reser);
          obj_reser.setHora_inicio(hora_inicio_reser);
          
          aulaDAO obj_Aula = new aulaDAO();
          
          if(validarDia(dia_letra,obj_Aula.consultaAulas1(Integer.toString(id_codigo))) == 1){
              
                      reservacionDAO obj_reser_dao = new reservacionDAO();
                      if(obj_reser_dao.validacionReservacionPermitida(obj_reser) == 1){
                          if(obj_reser_dao.guardarReservacion(obj_reser)>0)
                          JOptionPane.showMessageDialog(null, "EXITO AL GUARDAR RESERVACION");
                          cargarTablaReservaciones();
                      }else{
                          JOptionPane.showMessageDialog(null, "YA EXISTE UNA RESERVACIÓN EN ESE HORARIO");
                      }

          }
          else{
              JOptionPane.showMessageDialog(null, "ERROR: DÍA NO PERMITIDO PARA REGISTRAR");
          }

        
        }
        else{
            JOptionPane.showMessageDialog(null, "Ingrese un Horario permitido");
        }
        
        
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int i = JOptionPane.showConfirmDialog((Component)evt.getSource(),
                "Esta Seguro de Eliminar una Reservacion?", "Mensaje",
                JOptionPane.YES_NO_OPTION);
        
        if(i==JOptionPane.YES_NO_OPTION){   
                EliminarReservacion();
        }

    }//GEN-LAST:event_jButton2ActionPerformed
    private void EliminarReservacion(){
    reservacionDAO OBJ  = new reservacionDAO();
    int fila = jTableReservacion.getSelectedRow();
   if( OBJ.eliminarPorId(Integer.parseInt( jTableReservacion.getValueAt(fila, 0).toString()))==1){
       JOptionPane.showMessageDialog(null, "Eliminacion correcta de RESERVACION ");
       cargarTablaReservaciones();
   }else{
              JOptionPane.showMessageDialog(null, "ERROR, No se puede eliminar una Reservacion");

   }
}
    private void cargarTablaReservaciones(){
        reservacionDAO reservdao = new reservacionDAO();
        aulaDAO obj = new aulaDAO ();
        lista = reservdao.consultaAulasPorTipo(Integer.toString(obj.consultaId(jComboBoxCODIGOAULA.getSelectedItem().toString())));
        
        DefaultTableModel modelo = new DefaultTableModel();
        String[] columnas = {"ID","ID_AULA","Codigo","Encargado","Hora_Inicio","Hora_Fin","Dia","Fecha"};
        modelo.setColumnIdentifiers(columnas);
        Object [] producto = new Object[8];
        for(int i = 0; i <lista.size(); i++){
            producto[0] = lista.get(i).getId_reservacion();
            producto[1] = lista.get(i).getId_aula();
            producto[2] = lista.get(i).getCodigo();
            producto[3] = lista.get(i).getEncargado();
            producto[4] = lista.get(i).getHora_inicio();
            producto[5] = lista.get(i).getHora_fin();
            producto[6] = lista.get(i).getDia_letra();
            producto[7] = lista.get(i).getDia()+"-"+lista.get(i).getMes()+"-"+lista.get(i).getAño();


            modelo.addRow(producto);

        }
        //establecer el modelo de al JTABLE
        jTableReservacion.setModel(modelo);
    }
    
    private int validarDia(String dia,Aula au){
        int resul = 0;
            if(dia.equals("Lunes")){
                if(au.getDias().isLunes() == true){
                    return 1;
                }
            }
            else  if(dia.equals("Martes")){
                if(au.getDias().isMartes()== true){
                    return 1;
                }
            }
            else  if(dia.equals("Miercoles")){
                if(au.getDias().isMiercoles()== true){
                    return 1;
                }
            }
            else  if(dia.equals("Jueves")){
                if(au.getDias().isJueves()== true){
                    return 1;
                }
            }
            else  if(dia.equals("Viernes")){
                if(au.getDias().isViernes()== true){
                    return 1;
                }
            }
            else  if(dia.equals("Sabado")){
                if(au.getDias().isSabado()== true){
                    return 1;
                }
            }
            else  if(dia.equals("Domingo")){
                if(au.getDias().isDomingo()== true){
                    return 1;
                }
            }
            
        return resul;
    }
    private String getDiaSemana(String fecha) {
        String Valor_dia = null;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaActual = null;
        try {
            fechaActual = df.parse(fecha);
        } catch (ParseException e) {
            System.err.println("No se ha podido parsear la fecha.");
            e.printStackTrace();
        }
        GregorianCalendar fechaCalendario = new GregorianCalendar();
        fechaCalendario.setTime(fechaActual);
        int diaSemana = fechaCalendario.get(Calendar.DAY_OF_WEEK);
        if (diaSemana == 1) {
            Valor_dia = "Domingo";
        } else if (diaSemana == 2) {
            Valor_dia = "Lunes";
        } else if (diaSemana == 3) {
            Valor_dia = "Martes";
        } else if (diaSemana == 4) {
            Valor_dia = "Miercoles";
        } else if (diaSemana == 5) {
            Valor_dia = "Jueves";
        } else if (diaSemana == 6) {
            Valor_dia = "Viernes";
        } else if (diaSemana == 7) {
            Valor_dia = "Sabado";
        }
        return Valor_dia;
    }
    
    
   
    private int validacionHorarioAula(){
        int respuesta = 1;
        int hora_inicio_reser = Integer.parseInt(JTextFieldHora_Inicio1.getText());
        int hora_fin_reser  = Integer.parseInt(JTextFieldHora_Fin1.getText());
        int hora_inicio_aula = Integer.parseInt(JTextFieldHora_Inicio.getText());
        int hora_fin_aula = Integer.parseInt(JTextFieldHora_Fin.getText());
        
        if(hora_inicio_reser < hora_inicio_aula  || hora_inicio_reser > hora_fin_aula) {
            return 0;
        }
        else if(hora_fin_reser < hora_inicio_aula || hora_inicio_reser > hora_fin_aula){
            return 0;
        }
        

            return respuesta;
    }
    private void cargarEditado(String codigo){
     objAulaDao = new aulaDAO();
         ArrayList<Aula> lista = null ;
                        lista = objAulaDao.consultaAulas(codigo);
          if(lista == null){
              JOptionPane.showMessageDialog(null, "Error al cargar Datos, no Existe Codigo");
          }    else{
                      cargarComponentes(lista);

          } 
                
}
    private void cargarComponentes(ArrayList<Aula> lista){
            Image imagenPresentar=null;
     for(int i = 0; i <lista.size(); i++){
         if(lista.get(i).getDias() == null){
             System.out.println("esta vacio");
         }
         System.out.println("tipo de aula"+lista.get(i).toString());
         id = lista.get(i).getId();
         this.JComboBoxTipoHorario.setSelectedItem(lista.get(i).getDias().getCodigo());
        this.JComboBoxTipoVentilador.setSelectedItem(lista.get(i).getTipo_ventilacion());
        this.JTextFieldCapa_Alumno.setText(Integer.toString(lista.get(i).getCapacidad_alumnos()));
        this.JTextFieldCapa_Pizarra.setText(Integer.toString(lista.get(i).getCantidad_Pizarras()));
        this.JTextFieldHora_Fin.setText(Integer.toString(lista.get(i).getDias().getHora_fin()));
        this.JTextFieldHora_Inicio.setText(Integer.toString(lista.get(i).getDias().getHora_inicio()));
        this.JTextFieldNombreHorario.setText((lista.get(i).getDias().getCodigo()));
        this.JTextFieldNombrePasante.setText(lista.get(i).getNombrePasante());
        this.JTextFieldNumePupitres.setText(Integer.toString(lista.get(i).getNumeros_pupitres()));
        this.JTextFieldNumeroComputadoras.setText(Integer.toString(lista.get(i).getNumero_Computadoras()));
        this.JTextFieldNumeroVentiladores.setText(Integer.toString(lista.get(i).getCantidad_ventilacion()));
        this.JTextFieldRutaImagen.setText(lista.get(i).getRuta_imagen());
         this.jCheckBoxDomingo.setSelected((lista.get(i).getDias().isDomingo()));
        this.jCheckBoxJueves.setSelected((lista.get(i).getDias().isJueves()));
        this.jCheckBoxLunes.setSelected((lista.get(i).getDias().isLunes()));
        this.jCheckBoxMartes.setSelected((lista.get(i).getDias().isMartes()));
        this.jCheckBoxMiercoles.setSelected((lista.get(i).getDias().isMiercoles()));
        this.jCheckBoxSabado.setSelected((lista.get(i).getDias().isSabado()));
        this.jCheckBoxViernes.setSelected((lista.get(i).getDias().isViernes()));
        this.JComboBoxTipoAula.setSelectedItem((lista.get(i).getTipoAula()));
        if(lista.get(i).getTipoAula().equals("Laboratorio")==true){
        jPanelAtributosExtras2.setVisible(true);
        jPanelAtributosAuditorio.setVisible(false);
        jPanelAtributosAulaGrande.setVisible(false);
        JTextFieldNombrePasante.setText((lista.get(i).getNombrePasante()));
        JTextFieldNumeroComputadoras.setText((Integer.toString(lista.get(i).getNumero_Computadoras())));

         }
         else if(lista.get(i).getTipoAula().equals("Aula Grande")==true){
             jPanelAtributosExtras2.setVisible(false);
        jPanelAtributosAuditorio.setVisible(false);
         jPanelAtributosAulaGrande.setVisible(true);
         jCheckBoxProyector1.setSelected((lista.get(i).isProyector()));
                  jCheckBoxTela_Proyector1.setSelected((lista.get(i).isTela_Proyector()));

         }
         else  if(lista.get(i).getTipoAula().equals("Auditorio")==true){
             jPanelAtributosExtras2.setVisible(false);
        jPanelAtributosAuditorio.setVisible(true);
         jPanelAtributosAulaGrande.setVisible(false);
                 JTextFieldNumeroParlantes.setText(Integer.toString(lista.get(i).getCantidad_Parlantes()));
        JTextFieldNumeroMicrofonos.setText(Integer.toString(lista.get(i).getCantidad_Microfonos()));

         }
         else{
             jPanelAtributosExtras2.setVisible(false);
        jPanelAtributosAuditorio.setVisible(false);
         jPanelAtributosAulaGrande.setVisible(false);
         }
        
        
      
       
             
                      
       
        }
       
   }
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameNuevaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameNuevaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameNuevaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameNuevaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameNuevaReservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox JComboBoxTipoAula;
    private javax.swing.JComboBox JComboBoxTipoHorario;
    private javax.swing.JComboBox JComboBoxTipoVentilador;
    private javax.swing.JTextField JTextFieldCapa_Alumno;
    private javax.swing.JTextField JTextFieldCapa_Pizarra;
    public javax.swing.JTextField JTextFieldCodigo1;
    public javax.swing.JTextField JTextFieldEncargado;
    private javax.swing.JTextField JTextFieldHora_Fin;
    public javax.swing.JTextField JTextFieldHora_Fin1;
    private javax.swing.JTextField JTextFieldHora_Inicio;
    public javax.swing.JTextField JTextFieldHora_Inicio1;
    private javax.swing.JTextField JTextFieldNombreHorario;
    private javax.swing.JTextField JTextFieldNombrePasante;
    private javax.swing.JTextField JTextFieldNumePupitres;
    private javax.swing.JTextField JTextFieldNumeroComputadoras;
    private javax.swing.JTextField JTextFieldNumeroMicrofonos;
    private javax.swing.JTextField JTextFieldNumeroParlantes;
    private javax.swing.JTextField JTextFieldNumeroVentiladores;
    private javax.swing.JTextField JTextFieldRutaImagen;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBoxCrearHorario;
    private javax.swing.JCheckBox jCheckBoxDomingo;
    private javax.swing.JCheckBox jCheckBoxJueves;
    private javax.swing.JCheckBox jCheckBoxLunes;
    private javax.swing.JCheckBox jCheckBoxMartes;
    private javax.swing.JCheckBox jCheckBoxMiercoles;
    private javax.swing.JCheckBox jCheckBoxProyector1;
    private javax.swing.JCheckBox jCheckBoxSabado;
    private javax.swing.JCheckBox jCheckBoxTela_Proyector1;
    private javax.swing.JCheckBox jCheckBoxViernes;
    private javax.swing.JComboBox<String> jComboBoxCODIGOAULA;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelNombreHorario;
    private javax.swing.JLabel jLabelNombrePasante;
    private javax.swing.JLabel jLabelNumeroComputadora;
    private javax.swing.JLabel jLabelNumeroMicrofonos;
    private javax.swing.JLabel jLabelNumeroParlantes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAtributosAuditorio;
    private javax.swing.JPanel jPanelAtributosAulaGrande;
    private javax.swing.JPanel jPanelAtributosExtras2;
    private javax.swing.JPanel jPanelDias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReservacion;
    // End of variables declaration//GEN-END:variables
}
