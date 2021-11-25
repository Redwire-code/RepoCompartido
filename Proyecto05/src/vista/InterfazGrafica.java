/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import com.sun.jdi.connect.spi.Connection;
import controlador.ValidaFecha;
import java.awt.Color;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.DefaultListModel;
import modelo.Empleado;

/**
 *
 * @author root
 */
public class InterfazGrafica extends javax.swing.JFrame {

    //Creamos los colores para los temas de los paneles
    private Color fondoPanel = new java.awt.Color(69, 69, 69);
    private Color letras = new java.awt.Color(88, 227, 57);
    private Color letrasC = new java.awt.Color(167, 254, 148);

    /**
     * Creates new form InterfazGrafica
     */
    public InterfazGrafica() {

        //Inicializamos los componentes
        initComponents();

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            System.out.println("Conectado");
        } catch (Exception e) {
            System.out.println("JDBC driver falied to load.");
            return;
        }
        
        //Establecemos los temas de los componentes
        estableceTemaIncio();
        estableceTemaVisualizaUno();
        estableceTemaJList();

        //Establecemos la ventana de forma que no pueda redimensionarse
        setResizable(false);

        //Desactivamos los paneles que no nos interesen
        VisualizarJListPanel.show(false);
        VisualizarUnoPanel.show(false);

