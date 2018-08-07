/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import modelo.entidadesDTO.Aula;
import modelo.entidadesDTO.aulaAuditorio;
import modelo.entidadesDTO.aulaGrande;
import modelo.entidadesDTO.aulaLaboratorio;
import modelo.entidadesDTO.aulaPequeña;
import modelo.entidadesDTO.paquetedias;
import modelo.operacionesDAO.aulaDAO;
import modelo.operacionesDAO.paquetediasDAO;


/**
 *
 * @author Dexx
 */
public class JFrameNuevaAula extends javax.swing.JFrame {
    private JPanelListadoAulas JFrameListar; 
    /**
     * Creates new form JFrameNuevaAula
     */
    paquetediasDAO objPaqueteDao= null; 
    ImageIcon image = null;
    Aula objAula = null;
    paquetedias objPaque = null;
    aulaDAO objAulaDao = null;
    public JFrameNuevaAula() {
        initComponents();
        image = new ImageIcon();
        cargarComboBoxPaqueteDias();
        //deshabilitarPanelLaboratorio();
        jLabelNombreHorario.setVisible(false);
        JTextFieldNombreHorario.setVisible(false);
        bloqueoCamposTexto();
        JComboBoxTipoHorario.setEnabled(true);
        jButton1.setEnabled(false);
        jPanelAtributosExtras2.setVisible(false);
        jPanelAtributosAuditorio.setVisible(false);
         jPanelAtributosAulaGrande.setVisible(false);

        
    }
   private void bloqueoCamposTexto(){
       this.JComboBoxTipoAula.setEnabled(false); 
        this.JComboBoxTipoHorario.setEnabled(false);
        this.JComboBoxTipoVentilador.setEnabled(false);
        this.JTextFieldCapa_Alumno.setEnabled(false);
        this.JTextFieldCapa_Pizarra.setEnabled(false);
        this.JTextFieldCodigo.setEnabled(true);
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
    
    private void habilitarPanelLaboratorio(){
        jPanelAtributosExtras2.setVisible(true);
        jLabelNombrePasante.setVisible(true);
        jLabelNumeroComputadora.setVisible(true);
        JTextFieldNumeroComputadoras.setVisible(true);
        JTextFieldNombrePasante.setVisible(true);
        JTextFieldNumeroComputadoras.setText("");
        JTextFieldNombrePasante.setText("");
        JTextFieldNumeroComputadoras.setEnabled(true);
        JTextFieldNombrePasante.setEnabled(true);

    }
    private void cargarComboBoxPaqueteDias(){
        deshabilitarJCheckBoxTipoHorario();
        objPaqueteDao = new paquetediasDAO();
        String[] array = new String[objPaqueteDao.Cargar().size()];
        ArrayList< paquetedias> obj = objPaqueteDao.Cargar();
        for (int i = 0; i < array.length; i++) {
            array[i] = obj.get(i).getCodigo();
            JComboBoxTipoHorario.addItem(obj.get(i).getCodigo());
        }

    }

    public JPanelListadoAulas getJFrameListar() {
        return JFrameListar;
    }

    public void setJFrameListar(JPanelListadoAulas JFrameListar) {
        this.JFrameListar = JFrameListar;
    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JTextFieldCodigo = new javax.swing.JTextField();
        JTextFieldCapa_Alumno = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        JTextFieldHora_Fin = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        JComboBoxTipoVentilador = new javax.swing.JComboBox();
        JTextFieldNumePupitres = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        JTextFieldCapa_Pizarra = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        JTextFieldNumeroVentiladores = new javax.swing.JTextField();
        jPanelDias = new javax.swing.JPanel();
        jCheckBoxLunes = new javax.swing.JCheckBox();
        jCheckBoxMiercoles = new javax.swing.JCheckBox();
        jCheckBoxJueves = new javax.swing.JCheckBox();
        jCheckBoxViernes = new javax.swing.JCheckBox();
        jCheckBoxMartes = new javax.swing.JCheckBox();
        jCheckBoxSabado = new javax.swing.JCheckBox();
        jCheckBoxDomingo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        JTextFieldHora_Inicio = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        JTextFieldRutaImagen = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        JComboBoxTipoAula = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jCheckBoxCrearHorario = new javax.swing.JCheckBox();
        JComboBoxTipoHorario = new javax.swing.JComboBox();
        JTextFieldNombreHorario = new javax.swing.JTextField();
        jLabelNombreHorario = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanelAtributosAulaGrande = new javax.swing.JPanel();
        jCheckBoxProyector1 = new javax.swing.JCheckBox();
        jCheckBoxTela_Proyector1 = new javax.swing.JCheckBox();
        jPanelAtributosAuditorio = new javax.swing.JPanel();
        JTextFieldNumeroParlantes = new javax.swing.JTextField();
        jLabelNumeroParlantes = new javax.swing.JLabel();
        JTextFieldNumeroMicrofonos = new javax.swing.JTextField();
        jLabelNumeroMicrofonos = new javax.swing.JLabel();
        jPanelAtributosExtras2 = new javax.swing.JPanel();
        JTextFieldNumeroComputadoras = new javax.swing.JTextField();
        jLabelNumeroComputadora = new javax.swing.JLabel();
        jLabelNombrePasante = new javax.swing.JLabel();
        JTextFieldNombrePasante = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 26)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 153, 0));
        jLabel1.setText("CREACION AULA");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 340, 42));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel2.setText("CÓDIGO:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 56, 15));

        JTextFieldCodigo.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        JTextFieldCodigo.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldCodigoActionPerformed(evt);
            }
        });
        getContentPane().add(JTextFieldCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 48, 250, 30));

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
        getContentPane().add(JTextFieldCapa_Alumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 250, -1));

        jLabel14.setBackground(new java.awt.Color(148, 148, 148));
        jLabel14.setForeground(new java.awt.Color(140, 135, 135));
        jLabel14.setFocusCycleRoot(true);
        jLabel14.setFocusTraversalPolicyProvider(true);
        jLabel14.setOpaque(true);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 50, 230, 140));

        jLabel15.setText("INSERTAR IMAGEN");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 200, -1, -1));

        jLabel25.setText("H:M:S      00:00:00");
        getContentPane().add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, -1, -1));

        JTextFieldHora_Fin.setDisabledTextColor(new java.awt.Color(1, 1, 1));
        JTextFieldHora_Fin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldHora_FinActionPerformed(evt);
            }
        });
        getContentPane().add(JTextFieldHora_Fin, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 260, -1));

        jLabel9.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel9.setText("HORA FIN:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 119, -1));

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel4.setText("TIPO VENTILADOR:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, 120, 30));

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
        getContentPane().add(JComboBoxTipoVentilador, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 250, -1));

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
        getContentPane().add(JTextFieldNumePupitres, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 250, -1));

        jLabel27.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel27.setText("NUMERO PUPITRES:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 130, 10));

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
        getContentPane().add(JTextFieldCapa_Pizarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 250, -1));

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel5.setText("CAPACIDAD PIZARRAS:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 160, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel3.setText("CAPACIDAD ALUMNO:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 150, -1));

        jLabel28.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel28.setText("NUMERO VENTILADORES:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 150, 10));

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
        getContentPane().add(JTextFieldNumeroVentiladores, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 250, -1));

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

        jLabel6.setText("Seleccione los días disponible:");

        javax.swing.GroupLayout jPanelDiasLayout = new javax.swing.GroupLayout(jPanelDias);
        jPanelDias.setLayout(jPanelDiasLayout);
        jPanelDiasLayout.setHorizontalGroup(
            jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiasLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanelDiasLayout.createSequentialGroup()
                        .addComponent(jCheckBoxSabado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBoxDomingo))
                    .addGroup(jPanelDiasLayout.createSequentialGroup()
                        .addComponent(jCheckBoxLunes)
                        .addGap(11, 11, 11)
                        .addComponent(jCheckBoxMartes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxMiercoles)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxJueves)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jCheckBoxViernes)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jPanelDiasLayout.setVerticalGroup(
            jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDiasLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLunes)
                    .addComponent(jCheckBoxMartes)
                    .addComponent(jCheckBoxMiercoles)
                    .addComponent(jCheckBoxJueves)
                    .addComponent(jCheckBoxViernes))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelDiasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxDomingo)
                    .addComponent(jCheckBoxSabado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanelDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, 430, 80));

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
        getContentPane().add(JTextFieldHora_Inicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 260, -1));

        jLabel29.setText("H:M:S      00:00:00");
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 440, -1, -1));

        jLabel12.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel12.setText("HORA DE INICIO:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 119, -1));

        jLabel30.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel30.setText("RUTA IMAGEN:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 150, 10));

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
        getContentPane().add(JTextFieldRutaImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 240, 250, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 240, -1, -1));

        jLabel7.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabel7.setText("TIPO AULA");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 120, 30));

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
        getContentPane().add(JComboBoxTipoAula, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, 250, -1));

        jLabel8.setText("Selecionar Horario:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

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
        getContentPane().add(jCheckBoxCrearHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, -1, -1));

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
        getContentPane().add(JComboBoxTipoHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 200, -1));

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
        getContentPane().add(JTextFieldNombreHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 250, -1));

        jLabelNombreHorario.setFont(new java.awt.Font("Verdana", 0, 11)); // NOI18N
        jLabelNombreHorario.setText("Nombre Horario");
        getContentPane().add(jLabelNombreHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 150, 10));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jPanel1.add(jPanelAtributosAulaGrande, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 90));

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

        jPanel1.add(jPanelAtributosAuditorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 90));

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

        jPanel1.add(jPanelAtributosExtras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 430, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, 500, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTextFieldCapa_AlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldCapa_AlumnoActionPerformed
 if((JTextFieldCapa_Alumno.getText().length()>0)){
           JTextFieldCapa_Pizarra.requestFocus();
          JTextFieldCapa_Pizarra.setEnabled(true);
        }      
    }//GEN-LAST:event_JTextFieldCapa_AlumnoActionPerformed

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

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
       JFileChooser archivo= new JFileChooser();
        int ventana=archivo.showOpenDialog(null);
        if(ventana==JFileChooser.APPROVE_OPTION){
            File file=archivo.getSelectedFile();
            JTextFieldRutaImagen.setText(String.valueOf(file));
            Image foto=getToolkit().getImage(JTextFieldRutaImagen.getText());
            image.setImage(foto);
                   
            JTextFieldRutaImagen.setText(String.valueOf(file));
            jLabel14.setIcon(new ImageIcon(foto.getScaledInstance(jLabel14.getWidth(),jLabel14.getHeight(), Image.SCALE_DEFAULT)));
            
          //  validacion = 1;
          if((JTextFieldRutaImagen.getText().length()>0)){
           jButton1.requestFocus();
          jButton1.setEnabled(true);
        }    
        }
       /* btnCan.setVisible(true);
        btnFechaHora.setVisible(true);
        */
    }//GEN-LAST:event_jLabel14MouseClicked

    private void JTextFieldHora_FinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldHora_FinActionPerformed

    }//GEN-LAST:event_JTextFieldHora_FinActionPerformed

    private void JTextFieldNumePupitresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumePupitresActionPerformed
    if((JTextFieldNumePupitres.getText().length()>0)){
           JComboBoxTipoVentilador.requestFocus();
          JComboBoxTipoVentilador.setEnabled(true);
        }        
    }//GEN-LAST:event_JTextFieldNumePupitresActionPerformed

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

    private void JTextFieldCapa_PizarraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldCapa_PizarraActionPerformed
       if((JTextFieldCapa_Pizarra.getText().length()>0)){
           JTextFieldNumePupitres.requestFocus();
          JTextFieldNumePupitres.setEnabled(true);
        }    
    }//GEN-LAST:event_JTextFieldCapa_PizarraActionPerformed

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

    private void JComboBoxTipoVentiladorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JComboBoxTipoVentiladorKeyPressed
       
    }//GEN-LAST:event_JComboBoxTipoVentiladorKeyPressed

    private void JComboBoxTipoVentiladorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxTipoVentiladorActionPerformed
    if((JComboBoxTipoVentilador.getSelectedItem().toString().equals("...."))==false){
           JTextFieldNumeroVentiladores.requestFocus();
          JTextFieldNumeroVentiladores.setEnabled(true);
        }       
        // TODO add your handling code here:
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

    private void JTextFieldNumeroVentiladoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumeroVentiladoresActionPerformed
    if((JTextFieldNumeroVentiladores.getText().length()>0)){
           JComboBoxTipoAula.requestFocus();
          JComboBoxTipoAula.setEnabled(true);
        }   


    }//GEN-LAST:event_JTextFieldNumeroVentiladoresActionPerformed

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

    private void jCheckBoxLunesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLunesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxLunesActionPerformed

    private void jCheckBoxMiercolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMiercolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMiercolesActionPerformed

    private void jCheckBoxJuevesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxJuevesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxJuevesActionPerformed

    private void jCheckBoxViernesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxViernesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxViernesActionPerformed

    private void jCheckBoxMartesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMartesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxMartesActionPerformed

    private void jCheckBoxSabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxSabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxSabadoActionPerformed

    private void jCheckBoxDomingoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxDomingoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxDomingoActionPerformed

    private void JTextFieldHora_InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldHora_InicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldHora_InicioActionPerformed

    private void JTextFieldRutaImagenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldRutaImagenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldRutaImagenActionPerformed

    private void JTextFieldRutaImagenKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldRutaImagenKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldRutaImagenKeyTyped

    private void JTextFieldHora_InicioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldHora_InicioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldHora_InicioKeyTyped

    private void JComboBoxTipoAulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaItemStateChanged

    private void JComboBoxTipoAulaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaMouseClicked

    private void JComboBoxTipoAulaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaMouseEntered

    private void JComboBoxTipoAulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaMousePressed

    private void JComboBoxTipoAulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaActionPerformed
 
            if((JComboBoxTipoAula.getSelectedItem().toString().equals("...."))==false){
          
           if ((JComboBoxTipoAula.getSelectedItem().toString().equals("Laboratorio")) == true) {
                   
                jPanelAtributosExtras2.setVisible(true);
                jPanelAtributosAulaGrande.setVisible(false);
                jPanelAtributosAuditorio.setVisible(false);
               habilitarPanelLaboratorio();

                    // habilitarPanelLaboratorio();
                   //  JTextFieldNumeroComputadoras.requestFocus();
                   // JTextFieldNumeroComputadoras.setEnabled(true);
                } 
           else if((JComboBoxTipoAula.getSelectedItem().toString().equals("Auditorio")) == true){
                jPanelAtributosAuditorio.setVisible(true);

               jPanelAtributosExtras2.setVisible(false);
                jPanelAtributosAulaGrande.setVisible(false);
           }
           else if((JComboBoxTipoAula.getSelectedItem().toString().equals("Aula Grande")) == true){
               jPanelAtributosAulaGrande.setVisible(true);

               jPanelAtributosExtras2.setVisible(false);
                jPanelAtributosAuditorio.setVisible(false);

           }
                else {
                jPanelAtributosAuditorio.setVisible(false);

               jPanelAtributosExtras2.setVisible(false);
                jPanelAtributosAulaGrande.setVisible(false);
                   // deshabilitarPanelLaboratorio();
                    
                      //       jLabel14.requestFocus();
                        //    jLabel14.setEnabled(true);
        
                }
        } else {
               

            }
        

    }//GEN-LAST:event_JComboBoxTipoAulaActionPerformed

    private void JComboBoxTipoAulaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JComboBoxTipoAulaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoAulaKeyPressed

    private void JComboBoxTipoHorarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioItemStateChanged

    private void JComboBoxTipoHorarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioMouseClicked

    private void JComboBoxTipoHorarioMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioMouseEntered

    private void JComboBoxTipoHorarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioMousePressed

    private void JComboBoxTipoHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioActionPerformed
        jCheckBoxCrearHorario.setEnabled(true);
        deshabilitarJCheckBoxTipoHorario();
        objPaqueteDao = new paquetediasDAO();
        System.out.println(" "+JComboBoxTipoHorario.getSelectedItem().toString());
       paquetedias obj =  objPaqueteDao.consultaCodigo(JComboBoxTipoHorario.getSelectedItem().toString());
       
       JTextFieldHora_Inicio.setText(Integer.toString(obj.getHora_inicio()));
       JTextFieldHora_Fin.setText(Integer.toString(obj.getHora_fin()));
       jButton1.setEnabled(true);
       if(obj.isLunes()== true){
           jCheckBoxLunes.setSelected(true);
       }
        if(obj.isMartes()== true){
           jCheckBoxMartes.setSelected(true);

       }
        if(obj.isMiercoles()== true){
           jCheckBoxMiercoles.setSelected(true);

       }
        if(obj.isJueves()== true){
           jCheckBoxJueves.setSelected(true);

       }
        if(obj.isViernes()== true){
           jCheckBoxViernes.setSelected(true);

       }
        if(obj.isSabado()== true){
           jCheckBoxSabado.setSelected(true);

       }
        if(obj.isDomingo()== false){
           jCheckBoxDomingo.setSelected(true);

       }


    }//GEN-LAST:event_JComboBoxTipoHorarioActionPerformed

    private void JComboBoxTipoHorarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JComboBoxTipoHorarioKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_JComboBoxTipoHorarioKeyPressed

    private void jCheckBoxCrearHorarioStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxCrearHorarioStateChanged

    }//GEN-LAST:event_jCheckBoxCrearHorarioStateChanged

    private void jCheckBoxCrearHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxCrearHorarioActionPerformed
      deshabilitarJCheckBoxTipoHorario();
      
        if(jCheckBoxCrearHorario.isSelected()){
        jCheckBoxCrearHorario.setEnabled(true);
        JComboBoxTipoHorario.setEnabled(false);
        jLabelNombreHorario.setVisible(true);
        JTextFieldNombreHorario.setVisible(true);
        JTextFieldNombreHorario.setEnabled(true);
        habilitarJCheckBoxTipoHorario();
        jButton1.setEnabled(true);
    }else{
             
                JComboBoxTipoHorario.setEnabled(true);
                JTextFieldNombreHorario.setText("");

                jLabelNombreHorario.setVisible(false);
                        JTextFieldNombreHorario.setVisible(false);

        JTextFieldNombreHorario.setEnabled(false);

    }
    }//GEN-LAST:event_jCheckBoxCrearHorarioActionPerformed

    private void JTextFieldNombreHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNombreHorarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNombreHorarioActionPerformed

    private void JTextFieldNombreHorarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTextFieldNombreHorarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNombreHorarioKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        
        if(validacion() ==0){
            guardar();
        }
        else{
            JOptionPane.showMessageDialog(null, "Error, llene todos los campos por favor");
        }

  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void JTextFieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldCodigoActionPerformed
        objAulaDao = new aulaDAO();

        int exLabo = objAulaDao.existenciaAulaPorCodigo(JTextFieldCodigo.getText());

        if((exLabo==1)){
            JTextFieldCodigo.setText("");
            JOptionPane.showMessageDialog(null,"Codigo Existente En Un Aula");
        }
       
        else if((exLabo==0)){
           JTextFieldCapa_Alumno.requestFocus();
          JTextFieldCapa_Alumno.setEnabled(true);
             JTextFieldCodigo.setText(JTextFieldCodigo.getText().toUpperCase());
        }
       
        

    }//GEN-LAST:event_JTextFieldCodigoActionPerformed

    private void JTextFieldNumeroParlantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumeroParlantesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNumeroParlantesActionPerformed

    private void JTextFieldNumeroMicrofonosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumeroMicrofonosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNumeroMicrofonosActionPerformed

    private void jCheckBoxProyector1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxProyector1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxProyector1ActionPerformed

    private void JTextFieldNumeroComputadorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNumeroComputadorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNumeroComputadorasActionPerformed

    private void JTextFieldNombrePasanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldNombrePasanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldNombrePasanteActionPerformed

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

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(JFrameNuevaAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameNuevaAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameNuevaAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameNuevaAula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameNuevaAula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox JComboBoxTipoAula;
    public javax.swing.JComboBox JComboBoxTipoHorario;
    public javax.swing.JComboBox JComboBoxTipoVentilador;
    public javax.swing.JTextField JTextFieldCapa_Alumno;
    public javax.swing.JTextField JTextFieldCapa_Pizarra;
    public javax.swing.JTextField JTextFieldCodigo;
    public javax.swing.JTextField JTextFieldHora_Fin;
    public javax.swing.JTextField JTextFieldHora_Inicio;
    public javax.swing.JTextField JTextFieldNombreHorario;
    public javax.swing.JTextField JTextFieldNombrePasante;
    public javax.swing.JTextField JTextFieldNumePupitres;
    public javax.swing.JTextField JTextFieldNumeroComputadoras;
    public javax.swing.JTextField JTextFieldNumeroMicrofonos;
    public javax.swing.JTextField JTextFieldNumeroParlantes;
    public javax.swing.JTextField JTextFieldNumeroVentiladores;
    public javax.swing.JTextField JTextFieldRutaImagen;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel25;
    public static javax.swing.JLabel jLabel27;
    public static javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    public static javax.swing.JLabel jLabel30;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelAtributosAuditorio;
    private javax.swing.JPanel jPanelAtributosAulaGrande;
    private javax.swing.JPanel jPanelAtributosExtras2;
    private javax.swing.JPanel jPanelDias;
    // End of variables declaration//GEN-END:variables

    private void deshabilitarJCheckBoxTipoHorario() {
        jCheckBoxLunes.setSelected(false);
        jCheckBoxMartes.setSelected(false);

        jCheckBoxMiercoles.setSelected(false);

        jCheckBoxJueves.setSelected(false);

        jCheckBoxViernes.setSelected(false);

        jCheckBoxSabado.setSelected(false);

        jCheckBoxDomingo.setSelected(false);

                                    
        
        
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
 private void habilitarJCheckBoxTipoHorario() {
        jCheckBoxLunes.setSelected(false);
        jCheckBoxMartes.setSelected(false);

        jCheckBoxMiercoles.setSelected(false);

        jCheckBoxJueves.setSelected(false);

        jCheckBoxViernes.setSelected(false);

        jCheckBoxSabado.setSelected(false);

        jCheckBoxDomingo.setSelected(false);

                                    
        
        
        jCheckBoxLunes.setEnabled(true);
        jCheckBoxMartes.setEnabled(true);

        jCheckBoxMiercoles.setEnabled(true);

        jCheckBoxJueves.setEnabled(true);

        jCheckBoxViernes.setEnabled(true);

        jCheckBoxSabado.setEnabled(true);

        jCheckBoxDomingo.setEnabled(true);
        JTextFieldHora_Inicio.setEnabled(true);
       JTextFieldHora_Fin.setEnabled(true);
    }
private void guardar(){
    
if((JComboBoxTipoAula.getSelectedItem().toString().equals("Laboratorio"))== true){
    try {
        objAula = new aulaLaboratorio();
        objPaque = new paquetedias();
paquetedias  momen ;
    objPaqueteDao=new paquetediasDAO();
        objAula.setCodigo(JTextFieldCodigo.getText());
        objAula.setCapacidad_alumnos(Integer.parseInt(JTextFieldCapa_Alumno.getText()));
        objAula.setCantidad_Pizarras(Integer.parseInt(JTextFieldCapa_Pizarra.getText()));
        objAula.setNumero_Computadoras(Integer.parseInt(JTextFieldNumeroComputadoras.getText()));
        objAula.setNumeros_pupitres(Integer.parseInt(JTextFieldNumePupitres.getText()));
        objAula.setCantidad_ventilacion(Integer.parseInt(JTextFieldNumeroVentiladores.getText()));
        objAula.setNombrePasante((JTextFieldNombrePasante.getText()));
        objAula.setTipo_ventilacion((JComboBoxTipoVentilador.getSelectedItem().toString()));
        
        if(jCheckBoxCrearHorario.isSelected()== true){
            objPaque.setCodigo(JTextFieldNombreHorario.getText());
            objPaque.setLunes(  jCheckBoxLunes.isSelected() );
        objPaque.setMartes(  jCheckBoxMartes.isSelected() );
        objPaque.setMiercoles(  jCheckBoxMiercoles.isSelected() );
        objPaque.setJueves(  jCheckBoxJueves.isSelected() );
        objPaque.setViernes(  jCheckBoxViernes.isSelected() );
        objPaque.setSabado(  jCheckBoxSabado.isSelected() );
        objPaque.setDomingo(  jCheckBoxDomingo.isSelected() );
        objPaque.setHora_inicio(Integer.parseInt(JTextFieldHora_Inicio.getText()));
        objPaque.setHora_fin(Integer.parseInt(JTextFieldHora_Fin.getText()));
        objPaqueteDao.guardarAula(objPaque);
        momen = (objPaqueteDao.consultaCodigo(JComboBoxTipoHorario.getSelectedItem().toString()));
        System.out.println("Valor de id de paquete dia"+momen.getId());

        objPaque.setId(momen.getId());
        System.out.println(momen.getId());    

        
        }else{ //cuando trabajo con el jcombobox de horarios
            
            momen =  (objPaqueteDao.consultaCodigo(JComboBoxTipoHorario.getSelectedItem().toString()));

            System.out.println("Valor de id de paquete dia"+momen.getId());
            objPaque.setId(momen.getId());
           objPaque.setCodigo(JComboBoxTipoHorario.getSelectedItem().toString());
            objPaque.setLunes(jCheckBoxLunes.isSelected());
            objPaque.setMartes(jCheckBoxMartes.isSelected());
            objPaque.setMiercoles(jCheckBoxMiercoles.isSelected());
            objPaque.setJueves(jCheckBoxJueves.isSelected());
            objPaque.setViernes(jCheckBoxViernes.isSelected());
            objPaque.setSabado(jCheckBoxSabado.isSelected());
            objPaque.setDomingo(jCheckBoxDomingo.isSelected());
            objPaque.setHora_inicio(Integer.parseInt(JTextFieldHora_Inicio.getText()));
            objPaque.setHora_fin(Integer.parseInt(JTextFieldHora_Fin.getText()));

        }
        
                objAula.setTipoAula(JComboBoxTipoAula.getSelectedItem().toString());

         objAula.setDias(objPaque);
         objAula.setIdDias(objPaque.getId());
        objAula.setRuta_imagen(JTextFieldRutaImagen.getText());
        FileInputStream archivoFoto;

        archivoFoto= new FileInputStream(JTextFieldRutaImagen.getText());
        objAula.setArchivoFotoParaGuardar(archivoFoto);

        objAula.setIdDias(objAula.getDias().getId());
        
    } catch (FileNotFoundException ex) {
            System.out.println("Error al generar imagen");
            System.out.println(ex);
    }
           
}
else if((JComboBoxTipoAula.getSelectedItem().toString().equals("Aula Pequeño"))== true){
    try{   
    objAula = new aulaPequeña();
       
       
       objPaque = new paquetedias();
paquetedias  momen ;
    objPaqueteDao=new paquetediasDAO();
        objAula.setCodigo(JTextFieldCodigo.getText());
        objAula.setCapacidad_alumnos(Integer.parseInt(JTextFieldCapa_Alumno.getText()));
        objAula.setCantidad_Pizarras(Integer.parseInt(JTextFieldCapa_Pizarra.getText()));
        objAula.setNumeros_pupitres(Integer.parseInt(JTextFieldNumePupitres.getText()));
        objAula.setCantidad_ventilacion(Integer.parseInt(JTextFieldNumeroVentiladores.getText()));
        objAula.setTipo_ventilacion((JComboBoxTipoVentilador.getSelectedItem().toString()));
        
      if(jCheckBoxCrearHorario.isSelected()== true){
            objPaque.setCodigo(JTextFieldNombreHorario.getText());
            objPaque.setLunes(  jCheckBoxLunes.isSelected() );
        objPaque.setMartes(  jCheckBoxMartes.isSelected() );
        objPaque.setMiercoles(  jCheckBoxMiercoles.isSelected() );
        objPaque.setJueves(  jCheckBoxJueves.isSelected() );
        objPaque.setViernes(  jCheckBoxViernes.isSelected() );
        objPaque.setSabado(  jCheckBoxSabado.isSelected() );
        objPaque.setDomingo(  jCheckBoxDomingo.isSelected() );
        objPaque.setHora_inicio(Integer.parseInt(JTextFieldHora_Inicio.getText()));
        objPaque.setHora_fin(Integer.parseInt(JTextFieldHora_Fin.getText()));
        objPaqueteDao.guardarAula(objPaque);
        momen = (objPaqueteDao.consultaCodigo(JComboBoxTipoHorario.getSelectedItem().toString()));
        
        objPaque.setId(momen.getId());
        System.out.println(momen.getId());    

        
        }else{ //cuando trabajo con el jcombobox de horarios
            
            momen =  (objPaqueteDao.consultaCodigo(JComboBoxTipoHorario.getSelectedItem().toString()));


            System.out.println("Valor de id de paquete dia"+momen.getId());
            objPaque.setId(momen.getId());
           objPaque.setCodigo(JComboBoxTipoHorario.getSelectedItem().toString());
            objPaque.setLunes(jCheckBoxLunes.isSelected());
            objPaque.setMartes(jCheckBoxMartes.isSelected());
            objPaque.setMiercoles(jCheckBoxMiercoles.isSelected());
            objPaque.setJueves(jCheckBoxJueves.isSelected());
            objPaque.setViernes(jCheckBoxViernes.isSelected());
            objPaque.setSabado(jCheckBoxSabado.isSelected());
            objPaque.setDomingo(jCheckBoxDomingo.isSelected());
            objPaque.setHora_inicio(Integer.parseInt(JTextFieldHora_Inicio.getText()));
            objPaque.setHora_fin(Integer.parseInt(JTextFieldHora_Fin.getText()));
            objPaque.setCodigo(JComboBoxTipoVentilador.getSelectedItem().toString());

        }
        
        objAula.setTipoAula(JComboBoxTipoAula.getSelectedItem().toString());
         objAula.setDias(objPaque);
         objAula.setIdDias(objPaque.getId());
        objAula.setRuta_imagen(JTextFieldRutaImagen.getText());
        FileInputStream archivoFoto;

        archivoFoto= new FileInputStream(JTextFieldRutaImagen.getText());
        objAula.setArchivoFotoParaGuardar(archivoFoto);

        objAula.setIdDias(objAula.getDias().getId());
        
    } catch (FileNotFoundException ex) {
            System.out.println("Error al generar imagen");
            System.out.println(ex);
    }
       
}
    
    
else if((JComboBoxTipoAula.getSelectedItem().toString().equals("Aula Grande"))== true){
        try{   
    objAula = new aulaGrande();
       
       
       objPaque = new paquetedias();
paquetedias  momen ;
    objPaqueteDao=new paquetediasDAO();
        objAula.setCodigo(JTextFieldCodigo.getText());
        objAula.setCapacidad_alumnos(Integer.parseInt(JTextFieldCapa_Alumno.getText()));
        objAula.setCantidad_Pizarras(Integer.parseInt(JTextFieldCapa_Pizarra.getText()));
        objAula.setNumeros_pupitres(Integer.parseInt(JTextFieldNumePupitres.getText()));
        objAula.setCantidad_ventilacion(Integer.parseInt(JTextFieldNumeroVentiladores.getText()));
        objAula.setTipo_ventilacion((JComboBoxTipoVentilador.getSelectedItem().toString()));
        objAula.setTela_Proyector(jCheckBoxTela_Proyector1.isSelected());
        objAula.setProyector(jCheckBoxProyector1.isSelected());

      if(jCheckBoxCrearHorario.isSelected()== true){
            objPaque.setCodigo(JTextFieldNombreHorario.getText());
            objPaque.setLunes(  jCheckBoxLunes.isSelected() );
        objPaque.setMartes(  jCheckBoxMartes.isSelected() );
        objPaque.setMiercoles(  jCheckBoxMiercoles.isSelected() );
        objPaque.setJueves(  jCheckBoxJueves.isSelected() );
        objPaque.setViernes(  jCheckBoxViernes.isSelected() );
        objPaque.setSabado(  jCheckBoxSabado.isSelected() );
        objPaque.setDomingo(  jCheckBoxDomingo.isSelected() );
        objPaque.setHora_inicio(Integer.parseInt(JTextFieldHora_Inicio.getText()));
        objPaque.setHora_fin(Integer.parseInt(JTextFieldHora_Fin.getText()));
        objPaqueteDao.guardarAula(objPaque);
        momen = (objPaqueteDao.consultaCodigo(JComboBoxTipoHorario.getSelectedItem().toString()));
        
        objPaque.setId(momen.getId());
        System.out.println(momen.getId());    

        
        }else{ //cuando trabajo con el jcombobox de horarios
            
            momen =  (objPaqueteDao.consultaCodigo(JComboBoxTipoHorario.getSelectedItem().toString()));


            System.out.println(momen.getId());
                    objPaque.setId(momen.getId());

           objPaque.setCodigo(JComboBoxTipoHorario.getSelectedItem().toString());
            objPaque.setLunes(jCheckBoxLunes.isSelected());
            objPaque.setMartes(jCheckBoxMartes.isSelected());
            objPaque.setMiercoles(jCheckBoxMiercoles.isSelected());
            objPaque.setJueves(jCheckBoxJueves.isSelected());
            objPaque.setViernes(jCheckBoxViernes.isSelected());
            objPaque.setSabado(jCheckBoxSabado.isSelected());
            objPaque.setDomingo(jCheckBoxDomingo.isSelected());
            objPaque.setHora_inicio(Integer.parseInt(JTextFieldHora_Inicio.getText()));
            objPaque.setHora_fin(Integer.parseInt(JTextFieldHora_Fin.getText()));
            objPaque.setCodigo(JComboBoxTipoVentilador.getSelectedItem().toString());

        }
        
                objAula.setTipoAula(JComboBoxTipoAula.getSelectedItem().toString());

         objAula.setDias(objPaque);
         objAula.setIdDias(objPaque.getId());
        objAula.setRuta_imagen(JTextFieldRutaImagen.getText());
        FileInputStream archivoFoto;

        archivoFoto= new FileInputStream(JTextFieldRutaImagen.getText());
        objAula.setArchivoFotoParaGuardar(archivoFoto);

        objAula.setIdDias(objAula.getDias().getId());
        
    } catch (FileNotFoundException ex) {
            System.out.println("Error al generar imagen");
            System.out.println(ex);
    }
       
       
       
}
if((JComboBoxTipoAula.getSelectedItem().toString().equals("Auditorio"))== true){
    try {
        objAula = new aulaAuditorio();
        objPaque = new paquetedias();
paquetedias  momen ;
    objPaqueteDao=new paquetediasDAO();
        objAula.setCodigo(JTextFieldCodigo.getText());
        objAula.setCapacidad_alumnos(Integer.parseInt(JTextFieldCapa_Alumno.getText()));
        objAula.setCantidad_Pizarras(Integer.parseInt(JTextFieldCapa_Pizarra.getText()));
        objAula.setNumeros_pupitres(Integer.parseInt(JTextFieldNumePupitres.getText()));
        objAula.setCantidad_ventilacion(Integer.parseInt(JTextFieldNumeroVentiladores.getText()));
        objAula.setTipo_ventilacion((JComboBoxTipoVentilador.getSelectedItem().toString()));
        objAula.setCantidad_Parlantes(Integer.parseInt(JTextFieldNumeroParlantes.getText()));
        objAula.setCantidad_Microfonos(Integer.parseInt(JTextFieldNumeroMicrofonos.getText()));

        if(jCheckBoxCrearHorario.isSelected()== true){
            objPaque.setCodigo(JTextFieldNombreHorario.getText());
            objPaque.setLunes(  jCheckBoxLunes.isSelected() );
        objPaque.setMartes(  jCheckBoxMartes.isSelected() );
        objPaque.setMiercoles(  jCheckBoxMiercoles.isSelected() );
        objPaque.setJueves(  jCheckBoxJueves.isSelected() );
        objPaque.setViernes(  jCheckBoxViernes.isSelected() );
        objPaque.setSabado(  jCheckBoxSabado.isSelected() );
        objPaque.setDomingo(  jCheckBoxDomingo.isSelected() );
        objPaque.setHora_inicio(Integer.parseInt(JTextFieldHora_Inicio.getText()));
        objPaque.setHora_fin(Integer.parseInt(JTextFieldHora_Fin.getText()));
        objPaqueteDao.guardarAula(objPaque);
        momen = (objPaqueteDao.consultaCodigo(JComboBoxTipoHorario.getSelectedItem().toString()));
        System.out.println("Valor de id de paquete dia"+momen.getId());

        objPaque.setId(momen.getId());
        System.out.println(momen.getId());    

        
        }else{ //cuando trabajo con el jcombobox de horarios
            
            momen =  (objPaqueteDao.consultaCodigo(JComboBoxTipoHorario.getSelectedItem().toString()));

            System.out.println("Valor de id de paquete dia"+momen.getId());
            objPaque.setId(momen.getId());
           objPaque.setCodigo(JComboBoxTipoHorario.getSelectedItem().toString());
            objPaque.setLunes(jCheckBoxLunes.isSelected());
            objPaque.setMartes(jCheckBoxMartes.isSelected());
            objPaque.setMiercoles(jCheckBoxMiercoles.isSelected());
            objPaque.setJueves(jCheckBoxJueves.isSelected());
            objPaque.setViernes(jCheckBoxViernes.isSelected());
            objPaque.setSabado(jCheckBoxSabado.isSelected());
            objPaque.setDomingo(jCheckBoxDomingo.isSelected());
            objPaque.setHora_inicio(Integer.parseInt(JTextFieldHora_Inicio.getText()));
            objPaque.setHora_fin(Integer.parseInt(JTextFieldHora_Fin.getText()));

        }
        
                objAula.setTipoAula(JComboBoxTipoAula.getSelectedItem().toString());

         objAula.setDias(objPaque);
         objAula.setIdDias(objPaque.getId());
        objAula.setRuta_imagen(JTextFieldRutaImagen.getText());
        FileInputStream archivoFoto;

        archivoFoto= new FileInputStream(JTextFieldRutaImagen.getText());
        objAula.setArchivoFotoParaGuardar(archivoFoto);

        objAula.setIdDias(objAula.getDias().getId());
        
    } catch (FileNotFoundException ex) {
            System.out.println("Error al generar imagen");
            System.out.println(ex);
    }
           
}

  objAulaDao = new aulaDAO();
  if(objAulaDao.guardarAula(objAula) == 1){
      JOptionPane.showMessageDialog(null,"Guardado con exito");
      if(JFrameListar != null){
          JFrameListar.cargarTabla("");
      }
      dispose();
  }else{
            JOptionPane.showMessageDialog(null,"ERROR AL GUARDAR");

  }
}
private int validacion(){
     int error = 0;
        if(JTextFieldRutaImagen.getText().length()==0){
           return error = 1; // error, campo invalido 
        }
        else if(JTextFieldCodigo.getText().length()==0){
           return error = 1; // error, campo invalido 
        }
        else if(JTextFieldHora_Inicio.getText().length()==0){
           return error = 1; // error, campo invalido 
        }else if(JTextFieldHora_Fin.getText().length()==0){
           return error = 1; // error, campo invalido 
        }
        else if((jCheckBoxLunes.isSelected()==false )&&(jCheckBoxMartes.isSelected()==false)
                &&(jCheckBoxMiercoles.isSelected()==false) &&(jCheckBoxJueves.isSelected()==false) &&
                (jCheckBoxViernes.isSelected()==false)&&(jCheckBoxSabado.isSelected()==false)&&(jCheckBoxDomingo.isSelected()==false)){
           return error = 1; // error, campo invalido 
           
                    
                }
        else if(JComboBoxTipoAula.getSelectedItem().equals("....")){
           return error = 1; // error, campo invalido 
        }
        return 0;
}
}
