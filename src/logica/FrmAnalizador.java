/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.file.Files;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import javax.swing.JFileChooser;

/**
 *
 * @author CDCSarjento
 */
public class FrmAnalizador extends javax.swing.JFrame {

    /**
     * Creates new form FrmAnalizador
     */
    public FrmAnalizador() {
        initComponents();
        this.Boton_Ejecutar.setEnabled(false);
        this.Boton_Ejecutable.setEnabled(false);
        this.Boton_Intermedio.setEnabled(false);
        this.Boton_Assembler.setEnabled(false);
    }

    String rutaArchivo = "";
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnAbrir = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCrear1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resultado = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnBorrarSin = new javax.swing.JButton();
        btnGuardarSin = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAnalizarSin = new javax.swing.JTextArea();
        btnSintactico = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnAnalisis = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnGuardarAnalisis = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAnalizarLex = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        Boton_Objeto = new javax.swing.JButton();
        Boton_Ejecutar = new javax.swing.JButton();
        Boton_Ejecutable = new javax.swing.JButton();
        Boton_Intermedio = new javax.swing.JButton();
        Boton_Assembler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Léxico");

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        btnAbrir.setFont(btnAbrir.getFont().deriveFont((btnAbrir.getFont().getStyle() & ~java.awt.Font.ITALIC), btnAbrir.getFont().getSize()+3));
        btnAbrir.setText("Abrir Archivo");
        btnAbrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAbrirActionPerformed(evt);
            }
        });

        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(51, 51, 51));
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCrear1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCrear1.setText("Crear Archivo");
        btnCrear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrear1ActionPerformed(evt);
            }
        });

        Resultado.setColumns(20);
        Resultado.setRows(5);
        jScrollPane1.setViewportView(Resultado);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel5.setText("Código");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCrear1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(221, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(17, 17, 17)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(btnAbrir, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrear1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(252, 252, 252))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(jLabel5)
                    .addContainerGap(564, Short.MAX_VALUE)))
        );

        jLabel1.setText("Ubicación de archivo: ");

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        btnBorrarSin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrarSin.setText("Limpiar");
        btnBorrarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarSinActionPerformed(evt);
            }
        });

        btnGuardarSin.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardarSin.setText("Guardar");
        btnGuardarSin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSinActionPerformed(evt);
            }
        });

        txtAnalizarSin.setColumns(20);
        txtAnalizarSin.setRows(5);
        jScrollPane3.setViewportView(txtAnalizarSin);

        btnSintactico.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnSintactico.setLabel("Ejecutar");
        btnSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSintacticoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel3.setText("Análisis Sintactico ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnSintactico)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnBorrarSin, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGuardarSin))
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(25, 25, 25)
                .addComponent(btnSintactico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrarSin)
                    .addComponent(btnGuardarSin))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 255, 153));

        btnAnalisis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnAnalisis.setLabel("Ejecutar");
        btnAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalisisActionPerformed(evt);
            }
        });

        btnBorrar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBorrar.setText("Limpiar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });

        btnGuardarAnalisis.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnGuardarAnalisis.setText("Guardar");
        btnGuardarAnalisis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarAnalisisActionPerformed(evt);
            }
        });

        txtAnalizarLex.setColumns(20);
        txtAnalizarLex.setRows(5);
        jScrollPane2.setViewportView(txtAnalizarLex);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel4.setText("Análisis Léxico");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAnalisis)
                        .addGap(0, 195, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarAnalisis)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel4)
                .addGap(26, 26, 26)
                .addComponent(btnAnalisis)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBorrar)
                    .addComponent(btnGuardarAnalisis))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Boton_Objeto.setText("Objeto");
        Boton_Objeto.setActionCommand("Boton_Objeto");
        Boton_Objeto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_ObjetoActionPerformed(evt);
            }
        });

        Boton_Ejecutar.setText("Ejecutar");
        Boton_Ejecutar.setActionCommand("Boton_Ejecutar");
        Boton_Ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EjecutarActionPerformed(evt);
            }
        });

        Boton_Ejecutable.setText("Ejecutable");
        Boton_Ejecutable.setActionCommand("Boton_Ejecutable");
        Boton_Ejecutable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_EjecutableActionPerformed(evt);
            }
        });

        Boton_Intermedio.setText("Intermedio");
        Boton_Intermedio.setActionCommand("Boton_Intermedio");
        Boton_Intermedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_IntermedioActionPerformed(evt);
            }
        });

        Boton_Assembler.setText("Assembler");
        Boton_Assembler.setActionCommand("Boton_Assembler");
        Boton_Assembler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AssemblerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton_Objeto)
                                .addGap(46, 46, 46)
                                .addComponent(Boton_Ejecutable)
                                .addGap(46, 46, 46)
                                .addComponent(Boton_Ejecutar)
                                .addGap(44, 44, 44)
                                .addComponent(Boton_Intermedio)
                                .addGap(47, 47, 47)
                                .addComponent(Boton_Assembler))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 741, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Objeto)
                    .addComponent(Boton_Ejecutable)
                    .addComponent(Boton_Intermedio)
                    .addComponent(Boton_Assembler)
                    .addComponent(Boton_Ejecutar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void analizarLexico() throws IOException {

        int contador = 1;

        String expresion = (String) Resultado.getText();
        Lexico lexicos = new Lexico(new StringReader(expresion));
        String resultado = "LINEA " + contador + " \t\t\tCARACTER\n\n";
        while (true) {
            Tokens token = lexicos.yylex();
            if (token == null) {
                resultado += "FIN";
                txtAnalizarLex.setText(resultado);
                return;
            }
            switch (token) {
                case Linea:
                    contador++;
                    resultado += "LINEA " + contador + "\n\n";
                    break;
                case Comillas:
                    resultado += "  Comillas\t\t  --> \t " + lexicos.lexemas + "\n\n";
                    break;
                case Cadena:
                    resultado += "  Tipo de dato\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case T_dato:
                    resultado += "  Tipo de dato\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case If:
                    resultado += "  Reservada if\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Int:
                    resultado += "  Reservada int\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Else:
                    resultado += "  Reservada else\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Do:
                    resultado += "  Reservada do\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case While:
                    resultado += "  Reservada while\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case For:
                    resultado += "  Reservada for\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Igual:
                    resultado += "  Operador igual\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Suma:
                    resultado += "  Operador suma\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Resta:
                    resultado += "  Operador resta\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Multiplicacion:
                    resultado += "  Operador multiplicacion\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Division:
                    resultado += "  Operador division\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Op_logico:
                    resultado += "  Operador logico\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Op_incremento:
                    resultado += "  Operador incremento\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Op_decremento:
                    resultado += "  Operador decremento\t --> \t" + lexicos.lexemas + "\n\n";
                case Op_relacional:
                    resultado += "  Operador relacional\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Op_atribucion:
                    resultado += "  Operador atribucion\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Op_booleano:
                    resultado += "  Operador booleano>\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Parent_a:
                    resultado += "  Parentesis de apertura\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Parent_c:
                    resultado += "  Parentesis de cierre\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Llave_a:
                    resultado += "  Llave de apertura\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Llave_c:
                    resultado += "  Llave de cierre\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Corchete_a:
                    resultado += "  Corchete de apertura\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Corchete_c:
                    resultado += "  Corchete de cierre\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Main:
                    resultado += "  Reservada main\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case P_Coma:
                    resultado += "  Punto y coma\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Punto:
                    resultado += "  Punto\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Coma:
                    resultado += "  Coma\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;    
                case Identificador:
                    resultado += "  Identificador\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Numero:
                    resultado += "  Numero\t\t --> \t" + lexicos.lexemas + "\n\n";
                    break;
                case Include:
                    resultado += "  Include\t\t --> \t" + lexicos.lexemas + "\n\n";
                case ERROR:
                    resultado += "  Simbolo no definido\n\n";
                    break;
                default:
                    //resultado += " Token: " + token + "\n\n";
                    resultado += " Token:  " + lexicos.lexemas + " \n\n";
                    break;
            }
        }

    }

    private void btnAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalisisActionPerformed
        try {
            analizarLexico();
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnalisisActionPerformed

    private void btnAbrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAbrirActionPerformed
        int contador = 1;
        JFileChooser escoger = new JFileChooser();
        escoger.showOpenDialog(null);
        File arc = new File(escoger.getSelectedFile().getAbsolutePath());
        rutaArchivo = arc.getPath();

        try {
            String ST = new String(Files.readAllBytes(arc.toPath()));
            Resultado.setText(ST);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAbrirActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
        txtAnalizarLex.setText(null);
    }//GEN-LAST:event_btnBorrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        File archivo = new File(rutaArchivo);
        PrintWriter escribir;
        try {
            escribir = new PrintWriter(archivo);
            escribir.print(Resultado.getText());
            escribir.close();
            
            //jLabelInforme.setText("Guardado en:");
            jLabel2.setText(rutaArchivo);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnGuardarAnalisisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarAnalisisActionPerformed
        // TODO add your handling code here:
        String directorioRaiz = System.getProperty("user.dir");
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
        String fechaCreacion = hourdateFormat.format(date);
    
        File archivo = new File(directorioRaiz +"\\Analisis_"+fechaCreacion+ ".txt");
        PrintWriter analisis;
        try {
            analisis = new PrintWriter(archivo);
            analisis.print("/------  ....  |-----     Análisis Léxico Resultante ------/ \n\n\n");
            analisis.print(txtAnalizarLex.getText());
            analisis.close();
            jLabel2.setText(archivo.getPath());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarAnalisisActionPerformed

    private void btnCrear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrear1ActionPerformed
        // TODO add your handling code here:
        String directorioRaiz = System.getProperty("user.dir");
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
        String fechaCreacion = hourdateFormat.format(date);
    
        File archivo = new File(directorioRaiz +"\\Archivo"+fechaCreacion+ ".txt");
        PrintWriter nuevoArchivo;
        try {
            nuevoArchivo = new PrintWriter(archivo);
            nuevoArchivo.print("/---- Archivo Nuevo ------/ \n\n\n");
            nuevoArchivo.print(Resultado.getText());
            nuevoArchivo.close();
            jLabel2.setText(archivo.getPath());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCrear1ActionPerformed

    private void btnGuardarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSinActionPerformed
         String directorioRaiz = System.getProperty("user.dir");
        Date date = new Date();
        DateFormat hourdateFormat = new SimpleDateFormat("HH.mm.ss dd-MM-yyyy");
        String fechaCreacion = hourdateFormat.format(date);
    
        File archivo = new File(directorioRaiz +"\\Analisis_"+fechaCreacion+ ".txt");
        PrintWriter analisis;
        try {
            analisis = new PrintWriter(archivo);
            analisis.print("/------  ....  |-----     Análisis Sintáctico Resultante ------/ \n\n\n");
            analisis.print(txtAnalizarSin.getText());
            analisis.close();
            jLabel2.setText(archivo.getPath());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FrmAnalizador.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGuardarSinActionPerformed

    private void btnBorrarSinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarSinActionPerformed
        txtAnalizarSin.setText(null);
    }//GEN-LAST:event_btnBorrarSinActionPerformed

    private void btnSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSintacticoActionPerformed
        String ST = Resultado.getText();
        Sintax s = new Sintax(new logica.LexicoCup(new StringReader(ST)));

        try {
            s.parse();
            txtAnalizarSin.setText("Analisis realizado correctamente");
            txtAnalizarSin.setForeground(new Color(25, 111, 61));
        } catch (Exception ex) {
            Symbol sym = s.getS();
            txtAnalizarSin.setText("Error de sintaxis. Linea: " + (sym.right + 1) + " Columna: " + (sym.left + 1) + ", Texto: \"" + sym.value + "\"");
            txtAnalizarSin.setForeground(Color.red);
        }
    }//GEN-LAST:event_btnSintacticoActionPerformed

    private void Boton_ObjetoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_ObjetoActionPerformed
        try { 
            String[] gobjeto = {"C:/Program Files (x86)/Dev-Cpp/objeto.bat"};
            Runtime.getRuntime().exec(gobjeto);                    
            System.out.println("Ejecucion del convertidor assembler a objeto");
            Boton_Ejecutable.setEnabled(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_Boton_ObjetoActionPerformed

    private void Boton_EjecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EjecutarActionPerformed
        try {
            String [] comando={"C:/Program Files (x86)/Dev-Cpp/correr.bat"};
            Runtime.getRuntime().exec(comando);
            System.out.println("Ejecucion del programa en el sistema operativo");
            Boton_Intermedio.setEnabled(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_Boton_EjecutarActionPerformed

    private void Boton_EjecutableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_EjecutableActionPerformed
        try { 
            String[] gejecutable = {"C:/Program Files (x86)/Dev-Cpp/ejecutable.bat"};
            Runtime.getRuntime().exec(gejecutable);            
            System.out.println("Ejecucion del generador del programa ejecutable");
            Boton_Ejecutar.setEnabled(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_Boton_EjecutableActionPerformed

    private void Boton_IntermedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_IntermedioActionPerformed
        try {
            String[] intermedio = {"C:/Program Files (x86)/Dev-Cpp/intermedio.bat"};
            Runtime.getRuntime().exec(intermedio);             
            System.out.println("Ejecucion del convertidor de código fuente a código intermedio");
            Boton_Assembler.setEnabled(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_Boton_IntermedioActionPerformed

    private void Boton_AssemblerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AssemblerActionPerformed
        try {
            String[] gassembler = {"C:/Program Files (x86)/Dev-Cpp/ensamblador.bat"};
            Runtime.getRuntime().exec(gassembler);             
            System.out.println("Ejecucion del convertidor de código intermedio a assembler");
            Boton_Objeto.setEnabled(true);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_Boton_AssemblerActionPerformed

    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAnalizador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAnalizador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Assembler;
    private javax.swing.JButton Boton_Ejecutable;
    private javax.swing.JButton Boton_Ejecutar;
    private javax.swing.JButton Boton_Intermedio;
    private javax.swing.JButton Boton_Objeto;
    private javax.swing.JTextArea Resultado;
    private javax.swing.JButton btnAbrir;
    private javax.swing.JButton btnAnalisis;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnBorrarSin;
    private javax.swing.JButton btnCrear1;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarAnalisis;
    private javax.swing.JButton btnGuardarSin;
    private javax.swing.JButton btnSintactico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea txtAnalizarLex;
    private javax.swing.JTextArea txtAnalizarSin;
    // End of variables declaration//GEN-END:variables


}
