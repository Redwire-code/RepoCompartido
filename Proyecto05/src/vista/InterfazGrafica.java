/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.ValidaFecha;
import java.awt.Color;
import java.awt.Image;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
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
        
        botonRetroceder.setEnabled(false);

       
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

        //Establecemos el texto de los field de la fecha
        fechaFiltrar1Field.setText("");
        fechaFiltrar2Field.setText("");

    }

    public void estableceTemaVisualizaUno() { //Establece el tema de el panel visualizar uno a uno
        
        jLabelImagen.setText("");
        //Establecemos color de las etiquetas
        VisualizarUnoPanel.setBackground(fondoPanel);
        tituloVisualizarUno.setForeground(letras);
        numeroEmpleadoLabel.setForeground(letras);
        nombreEmpleadoLabel.setForeground(letras);
        apellidoEmpleadoLabel.setForeground(letras);
        sueldoEmpleadoLabel.setForeground(letras);
        fechaAltaEmpleadoLabel.setForeground(letras);
        filtroApellidosLabel.setForeground(letras);
        jLabelSalario.setForeground(letras);
        fotoEmpleadoLabel.setForeground(letras);
        
        //Establecemos color de los field
        //Color de la letra
        tituloVisualizarUno.setForeground(letras);
        numeroEmpleadoField.setForeground(letrasC);
        nombreEmpleadoField.setForeground(letrasC);
        apellidoEmpleadoField.setForeground(letrasC);

        sueldoEmpleadoField.setForeground(letrasC);
        fechaAltaEmpleadoField.setForeground(letrasC);
        salarioMaximoEmpleadoField.setForeground(letrasC);

        //Color de fondo
        tituloVisualizarUno.setBackground(fondoPanel);
        numeroEmpleadoField.setBackground(fondoPanel);
        nombreEmpleadoField.setBackground(fondoPanel);
        apellidoEmpleadoField.setBackground(fondoPanel);

        sueldoEmpleadoField.setBackground(fondoPanel);
        salarioMaximoEmpleadoField.setBackground(fondoPanel);
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
        botonAplicarFiltro.setForeground(letras);
        botonCancelarFiltro.setForeground(letras);

        //Establecemos el color del fondo
        botonAvanzar.setBackground(fondoPanel);
        botonRetroceder.setBackground(fondoPanel);
        botonAplicarFiltro.setBackground(fondoPanel);
        botonCancelarFiltro.setBackground(fondoPanel);
        
        //Establecemos el color del comboBox
        //Establecemos el color de fondo
        listaApellidosCombo.setBackground(fondoPanel);
        
        
        botonCancelarFiltro.setEnabled(false);

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
        fechaBuscarBoton = new javax.swing.JButton();
        fechaFiltrarBoton = new javax.swing.JButton();
        fechaFiltrar2Label = new javax.swing.JLabel();
        fechaFiltrar2Field = new javax.swing.JTextField();
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
        jLabelImagen = new javax.swing.JLabel();
        botonAplicarFiltro = new javax.swing.JButton();
        botonCancelarFiltro = new javax.swing.JButton();
        jLabelSalario = new javax.swing.JLabel();
        salarioMaximoEmpleadoField = new javax.swing.JTextField();
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

        fechaFiltrar1Label.setText("Primera fecha:");

        fechaBuscarBoton.setText("Buscar");
        fechaBuscarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaBuscarBotonActionPerformed(evt);
            }
        });

        fechaFiltrarBoton.setText("Aplicar");
        fechaFiltrarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaFiltrarBotonActionPerformed(evt);
            }
        });

        fechaFiltrar2Label.setText("Segunda fecha:");

        javax.swing.GroupLayout VisualizarJListPanelLayout = new javax.swing.GroupLayout(VisualizarJListPanel);
        VisualizarJListPanel.setLayout(VisualizarJListPanelLayout);
        VisualizarJListPanelLayout.setHorizontalGroup(
            VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarJListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelScroll)
                    .addGroup(VisualizarJListPanelLayout.createSequentialGroup()
                        .addComponent(tituloVisualizarJList)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VisualizarJListPanelLayout.createSequentialGroup()
                        .addComponent(fechaFiltrar1Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaFiltrar1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaFiltrar2Label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fechaFiltrar2Field, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 165, Short.MAX_VALUE)
                        .addComponent(fechaBuscarBoton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaFiltrarBoton)))
                .addContainerGap())
        );
        VisualizarJListPanelLayout.setVerticalGroup(
            VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarJListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVisualizarJList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fechaFiltrarBoton)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fechaFiltrar1Field, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fechaFiltrar1Label)
                        .addComponent(fechaFiltrar2Label)
                        .addComponent(fechaFiltrar2Field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fechaBuscarBoton))
                .addGap(40, 40, 40))
        );

        panelScroll.getAccessibleContext().setAccessibleName("");

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
        nombreEmpleadoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreEmpleadoFieldActionPerformed(evt);
            }
        });

        apellidoEmpleadoField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        sueldoEmpleadoField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N

        fechaAltaEmpleadoField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        fechaAltaEmpleadoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fechaAltaEmpleadoFieldActionPerformed(evt);
            }
        });

        botonAvanzar.setText("Avanzar");
        botonAvanzar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAvanzarMouseClicked(evt);
            }
        });
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

        jLabelImagen.setText("jLabel1");

        botonAplicarFiltro.setText("Aplicar Filtro");
        botonAplicarFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonAplicarFiltroMouseClicked(evt);
            }
        });
        botonAplicarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAplicarFiltroActionPerformed(evt);
            }
        });

        botonCancelarFiltro.setText("Cancelar Filtro");
        botonCancelarFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonCancelarFiltroMouseClicked(evt);
            }
        });
        botonCancelarFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarFiltroActionPerformed(evt);
            }
        });

        jLabelSalario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabelSalario.setText("Salario Maximo: ");

        salarioMaximoEmpleadoField.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        salarioMaximoEmpleadoField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salarioMaximoEmpleadoFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout VisualizarUnoPanelLayout = new javax.swing.GroupLayout(VisualizarUnoPanel);
        VisualizarUnoPanel.setLayout(VisualizarUnoPanelLayout);
        VisualizarUnoPanelLayout.setHorizontalGroup(
            VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tituloVisualizarUno, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VisualizarUnoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonCancelarFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VisualizarUnoPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(filtroApellidosLabel)
                            .addComponent(listaApellidosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, VisualizarUnoPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(botonAplicarFiltro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                            .addComponent(jLabelImagen)
                            .addComponent(fechaAltaEmpleadoField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(numeroEmpleadoField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nombreEmpleadoField)
                            .addComponent(apellidoEmpleadoField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sueldoEmpleadoField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)
                            .addComponent(botonAvanzar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(salarioMaximoEmpleadoField, javax.swing.GroupLayout.DEFAULT_SIZE, 183, Short.MAX_VALUE)))
                    .addComponent(botonRetroceder)
                    .addComponent(jLabelSalario))
                .addGap(21, 21, 21))
        );
        VisualizarUnoPanelLayout.setVerticalGroup(
            VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(tituloVisualizarUno)
                .addGap(37, 37, 37)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonAvanzar)
                            .addComponent(botonRetroceder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(numeroEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numeroEmpleadoLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreEmpleadoLabel)
                            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                                .addComponent(nombreEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(apellidoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(apellidoEmpleadoLabel))))
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(jLabelImagen))
                            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(fotoEmpleadoLabel)))
                        .addGap(52, 52, 52)
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sueldoEmpleadoLabel)
                            .addComponent(sueldoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fechaAltaEmpleadoLabel)
                            .addComponent(fechaAltaEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSalario)
                            .addComponent(salarioMaximoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(281, Short.MAX_VALUE))
                    .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                        .addComponent(filtroApellidosLabel)
                        .addGap(44, 44, 44)
                        .addComponent(listaApellidosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAplicarFiltro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonCancelarFiltro)
                        .addGap(45, 45, 45))))
        );

        InicioPanel.setPreferredSize(new java.awt.Dimension(700, 700));

        tituloInicio.setFont(new java.awt.Font("Javanese Text", 1, 24)); // NOI18N
        tituloInicio.setText("                         Gestión Penitenciaría de Burgos");

        autores.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        autores.setText("Realizado por:");

        autor1.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        autor1.setText("- Francisco Javier Martínez Martínez");

        autor2.setFont(new java.awt.Font("Javanese Text", 0, 14)); // NOI18N
        autor2.setText("- Antonio Carrasco García");

        javax.swing.GroupLayout InicioPanelLayout = new javax.swing.GroupLayout(InicioPanel);
        InicioPanel.setLayout(InicioPanelLayout);
        InicioPanelLayout.setHorizontalGroup(
            InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(autores)
                    .addGroup(InicioPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autor2)
                            .addComponent(autor1))))
                .addContainerGap(450, Short.MAX_VALUE))
            .addComponent(tituloInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        InicioPanelLayout.setVerticalGroup(
            InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 506, Short.MAX_VALUE)
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
            .addComponent(VisualizarJListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VisualizarUnoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InicioPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(VisualizarJListPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
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
        if(!filtro)
            if (primeraVez) {
                botonRetroceder.setEnabled(false);
            } else {
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                } catch (Exception e) {
                    System.out.println("JDBC driver failed to load.");
                    return;
                }
                try {
                    var con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", "AntFran", "netbeans");
                    funcionRetroceder();
                    botonAvanzar.setEnabled(true);
                } catch (Exception e) {
                    System.out.println(e);
                }

            }
        else{
            
            try {
                funcionRetroceder();
            } catch (SQLException ex) {
                Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
        }


    }//GEN-LAST:event_botonRetrocederActionPerformed

    private void funcionRetroceder() throws SQLException {

       
        if(!rs.isFirst()){
            botonRetroceder.setEnabled(true);
            if (rs.previous()) {
                
                if(rs.isFirst())
                    botonRetroceder.setEnabled(false);
                
                botonAvanzar.setEnabled(true);
                    
                agregarDatosTextField();
            } else {
                VentanaEmergente.mostrarMensajeVentana("No hay más registros");
            }
            
        }else
            botonRetroceder.setEnabled(false);
        
        
        
    }

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
        
         try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (Exception e) {
            System.out.println("JDBC driver falied to load.");
            return;
        }

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
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (Exception e) {
            System.out.println("JDBC driver falied to load.");
            return;
        }

        try {

            var con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", "AntFran", "netbeans");
            Statement stmt = con.createStatement();
            ResultSet reSet = stmt.executeQuery("SELECT DISTINCT APELLIDO FROM EMPLEADO");
            ResultSetMetaData rsmd = reSet.getMetaData();
            int numCols = rsmd.getColumnCount();
              
            
            
            
            while (reSet.next())
                for (int i = 1; i <= numCols; i++) 
                    listaApellidosCombo.addItem(reSet.getString(i));    
            reSet.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }//GEN-LAST:event_visualizarUnoActionPerformed

    private void botonAvanzarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAvanzarMouseClicked
        // TODO add your handling code here:
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
        } catch (Exception e) {
            System.out.println("JDBC driver failed to load.");
            return;
        }
        
        Connection con; 
        Statement stmt = null;
        
        try {
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", "AntFran", "netbeans");
            stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
        } catch (SQLException ex) {
            Logger.getLogger(InterfazGrafica.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        if (!filtro) {
            try {
                if (primeraVez) {
                    rs = stmt.executeQuery("SELECT * FROM EMPLEADO");
                    primeraVez = false;
                }
                
                funcionAvanzar();
            } catch (Exception e) {
                System.out.println(e);
            }

        } else {

            try {
                if (primeraVezFiltro) {
                    rs = stmt.executeQuery(consulta);
                    primeraVezFiltro = false;
                }
                
                funcionAvanzar();
            } catch (Exception e) {
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_botonAvanzarMouseClicked

    private void botonAplicarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAplicarFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonAplicarFiltroActionPerformed

    private void botonAplicarFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonAplicarFiltroMouseClicked
        // TODO add your handling code here:
        
        if (listaApellidosCombo.getSelectedIndex() != 0){
            filtro = true;
            reiniciarCampos();
            apell = listaApellidosCombo.getItemAt(listaApellidosCombo.getSelectedIndex());
            consulta = "SELECT * FROM EMPLEADO WHERE APELLIDO = '"+apell+"'";
            botonAplicarFiltro.setEnabled(false);
            botonCancelarFiltro.setEnabled(true);
        }else
            VentanaEmergente.mostrarMensajeVentana("No introdujo ningún filtro");
        
    }//GEN-LAST:event_botonAplicarFiltroMouseClicked

    private void botonCancelarFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonCancelarFiltroMouseClicked
        // TODO add your handling code here:
        filtro = false;
        botonAvanzar.setEnabled(true);
        botonRetroceder.setEnabled(false);
        primeraVezFiltro = true;
        botonAplicarFiltro.setEnabled(true);
        botonCancelarFiltro.setEnabled(false);
        reiniciarCampos();
        primeraVez= true;
    }//GEN-LAST:event_botonCancelarFiltroMouseClicked

    public void reiniciarCampos() {
        numeroEmpleadoField.setText("");
        nombreEmpleadoField.setText("");
        apellidoEmpleadoField.setText("");
        jLabelImagen.setText("");
        jLabelImagen.setIcon(new ImageIcon());
        sueldoEmpleadoField.setText("");
        fechaAltaEmpleadoField.setText("");
        salarioMaximoEmpleadoField.setText("");
    }

    private void botonCancelarFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarFiltroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonCancelarFiltroActionPerformed

    private void salarioMaximoEmpleadoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salarioMaximoEmpleadoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_salarioMaximoEmpleadoFieldActionPerformed

    private void fechaAltaEmpleadoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaAltaEmpleadoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fechaAltaEmpleadoFieldActionPerformed

    private void nombreEmpleadoFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreEmpleadoFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreEmpleadoFieldActionPerformed

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

            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/empresa", "AntFran", "netbeans");
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

    private void fechaFiltrarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fechaFiltrarBotonActionPerformed
        // TODO add your handling code here:
         // TODO add your handling code here:
        
        if(banderaFiltroFecha == false){
            banderaFiltroFecha = true;
        }else if(banderaFiltroFecha == true){
            banderaFiltroFecha = false;
        }
    }//GEN-LAST:event_fechaFiltrarBotonActionPerformed

      public static String format(GregorianCalendar calendar) { //pasa de gregorian calendar a string
        
        SimpleDateFormat fmt = new SimpleDateFormat("dd-MMM-yyyy");
        fmt.setCalendar(calendar);
        String dateFormatted = fmt.format(calendar.getTime());

        return dateFormatted;
        
    } 
    
    private void funcionAvanzar() throws SQLException {
        
        
        if(!rs.isLast()){
             botonAvanzar.setEnabled(true);
                
            if (rs.next()) {
                
                if(rs.isLast())
                    botonAvanzar.setEnabled(false);
                
                agregarDatosTextField();
            } else {
                botonAvanzar.setEnabled(false);
                VentanaEmergente.mostrarMensajeVentana("No hay mas registros en el filtro");
            }
        }else{
            botonAvanzar.setEnabled(false);
        }
        
        if(!rs.isFirst())
            botonRetroceder.setEnabled(true);
        else
            botonRetroceder.setEnabled(false);
       
    }
    
        private static boolean banderaFiltroFecha = false;

       

    private void agregarDatosTextField() throws SQLException {
        
        
        numeroEmpleadoField.setText(rs.getString(1));
        nombreEmpleadoField.setText(rs.getString(2));
        apellidoEmpleadoField.setText(rs.getString(3));
        
        //Redimensionamos la imagen
        Image img= new ImageIcon("./fotos/"+rs.getString(4)).getImage();
        ImageIcon img2 =new ImageIcon(img.getScaledInstance(172, 172, Image.SCALE_SMOOTH));
        
        jLabelImagen.setIcon(img2);
        sueldoEmpleadoField.setText(rs.getString(5));
        salarioMaximoEmpleadoField.setText(rs.getString(6));
        
        fechaAltaEmpleadoField.setText(rs.getString(7));
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
    
    
    static boolean primeraVezFiltro = true;
    static String apell;
    static String consulta;
    static ResultSet rs;
    static boolean primeraVez = true;
    static boolean filtro = false;

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
    private javax.swing.JButton botonAplicarFiltro;
    private javax.swing.JButton botonAvanzar;
    private javax.swing.JButton botonCancelarFiltro;
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
    private javax.swing.JLabel jLabelImagen;
    private javax.swing.JLabel jLabelSalario;
    private javax.swing.JComboBox<String> listaApellidosCombo;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JTextField nombreEmpleadoField;
    private javax.swing.JLabel nombreEmpleadoLabel;
    private javax.swing.JTextField numeroEmpleadoField;
    private javax.swing.JLabel numeroEmpleadoLabel;
    private javax.swing.JScrollPane panelScroll;
    private javax.swing.JTextField salarioMaximoEmpleadoField;
    private javax.swing.JTextField sueldoEmpleadoField;
    private javax.swing.JLabel sueldoEmpleadoLabel;
    private javax.swing.JLabel tituloInicio;
    private javax.swing.JLabel tituloVisualizarJList;
    private javax.swing.JLabel tituloVisualizarUno;
    private javax.swing.JMenuItem visualizarUno;
    // End of variables declaration//GEN-END:variables
    
}
