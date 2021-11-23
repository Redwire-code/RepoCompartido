/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Color;

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
        
        //Creamos la base de datos
        //Conexion con = new Conexion();
        //conex.creaBaseDeDatos();
        
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
    
    public void estableceTemaJList(){ //Establece el tema 
    
        //Establecemos el color de fondo del panel
        VisualizarJListPanel.setBackground(fondoPanel);
        
        //Establecemos el color de la letra de las etiquetas
        tituloVisualizarJList.setForeground(letras);
        fechaFiltrarLabel.setForeground(letras);
        
        //Establecemos el fondo del panel de scroll
        JListEmpleados.setBackground(fondoPanel);
        JListEmpleados.setForeground(letrasC);
        
        //Establecemos los colores de del boton
        //Establecemos el color de fondo
        fechaFiltrarBoton.setBackground(fondoPanel);
        fechaFiltrarBoton.setForeground(letras);
        
        //Establecemos el color del field
        //Establecemos el color de fondo
        fechaFiltrarField.setBackground(fondoPanel);
        fechaFiltrarField.setForeground(letras);
        
        //Establecemos el texto de 
        fechaFiltrarField.setText("");
        
    }
    
    public void estableceTemaVisualizaUno(){ //Establece el tema de el panel visualizar uno a uno
    
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
        fotoEmpleadoField.setForeground(letrasC);
        sueldoEmpleadoField.setForeground(letrasC);
        fechaAltaEmpleadoField.setForeground(letrasC);
        
        //Color de fondo
        tituloVisualizarUno.setBackground(fondoPanel);
        numeroEmpleadoField.setBackground(fondoPanel);
        nombreEmpleadoField.setBackground(fondoPanel);
        apellidoEmpleadoField.setBackground(fondoPanel);
        fotoEmpleadoField.setBackground(fondoPanel);
        sueldoEmpleadoField.setBackground(fondoPanel);
        fechaAltaEmpleadoField.setBackground(fondoPanel);
        
        //Establecemos el texto de los field en blanco
        numeroEmpleadoField.setText("");
        nombreEmpleadoField.setText("");
        apellidoEmpleadoField.setText("");
        fotoEmpleadoField.setText("");
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
    
    public void estableceTemaIncio(){ //Establece el tema del panel de inicio
    
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
        fechaFiltrarLabel = new javax.swing.JLabel();
        fechaFiltrarField = new javax.swing.JTextField();
        fechaFiltrarBoton = new javax.swing.JButton();
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
        fotoEmpleadoField = new javax.swing.JTextField();
        sueldoEmpleadoField = new javax.swing.JTextField();
        fechaAltaEmpleadoField = new javax.swing.JTextField();
        botonAvanzar = new javax.swing.JButton();
        botonRetroceder = new javax.swing.JButton();
        filtroApellidosLabel = new javax.swing.JLabel();
        listaApellidosCombo = new javax.swing.JComboBox<>();
        separador = new javax.swing.JSeparator();
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

        tituloVisualizarJList.setText("Datos de los empleados:");

        panelScroll.setViewportView(JListEmpleados);

        fechaFiltrarLabel.setText("Filtrar por fecha:");

        fechaFiltrarField.setText("jTextField1");

        fechaFiltrarBoton.setText("Aplicar");

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
                    .addGroup(VisualizarJListPanelLayout.createSequentialGroup()
                        .addComponent(fechaFiltrarLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fechaFiltrarField, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(fechaFiltrarBoton)))
                .addContainerGap())
        );
        VisualizarJListPanelLayout.setVerticalGroup(
            VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarJListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVisualizarJList)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelScroll, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VisualizarJListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaFiltrarLabel)
                    .addComponent(fechaFiltrarField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fechaFiltrarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        tituloVisualizarUno.setText("Datos del empleado:");

        numeroEmpleadoLabel.setText("Numero:");

        nombreEmpleadoLabel.setText("Nombre:");

        apellidoEmpleadoLabel.setText("Apellido:");

        fotoEmpleadoLabel.setText("Foto:");

        sueldoEmpleadoLabel.setText("Sueldo:");

        fechaAltaEmpleadoLabel.setText("Fecha de Alta:");

        numeroEmpleadoField.setText("jTextField1");

        nombreEmpleadoField.setText("jTextField2");

        apellidoEmpleadoField.setText("jTextField3");

        fotoEmpleadoField.setText("jTextField4");

        sueldoEmpleadoField.setText("jTextField5");

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

        filtroApellidosLabel.setText("Filtro por apellidos:");

        listaApellidosCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout VisualizarUnoPanelLayout = new javax.swing.GroupLayout(VisualizarUnoPanel);
        VisualizarUnoPanel.setLayout(VisualizarUnoPanelLayout);
        VisualizarUnoPanelLayout.setHorizontalGroup(
            VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numeroEmpleadoLabel)
                            .addComponent(nombreEmpleadoLabel)
                            .addComponent(apellidoEmpleadoLabel)
                            .addComponent(fotoEmpleadoLabel)
                            .addComponent(sueldoEmpleadoLabel)
                            .addComponent(fechaAltaEmpleadoLabel))
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(numeroEmpleadoField, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                    .addComponent(nombreEmpleadoField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(listaApellidosCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                                        .addComponent(filtroApellidosLabel)
                                        .addGap(0, 72, Short.MAX_VALUE))))
                            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(sueldoEmpleadoField)
                                    .addComponent(fechaAltaEmpleadoField)
                                    .addComponent(fotoEmpleadoField)
                                    .addComponent(apellidoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                        .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tituloVisualizarUno)
                            .addComponent(botonRetroceder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAvanzar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addComponent(separador, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        VisualizarUnoPanelLayout.setVerticalGroup(
            VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(VisualizarUnoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tituloVisualizarUno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numeroEmpleadoLabel)
                    .addComponent(numeroEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filtroApellidosLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreEmpleadoLabel)
                    .addComponent(listaApellidosCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellidoEmpleadoLabel)
                    .addComponent(apellidoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fotoEmpleadoLabel)
                    .addComponent(fotoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sueldoEmpleadoLabel)
                    .addComponent(sueldoEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaAltaEmpleadoLabel)
                    .addComponent(fechaAltaEmpleadoField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(separador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(VisualizarUnoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonAvanzar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonRetroceder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

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
                        .addGap(106, 106, 106)
                        .addComponent(tituloInicio))
                    .addGroup(InicioPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(autores)
                            .addGroup(InicioPanelLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(autor2)
                                    .addComponent(autor1))))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        InicioPanelLayout.setVerticalGroup(
            InicioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(InicioPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(tituloInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
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
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VisualizarJListPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VisualizarUnoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InicioPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 286, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VisualizarJListPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(VisualizarUnoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(InicioPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
    }//GEN-LAST:event_visualizarUnoActionPerformed

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
    private javax.swing.JButton fechaFiltrarBoton;
    private javax.swing.JTextField fechaFiltrarField;
    private javax.swing.JLabel fechaFiltrarLabel;
    private javax.swing.JLabel filtroApellidosLabel;
    private javax.swing.JTextField fotoEmpleadoField;
    private javax.swing.JLabel fotoEmpleadoLabel;
    private javax.swing.JComboBox<String> listaApellidosCombo;
    private javax.swing.JMenu menuOpciones;
    private javax.swing.JTextField nombreEmpleadoField;
    private javax.swing.JLabel nombreEmpleadoLabel;
    private javax.swing.JTextField numeroEmpleadoField;
    private javax.swing.JLabel numeroEmpleadoLabel;
    private javax.swing.JScrollPane panelScroll;
    private javax.swing.JSeparator separador;
    private javax.swing.JTextField sueldoEmpleadoField;
    private javax.swing.JLabel sueldoEmpleadoLabel;
    private javax.swing.JLabel tituloInicio;
    private javax.swing.JLabel tituloVisualizarJList;
    private javax.swing.JLabel tituloVisualizarUno;
    private javax.swing.JMenuItem visualizarUno;
    // End of variables declaration//GEN-END:variables
}