        //Activamos los que si nos interesen
        InicioPanel.show(true);

    }

    public void estableceTemaJList() { //Establece el tema 

        //Establecemos el color de fondo del panel
        VisualizarJListPanel.setBackground(fondoPanel);

        //Establecemos el color de la letra de las etiquetas
        tituloVisualizarJList.setForeground(letras);
        fechaFiltrar1Label.setForeground(letras);
        fechaFiltrar2Label.setForeground(letras);

        //Establecemos el fondo del panel de scroll
        JListEmpleados.setBackground(fondoPanel);
        JListEmpleados.setForeground(letrasC);

        //Establecemos los colores de del boton
        //Establecemos el color de fondo
        fechaFiltrarBoton.setBackground(fondoPanel);
        fechaFiltrarBoton.setForeground(letras);
        fechaBuscarBoton.setBackground(fondoPanel);
        fechaBuscarBoton.setForeground(letras);

        //Establecemos el color del field
        //Establecemos el color de fondo
        fechaFiltrar1Field.setBackground(fondoPanel);
        fechaFiltrar1Field.setForeground(letras);
        fechaFiltrar2Field.setBackground(fondoPanel);
        fechaFiltrar2Field.setForeground(letras);

        //Establecemos el texto de 
        fechaFiltrar1Field.setText("");
        fechaFiltrar2Field.setText("");

    }

    public void estableceTemaVisualizaUno() { //Establece el tema de el panel visualizar uno a uno

        //Establecemos color de las etiquetas
        VisualizarUnoPanel.setBackground(fondoPanel);
        tituloVisualizarUno.setForeground(letras);
        numeroEmpleadoLabel.setForeground(letras);
        nombreEmpleadoLabel.setForeground(letras);
        apellidoEmpleadoLabel.setForeground(letras);
        fotoEmpleadoLabel.setForeground(letras);
        sueldoEmpleadoLabel.setForeground(letras);
        fechaAltaEmpleadoLabel.setForeground(letras);
        filtroApellidosLabel.setForeground(letras);

        //Establecemos color de los field
        //Color de la letra
        tituloVisualizarUno.setForeground(letras);
        numeroEmpleadoField.setForeground(letrasC);
        nombreEmpleadoField.setForeground(letrasC);
        apellidoEmpleadoField.setForeground(letrasC);

        sueldoEmpleadoField.setForeground(letrasC);
        fechaAltaEmpleadoField.setForeground(letrasC);

        //Color de fondo
        tituloVisualizarUno.setBackground(fondoPanel);
        numeroEmpleadoField.setBackground(fondoPanel);
        nombreEmpleadoField.setBackground(fondoPanel);
        apellidoEmpleadoField.setBackground(fondoPanel);

        sueldoEmpleadoField.setBackground(fondoPanel);
        fechaAltaEmpleadoField.setBackground(fondoPanel);

        //Establecemos el texto de los field en blanco
        numeroEmpleadoField.setText("");
        nombreEmpleadoField.setText("");
        apellidoEmpleadoField.setText("");

        sueldoEmpleadoField.setText("");
        fechaAltaEmpleadoField.setText("");

        //Establecemos el color de los botones
        //Establecemos el color de las letras
        botonAvanzar.setForeground(letras);
        botonRetroceder.setForeground(letras);

        //Establecemos el color del fondo
        botonAvanzar.setBackground(fondoPanel);
        botonRetroceder.setBackground(fondoPanel);

        //Establecemos el color del comboBox
        //Establecemos el color de fondo
        listaApellidosCombo.setBackground(fondoPanel);

    }

    public void estableceTemaIncio() { //Establece el tema del panel de inicio

        InicioPanel.setBackground(fondoPanel);
        tituloInicio.setForeground(letras);
        autores.setForeground(letras);
        autor1.setForeground(letras);
        autor2.setForeground(letras);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        VisualizarJListPanel = new javax.swing.JPanel();
        tituloVisualizarJList = new javax.swing.JLabel();
        panelScroll = new javax.swing.JScrollPane();
        JListEmpleados = new javax.swing.JList<>();
        fechaFiltrar1Label = new javax.swing.JLabel();
        fechaFiltrar1Field = new javax.swing.JTextField();
        fechaFiltrarBoton = new javax.swing.JButton();
        fechaFiltrar2Label = new javax.swing.JLabel();
        fechaFiltrar2Field = new javax.swing.JTextField();
        fechaBuscarBoton = new javax.swing.JButton();
        VisualizarUnoPanel = new javax.swing.JPanel();
        tituloVisualizarUno = new javax.swing.JLabel();
        numeroEmpleadoLabel = new javax.swing.JLabel();
        nombreEmpleadoLabel = new javax.swing.JLabel();
        apellidoEmpleadoLabel = new javax.swing.JLabel();
        fotoEmpleadoLabel = new javax.swing.JLabel();
        sueldoEmpleadoLabel = new javax.swing.JLabel();
        fechaAltaEmpleadoLabel = new javax.swing.JLabel();
        numeroEmpleadoField = new javax.swing.JTextField();
        nombreEmpleadoField = new javax.swing.JTextField();
        apellidoEmpleadoField = new javax.swing.JTextField();
        sueldoEmpleadoField = new javax.swing.JTextField();
        fechaAltaEmpleadoField = new javax.swing.JTextField();
        botonAvanzar = new javax.swing.JButton();
        botonRetroceder = new javax.swing.JButton();
        filtroApellidosLabel = new javax.swing.JLabel();
        listaApellidosCombo = new javax.swing.JComboBox<>();
        InicioPanel = new javax.swing.JPanel();
        tituloInicio = new javax.swing.JLabel();
        autores = new javax.swing.JLabel();
        autor1 = new javax.swing.JLabel();
        autor2 = new javax.swing.JLabel();
        BarraMenu = new javax.swing.JMenuBar();
        menuOpciones = new javax.swing.JMenu();
        visualizarUno = new javax.swing.JMenuItem();
        VisualizarJList = new javax.swing.JMenuItem();
        Inicio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));

        VisualizarJListPanel.setPreferredSize(new java.awt.Dimension(700, 700));

        tituloVisualizarJList.setText("Datos de los empleados:");

        panelScroll.setViewportView(JListEmpleados);

        fechaFiltrar1Label.setText("Primera Fecha:");

        fechaFiltrar1Field.setText("jTextField1");

        fechaFiltrarBoton.setText("Aplicar");
        fechaFiltrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaFiltrarBotonActionPerformed(evt);
            }
        });

        fechaFiltrar2Label.setText("Segunda Fecha:");

        fechaFiltrar2Field.setText("jTextField1");

        fechaBuscarBoton.setText("Buscar");
        fechaBuscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaBuscarBotonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VisualizarJListPanelLayout = new javax.swing.GroupLayout(VisualizarJListPanel);
        VisualizarJListPanel.setLayout(VisualizarJListPanelLayout);
        VisualizarJListPanelLayout.setHorizontalGroup(
            VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarJListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelScroll)
                    .addGroup(VisualizarJListPanelLayout.createSequentialGroup()
                        .addGroup(VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloVisualizarJList)
                            .addGroup(VisualizarJListPanelLayout.createSequentialGroup()
                                .addComponent(fechaFiltrar1Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(fechaFiltrar1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaFiltrar2Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fechaFiltrar2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                .addComponent(fechaBuscarBoton)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaFiltrarBoton)))
                .addContainerGap())
        );
        VisualizarJListPanelLayout.setVerticalGroup(
            VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarJListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVisualizarJList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaFiltrar1Label)
                    .addComponent(fechaFiltrar1Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaFiltrarBoton)
                    .addComponent(fechaFiltrar2Label)
                    .addComponent(fechaFiltrar2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaBuscarBoton))
                .addContainerGap())
        );

        VisualizarUnoPanel.setPreferredSize(new java.awt.Dimension(700, 700));

        tituloVisualizarUno.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        tituloVisualizarUno.setText("                                                 Sección de Consultas");

        numeroEmpleadoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        numeroEmpleadoLabel.setText("Numero:");

        nombreEmpleadoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nombreEmpleadoLabel.setText("Nombre:");

        apellidoEmpleadoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        apellidoEmpleadoLabel.setText("Apellido:");

        fotoEmpleadoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fotoEmpleadoLabel.setText("Foto:");

        sueldoEmpleadoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sueldoEmpleadoLabel.setText("Sueldo:");

        fechaAltaEmpleadoLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fechaAltaEmpleadoLabel.setText("Fecha de Alta:");

        numeroEmpleadoField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        numeroEmpleadoField.setText("jTextField1");

        nombreEmpleadoField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        nombreEmpleadoField.setText("jTextField2");

        apellidoEmpleadoField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        apellidoEmpleadoField.setText("jTextField3");

        sueldoEmpleadoField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        sueldoEmpleadoField.setText("jTextField5");

        fechaAltaEmpleadoField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fechaAltaEmpleadoField.setText("jTextField6");

        botonAvanzar.setText("Avanzar");
        botonAvanzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAvanzarActionPerformed(evt);
            }
        });

        botonRetroceder.setText("Retroceder");
        botonRetroceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRetrocederActionPerformed(evt);
            }
        });

        filtroApellidosLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        filtroApellidosLabel.setText("Filtro por apellidos:");

        listaApellidosCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno" }));
        listaApellidosCombo.setMinimumSize(new java.awt.Dimension(83, 22));

        javax.swing.GroupLayout VisualizarUnoPanelLayout = new javax.swing.GroupLayout(VisualizarUnoPanel);
        VisualizarUnoPanel.setLayout(VisualizarUnoPanelLayout);
        VisualizarUnoPanelLayout.setHorizontalGroup(
            VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VisualizarUnoPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(filtroApellidosLabel)
                    .addComponent(listaApellidosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                        .addComponent(botonRetroceder)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroEmpleadoLabel)
                            .addComponent(nombreEmpleadoLabel)
                            .addComponent(apellidoEmpleadoLabel)
                            .addComponent(fotoEmpleadoLabel)
                            .addComponent(sueldoEmpleadoLabel)
                            .addComponent(fechaAltaEmpleadoLabel))
                        .addGap(65, 65, 65)
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(numeroEmpleadoField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(nombreEmpleadoField)
                            .addComponent(apellidoEmpleadoField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sueldoEmpleadoField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fechaAltaEmpleadoField, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(18, 18, 18))
            .addComponent(tituloVisualizarUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        VisualizarUnoPanelLayout.setVerticalGroup(
            VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloVisualizarUno)
                .addGap(34, 34, 34)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numeroEmpleadoLabel)
                    .addComponent(filtroApellidosLabel))
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombreEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nombreEmpleadoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VisualizarUnoPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(listaApellidosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellidoEmpleadoLabel))
                .addGap(81, 81, 81)
                .addComponent(fotoEmpleadoLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sueldoEmpleadoLabel))
                .addGap(18, 18, 18)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaAltaEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaAltaEmpleadoLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAvanzar)
                    .addComponent(botonRetroceder))
                .addGap(12, 12, 12))
        );

        InicioPanel.setPreferredSize(new java.awt.Dimension(700, 700));

        tituloInicio.setText("Gestión Penitenciaria de Burgos");

        autores.setText("Realizado por:");

        autor1.setText("- Francisco Javier Martínez Martínez");

        autor2.setText("- Antonio Carrasco García");

        javax.swing.GroupLayout InicioPanelLayout = new javax.swing.GroupLayout(InicioPanel);
        InicioPanel.setLayout(InicioPanelLayout);
        InicioPanelLayout.setHorizontalGroup(
            InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioPanelLayout.createSequentialGroup()
                .addGroup(InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(InicioPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autores)
                            .addGroup(InicioPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(autor2)
                                    .addComponent(autor1)))))
                    .addGroup(InicioPanelLayout.createSequentialGroup()
                        .addGap(257, 257, 257)
                        .addComponent(tituloInicio)))
                .addContainerGap(261, Short.MAX_VALUE))
        );
        InicioPanelLayout.setVerticalGroup(
            InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(tituloInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 374, Short.MAX_VALUE)
                .addComponent(autores)
                .addGap(4, 4, 4)
                .addComponent(autor1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(autor2)
                .addContainerGap())
        );

        menuOpciones.setText("Opciones");

        visualizarUno.setText("Visualizar uno a uno");
        visualizarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarUnoActionPerformed(evt);
            }
        });
        menuOpciones.add(visualizarUno);

        VisualizarJList.setText("Visualizar todos");
        VisualizarJList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VisualizarJListActionPerformed(evt);
            }
        });
        menuOpciones.add(VisualizarJList);

        Inicio.setText("Inicio");
        Inicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioActionPerformed(evt);
            }
        });
        menuOpciones.add(Inicio);

        BarraMenu.add(menuOpciones);

        setJMenuBar(BarraMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VisualizarJListPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VisualizarUnoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InicioPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VisualizarJListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VisualizarUnoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InicioPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAvanzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAvanzarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAvanzarActionPerformed

    private void botonRetrocederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRetrocederActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void InicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioActionPerformed
        // TODO add your handling code here:

        //Desactivamos los paneles que no nos interesen
        VisualizarJListPanel.show(false);
        VisualizarUnoPanel.show(false);

        //Activamos los que si nos interesen
        InicioPanel.show(true);

        //Actualizamos la interfaz grafica
        InicioPanel.updateUI();
        

    }//GEN-LAST:event_InicioActionPerformed

    private void VisualizarJListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VisualizarJListActionPerformed
        // TODO add your handling code here:

        //Desactivamos los paneles que no nos interesen
        VisualizarUnoPanel.show(false);
        InicioPanel.show(false);

        //Activamos los que si nos interesen
        VisualizarJListPanel.show(true);

        //Actualizamos la interfaz grafica
        VisualizarUnoPanel.updateUI();

    }//GEN-LAST:event_VisualizarJListActionPerformed

    private void visualizarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarUnoActionPerformed
        // TODO add your handling code here:

        //Desactivamos los paneles que no nos interesen
        VisualizarJListPanel.show(false);
        InicioPanel.show(false);

        //Activamos los que si nos interesen
        VisualizarUnoPanel.show(true);

        //Actualizamos la interfaz grafica
        VisualizarUnoPanel.updateUI();

        try {

            var con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", "AntFran", "netbeans");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT DISTINCT APELLIDO FROM EMPLEADO");
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();

            while (rs.next()) {
                for (int i = 1; i <= numCols; i++) {
                    //listaApellidosCombo.add(rs.getString(i));
                    listaApellidosCombo.addItem(rs.getString(i));
                    
                }
                
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_visualizarUnoActionPerformed

    private void fechaFiltrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaFiltrarBotonActionPerformed
        // TODO add your handling code here:
        
        if(banderaFiltroFecha == false){
            banderaFiltroFecha = true;
            System.out.print("\nFiltro fecha:" + banderaFiltroFecha);
        }else if(banderaFiltroFecha == true){
            banderaFiltroFecha = false;
            System.out.print("\nFiltro fecha:" + banderaFiltroFecha);
        }
        
    }//GEN-LAST:event_fechaFiltrarBotonActionPerformed

    private void fechaBuscarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaBuscarBotonActionPerformed
        // TODO add your handling code here:
        
        ArrayList<Empleado> empleados = new ArrayList();
        
        String cadenaAux = "";
        
        String[] arrayString = new String[7];
        
        DefaultListModel defLisMod = new DefaultListModel();
        
        JListEmpleados.setModel(defLisMod);
        
        //Establecemos la fecha de hoy para comparar
        GregorianCalendar auxF = new GregorianCalendar();
        int d = auxF.get(Calendar.DAY_OF_MONTH);
        int m = auxF.get(Calendar.MONTH);
        int a = auxF.get(Calendar.YEAR);

        GregorianCalendar fechaHoy = new GregorianCalendar(a, m, d);
        
        int numero = 0;
        String nombre = "";
        String apellido = "";
        String foto = "";
        float sueldo = 0;
        float sueldoMaximo = 0;
        String fechaAux = "";
        GregorianCalendar fechaAlta = null;
        
        GregorianCalendar fecha1Aux = fechaHoy;
        GregorianCalendar fecha2Aux = fechaHoy;
                
        String fecha1 = "";
        String fecha2 = "";
        String consulta = "";
        
        if(banderaFiltroFecha == true){
            
            if(fechaFiltrar1Field.getText().length() >= 1){
                fecha1 = fechaFiltrar1Field.getText();
                fecha1Aux = ValidaFecha.setFechaAlta(fecha1, 0);
            }
            
            if(fechaFiltrar2Field.getText().length() >= 1){
                fecha2 = fechaFiltrar2Field.getText();
                fecha2Aux = ValidaFecha.setFechaAlta(fecha2, 0);
            }
            
            if(fecha1Aux != fechaHoy && fecha2Aux != fechaHoy){
                consulta = "SELECT * FROM EMPLEADO WHERE FECHAALTA >= '"+fecha1+"' AND FECHAALTA <= '"+fecha2+"'";
            }else{
                System.out.print("\nEl filtro por fecha esta activado, pero la fecha es nula o erronea, asegurese de que sea correcta.");
                consulta = "SELECT * FROM EMPLEADO";
            }
           
        } else if (banderaFiltroFecha == false){
            consulta = "SELECT * FROM EMPLEADO";
        }
        
        try {

            var con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", "AntFran", "netbeans");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(consulta);
            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();

            while (rs.next()) {
                
                cadenaAux = "";
                
                for (int i = 1; i <= numCols; i++) {
                    
                    cadenaAux += rs.getString(i);
                    if(i != numCols){
                        cadenaAux += ",";
                    }
                    
                } 
                
                arrayString = cadenaAux.split(",");
                
                numero = Integer.parseInt(arrayString[0]);
                nombre = arrayString[1];
                apellido = arrayString[2];
                foto = arrayString[3];
                sueldo = Float.parseFloat(arrayString[4]);
                sueldoMaximo = Float.parseFloat(arrayString[5]);
                fechaAux = arrayString[6];
                fechaAlta = ValidaFecha.setFechaAlta(fechaAux, 0);
                
                Empleado empleAux = new Empleado(numero, nombre, apellido, foto, sueldo, sueldoMaximo, fechaAlta);
                
                empleados.add(empleAux);
                
            }
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        
        for(Empleado aux: empleados){
            fechaAux = format(aux.getFechaAlta());
            defLisMod.addElement("Numero: " + aux.getNumero() + " Apellido: " + aux.getApellido() + " Sueldo: " + aux.getSueldo() + " Sueldo maximo: " + aux.getSueldoMaximo() + " Fecha de alta: " + fechaAux);
        }
        
    }//GEN-LAST:event_fechaBuscarBotonActionPerformed

    public static String format(GregorianCalendar calendar) { //pasa de gregorian calendar a string
        
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        fmt.setCalendar(calendar);
        String dateFormatted = fmt.format(calendar.getTime());

        return dateFormatted;
        
    }
    
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
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazGrafica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazGrafica().setVisible(true);
            }
        });
    }

    //Variables
    private static boolean banderaFiltroFecha = false;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar BarraMenu;
    private javax.swing.JMenuItem Inicio;
    private javax.swing.JPanel InicioPanel;
    private javax.swing.JList<String> JListEmpleados;
    private javax.swing.JMenuItem VisualizarJList;
    private javax.swing.JPanel VisualizarJListPanel;
    private javax.swing.JPanel VisualizarUnoPanel;
    private javax.swing.JTextField apellidoEmpleadoField;
    private javax.swing.JLabel apellidoEmpleadoLabel;
    private javax.swing.JLabel autor1;
    private javax.swing.JLabel autor2;
    private javax.swing.JLabel autores;
    private javax.swing.JButton botonAvanzar;
    private javax.swing.JButton botonRetroceder;
    private javax.swing.JTextField fechaAltaEmpleadoField;
    private javax.swing.JLabel fechaAltaEmpleadoLabel;
    private javax.swing.JButton fechaBuscarBoton;
    private javax.swing.JTextField fechaFiltrar1Field;
    private javax.swing.JLabel fechaFiltrar1Label;
    private javax.swing.JTextField fechaFiltrar2Field;
    private javax.swing.JLabel fechaFiltrar2Label;
    private javax.swing.JButton fechaFiltrarBoton;
    private javax.swing.JLabel filtroApellidosLabel;
    private javax.swing.JLabel fotoEmpleadoLabel;
    private javax.swing.JComboBox<String> listaApellidosCombo;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JTextField nombreEmpleadoField;
    private javax.swing.JLabel nombreEmpleadoLabel;
    private javax.swing.JTextField numeroEmpleadoField;
    private javax.swing.JLabel numeroEmpleadoLabel;
    private javax.swing.JScrollPane panelScroll;
    private javax.swing.JTextField sueldoEmpleadoField;
    private javax.swing.JLabel sueldoEmpleadoLabel;
    private javax.swing.JLabel tituloInicio;
    private javax.swing.JLabel tituloVisualizarJList;
    private javax.swing.JLabel tituloVisualizarUno;
    private javax.swing.JMenuItem visualizarUno;
    // End of variables declaration//GEN-END:variables
}
