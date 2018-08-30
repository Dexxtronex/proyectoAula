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
        initComponents();        setLocationRelativeTo(null);

        deshabilitarPanelLaboratorio();
        jPanelAtributosExtras2.setEnabled(false);
        jPanelAtributosAuditorio.setEnabled(false);
        jPanelAtributosAulaGrande.setEnabled(false);
        jComboBoxCODIGOAULA.requestFocus();
        jPanel5.setEnabled(false);
         bloqueoCamposTexto();
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
        jComboBoxCODIGOAULA = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableReservacion = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        JTextFieldEncargado = new javax.swing.JTextField();
        JTextFieldHora_Fin1 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        JTextFieldHora_Inicio1 = new javax.swing.JTextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        JTextFieldCodigo1 = new javax.swing.JTextField();
        jLabelNombreHorario = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
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
        JTextFieldNumeroVentiladores = new javax.swing.JTextField();
        JComboBoxTipoAula = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        JTextFieldNombreHorario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTextFieldNumePupitres = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jCheckBoxCrearHorario = new javax.swing.JCheckBox();
        JComboBoxTipoHorario = new javax.swing.JComboBox();
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
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jComboBoxCODIGOAULA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "..." }));
        jComboBoxCODIGOAULA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCODIGOAULAActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBoxCODIGOAULA, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 179, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 459, 118));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 180, -1));

        jLabel17.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel17.setText("ENCARGADO:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, 119, -1));

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
        getContentPane().add(JTextFieldEncargado, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 250, -1));

        JTextFieldHora_Fin1.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldHora_Fin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldHora_Fin1ActionPerformed(evt);
            }
        });
        JTextFieldHora_Fin1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTextFieldHora_Fin1KeyTyped(evt);
            }
        });
        getContentPane().add(JTextFieldHora_Fin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 250, -1));

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel16.setText("HORA FIN:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 119, -1));

        jLabel10.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel10.setText("HORA INICIO:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 119, -1));

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
        getContentPane().add(JTextFieldHora_Inicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 440, 250, -1));
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 252, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel12.setText("FECHA:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 119, -1));

        jLabel11.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel11.setText("COD. Reservacion:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 117, -1));

        JTextFieldCodigo1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextFieldCodigo1.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldCodigo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldCodigo1ActionPerformed(evt);
            }
        });
        getContentPane().add(JTextFieldCodigo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, 252, 29));

        jLabelNombreHorario.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelNombreHorario.setText("Nombre Horario");
        getContentPane().add(jLabelNombreHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 150, 20));

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel28.setText("NUMERO VENTILADORES:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 270, 150, 10));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel9.setText("HORA FIN:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 450, 119, -1));

        jLabel14.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel14.setText("HORA DE INICIO:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 119, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setText("CAPACIDAD PIZARRAS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 160, -1));

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

        jPanel5.add(jPanelAtributosExtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 90));

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

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 420, -1));

        JTextFieldHora_Fin.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldHora_Fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldHora_FinActionPerformed(evt);
            }
        });
        getContentPane().add(JTextFieldHora_Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 450, 260, -1));

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
        getContentPane().add(JTextFieldHora_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 420, 260, -1));

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
        getContentPane().add(JTextFieldNumeroVentiladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 270, 250, -1));

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
        getContentPane().add(JComboBoxTipoAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 470, 250, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setText("TIPO AULA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, 120, 30));

        jLabel6.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel6.setText("CAPACIDAD ALUMNO:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 150, 150, -1));

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
        getContentPane().add(JTextFieldNombreHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 330, 250, -1));

        jLabel8.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel8.setText("TIPO VENTILADOR:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 120, 30));

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
        getContentPane().add(JTextFieldNumePupitres, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 250, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel27.setText("NUMERO PUPITRES:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 130, 10));

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
        getContentPane().add(jCheckBoxCrearHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 300, -1, -1));

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
        getContentPane().add(JComboBoxTipoHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 200, -1));

        jPanelDias.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDias.setForeground(new java.awt.Color(51, 51, 51));

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

        jCheckBoxViernes.setText("Vie");
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

        jCheckBoxSabado.setText("Sab");
        jCheckBoxSabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxSabadoActionPerformed(evt);
            }
        });

        jCheckBoxDomingo.setText("Dom");
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
                        .addComponent(jCheckBoxMiercoles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxJueves)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxViernes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxSabado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxDomingo)))
                .addContainerGap(41, Short.MAX_VALUE))
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
                    .addComponent(jCheckBoxSabado)
                    .addComponent(jCheckBoxDomingo))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 360, 410, 60));

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
        getContentPane().add(JTextFieldCapa_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 250, -1));

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
        getContentPane().add(JComboBoxTipoVentilador, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 240, 250, -1));

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
        getContentPane().add(JTextFieldCapa_Pizarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 180, 250, -1));

        jLabel18.setText("Selecionar Horario:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 300, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fondos/from_Nueva_Reservacion_ProyectoPOOParcial2.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldHora_Fin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldHora_Fin1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldHora_Fin1ActionPerformed

    private void JTextFieldHora_Inicio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldHora_Inicio1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldHora_Inicio1ActionPerformed

    private void JTextFieldHora_Inicio1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldHora_Inicio1KeyTyped
      char c = evt.getKeyChar();
 int numerocaracteres = 2;
 if((c<'0'||c>'9'))
        {          

            evt.consume();

        } 
 if(JTextFieldHora_Inicio1.getText().length()>= numerocaracteres){
    evt.consume(); 
 }
    }//GEN-LAST:event_JTextFieldHora_Inicio1KeyTyped

    private void JTextFieldCodigo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldCodigo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldCodigo1ActionPerformed

    private void JTextFieldEncargadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldEncargadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldEncargadoActionPerformed

    private void JTextFieldEncargadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldEncargadoKeyTyped
   
          char c1 = evt.getKeyChar();
 int numerocaracteres = 50;
 
 if(JTextFieldEncargado.getText().length()>= numerocaracteres){
     
              evt.consume();
   
          
 }   

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
      try{
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

        
       
            
                
                       
                            
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese un Horario permitido");
        }
        
        
           } catch(Exception o ){
                
               JOptionPane.showMessageDialog(null,"Ingrese todos los campos");
             }     
                
        

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int fila = jTableReservacion.getSelectedRow();
        if(fila <0){
            JOptionPane.showMessageDialog(null,"Selecione una reservacion en la lista para eliminar");
        }else{
             int i = JOptionPane.showConfirmDialog((Component)evt.getSource(),
                "Esta Seguro de Eliminar una Reservacion?", "Mensaje",
                JOptionPane.YES_NO_OPTION);
        
        if(i==JOptionPane.YES_NO_OPTION){   
               
            EliminarReservacion();
        }
        }
       

    }//GEN-LAST:event_jButton2ActionPerformed

    private void JTextFieldHora_Fin1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldHora_Fin1KeyTyped
      char c = evt.getKeyChar();
 int numerocaracteres = 2;
 if((c<'0'||c>'9'))
        {          

            evt.consume();

        } 
 if(JTextFieldHora_Fin1.getText().length()>= numerocaracteres){
    evt.consume(); 
 }


    }//GEN-LAST:event_JTextFieldHora_Fin1KeyTyped
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
        else if( hora_fin_reser == hora_inicio_reser ){
            return 0;
        }
        else if( hora_fin_reser <= hora_inicio_reser ){
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
         this.jCheckBoxDomingo.setSelected((lista.get(i).getDias().isDomingo()));
        this.jCheckBoxJueves.setSelected((lista.get(i).getDias().isJueves()));
        this.jCheckBoxLunes.setSelected((lista.get(i).getDias().isLunes()));
        this.jCheckBoxMartes.setSelected((lista.get(i).getDias().isMartes()));
        this.jCheckBoxMiercoles.setSelected((lista.get(i).getDias().isMiercoles()));
        this.jCheckBoxSabado.setSelected((lista.get(i).getDias().isSabado()));
        this.jCheckBoxViernes.setSelected((lista.get(i).getDias().isViernes()));
        this.JComboBoxTipoAula.setSelectedItem((lista.get(i).getTipoAula()));
        System.out.println("tipo de aula"+lista.get(i).toString());

        if(lista.get(i).getTipoAula().equals("Laboratorio")==true){
        jPanelAtributosAuditorio.setVisible(false);
        jPanelAtributosAulaGrande.setVisible(false);
                jPanelAtributosExtras2.setVisible(true);

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
         jPanelAtributosAulaGrande.setVisible(false);
                 jPanelAtributosAuditorio.setVisible(true);

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
    public javax.swing.JComboBox JComboBoxTipoAula;
    public javax.swing.JComboBox JComboBoxTipoHorario;
    public javax.swing.JComboBox JComboBoxTipoVentilador;
    public javax.swing.JTextField JTextFieldCapa_Alumno;
    public javax.swing.JTextField JTextFieldCapa_Pizarra;
    public javax.swing.JTextField JTextFieldCodigo1;
    public javax.swing.JTextField JTextFieldEncargado;
    public javax.swing.JTextField JTextFieldHora_Fin;
    public javax.swing.JTextField JTextFieldHora_Fin1;
    public javax.swing.JTextField JTextFieldHora_Inicio;
    public javax.swing.JTextField JTextFieldHora_Inicio1;
    public javax.swing.JTextField JTextFieldNombreHorario;
    public javax.swing.JTextField JTextFieldNombrePasante;
    public javax.swing.JTextField JTextFieldNumePupitres;
    public javax.swing.JTextField JTextFieldNumeroComputadoras;
    public javax.swing.JTextField JTextFieldNumeroMicrofonos;
    public javax.swing.JTextField JTextFieldNumeroParlantes;
    public javax.swing.JTextField JTextFieldNumeroVentiladores;
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
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    public static javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel4;
    public static javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JLabel jLabelNombreHorario;
    private javax.swing.JLabel jLabelNombrePasante;
    private javax.swing.JLabel jLabelNumeroComputadora;
    private javax.swing.JLabel jLabelNumeroMicrofonos;
    private javax.swing.JLabel jLabelNumeroParlantes;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanelAtributosAuditorio;
    private javax.swing.JPanel jPanelAtributosAulaGrande;
    private javax.swing.JPanel jPanelAtributosExtras2;
    private javax.swing.JPanel jPanelDias;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableReservacion;
    // End of variables declaration//GEN-END:variables
}
