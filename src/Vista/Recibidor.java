package Vista;

import javax.swing.JTextArea;

public class Recibidor extends javax.swing.JFrame {
    
    public Recibidor(){
        this.setContentPane(new Personalizacion.Fondo_pantalla.FondoPanel());
        this.setExtendedState(6);
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Panel = new Personalizacion.Fondo_pantalla.FondoPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lexico = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        Entrada = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        AbrirFiles = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        Productos1 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        Respuesta = new javax.swing.JTextArea();
        jPanel7 = new javax.swing.JPanel();
        AnalizarSintactico = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        L3 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        AnalizarLexico = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        L1 = new javax.swing.JButton();
        L2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lexico.setBackground(new java.awt.Color(0, 0, 0));
        Lexico.setColumns(20);
        Lexico.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Lexico.setForeground(new java.awt.Color(0, 204, 204));
        Lexico.setRows(5);
        Lexico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jScrollPane1.setViewportView(Lexico);

        Panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 56, 739, 829));

        Entrada.setBackground(new java.awt.Color(0, 0, 0));
        Entrada.setColumns(20);
        Entrada.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        Entrada.setForeground(new java.awt.Color(0, 204, 204));
        Entrada.setRows(5);
        Entrada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 153)));
        jScrollPane2.setViewportView(Entrada);

        Panel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 56, 1209, 829));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel5.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel5.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel5.setLayout(new java.awt.BorderLayout());

        AbrirFiles.setBackground(new java.awt.Color(0, 0, 0));
        AbrirFiles.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        AbrirFiles.setForeground(new java.awt.Color(51, 255, 255));
        AbrirFiles.setText("Abrir archivo");
        AbrirFiles.setContentAreaFilled(false);
        AbrirFiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AbrirFiles.setFocusable(false);
        AbrirFiles.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AbrirFiles.setIconTextGap(15);
        AbrirFiles.setPreferredSize(new java.awt.Dimension(229, 80));
        AbrirFiles.setRequestFocusEnabled(false);
        AbrirFiles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AbrirFilesActionPerformed(evt);
            }
        });
        jPanel5.add(AbrirFiles, java.awt.BorderLayout.CENTER);

        Panel.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 12, 307, 38));

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.setForeground(new java.awt.Color(51, 51, 51));
        jPanel6.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel6.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel6.setLayout(new java.awt.BorderLayout());

        Productos1.setBackground(new java.awt.Color(51, 51, 51));
        Productos1.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        Productos1.setForeground(new java.awt.Color(51, 255, 255));
        Productos1.setText("Analizador sintactico");
        Productos1.setBorder(null);
        Productos1.setContentAreaFilled(false);
        Productos1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Productos1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Productos1.setIconTextGap(15);
        Productos1.setPreferredSize(new java.awt.Dimension(229, 80));
        Productos1.setRequestFocusEnabled(false);
        jPanel6.add(Productos1, java.awt.BorderLayout.CENTER);

        Panel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 891, 2173, 31));

        Respuesta.setBackground(new java.awt.Color(0, 0, 0));
        Respuesta.setColumns(20);
        Respuesta.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        Respuesta.setRows(5);
        Respuesta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 204)));
        jScrollPane3.setViewportView(Respuesta);

        Panel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(188, 928, 1985, -1));

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));
        jPanel7.setForeground(new java.awt.Color(51, 51, 51));
        jPanel7.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel7.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel7.setLayout(new java.awt.BorderLayout());

        AnalizarSintactico.setBackground(new java.awt.Color(0, 0, 0));
        AnalizarSintactico.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        AnalizarSintactico.setForeground(new java.awt.Color(51, 255, 255));
        AnalizarSintactico.setText("Analizar");
        AnalizarSintactico.setContentAreaFilled(false);
        AnalizarSintactico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AnalizarSintactico.setFocusable(false);
        AnalizarSintactico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AnalizarSintactico.setIconTextGap(15);
        AnalizarSintactico.setPreferredSize(new java.awt.Dimension(229, 80));
        AnalizarSintactico.setRequestFocusEnabled(false);
        AnalizarSintactico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarSintacticoActionPerformed(evt);
            }
        });
        jPanel7.add(AnalizarSintactico, java.awt.BorderLayout.CENTER);

        Panel.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 928, 182, -1));

        jPanel8.setBackground(new java.awt.Color(51, 51, 51));
        jPanel8.setForeground(new java.awt.Color(51, 51, 51));
        jPanel8.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel8.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel8.setLayout(new java.awt.BorderLayout());

        L3.setBackground(new java.awt.Color(0, 0, 0));
        L3.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        L3.setForeground(new java.awt.Color(51, 255, 255));
        L3.setText("Limpiar");
        L3.setContentAreaFilled(false);
        L3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L3.setFocusable(false);
        L3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L3.setIconTextGap(15);
        L3.setPreferredSize(new java.awt.Dimension(229, 80));
        L3.setRequestFocusEnabled(false);
        L3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L3ActionPerformed(evt);
            }
        });
        jPanel8.add(L3, java.awt.BorderLayout.CENTER);

        Panel.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 987, 182, -1));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel9.setForeground(new java.awt.Color(51, 51, 51));
        jPanel9.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel9.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel9.setLayout(new java.awt.BorderLayout());
        Panel.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(1960, 13, 213, 37));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel10.setForeground(new java.awt.Color(51, 51, 51));
        jPanel10.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel10.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel10.setLayout(new java.awt.BorderLayout());

        AnalizarLexico.setBackground(new java.awt.Color(0, 0, 0));
        AnalizarLexico.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        AnalizarLexico.setForeground(new java.awt.Color(51, 255, 255));
        AnalizarLexico.setText("Realizar analisis lexico");
        AnalizarLexico.setContentAreaFilled(false);
        AnalizarLexico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AnalizarLexico.setFocusable(false);
        AnalizarLexico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        AnalizarLexico.setIconTextGap(15);
        AnalizarLexico.setPreferredSize(new java.awt.Dimension(229, 80));
        AnalizarLexico.setRequestFocusEnabled(false);
        AnalizarLexico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnalizarLexicoActionPerformed(evt);
            }
        });
        jPanel10.add(AnalizarLexico, java.awt.BorderLayout.CENTER);

        Panel.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(1215, 13, 308, 37));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel11.setForeground(new java.awt.Color(51, 51, 51));
        jPanel11.setMinimumSize(new java.awt.Dimension(191, 42));
        jPanel11.setPreferredSize(new java.awt.Dimension(191, 50));
        jPanel11.setLayout(new java.awt.BorderLayout());

        L1.setBackground(new java.awt.Color(0, 0, 0));
        L1.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        L1.setForeground(new java.awt.Color(51, 255, 255));
        L1.setText("Limpiar");
        L1.setContentAreaFilled(false);
        L1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L1.setFocusable(false);
        L1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L1.setIconTextGap(15);
        L1.setPreferredSize(new java.awt.Dimension(229, 80));
        L1.setRequestFocusEnabled(false);
        L1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L1ActionPerformed(evt);
            }
        });
        jPanel11.add(L1, java.awt.BorderLayout.CENTER);

        Panel.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(996, 13, 213, 37));

        L2.setBackground(new java.awt.Color(0, 0, 0));
        L2.setFont(new java.awt.Font("Yu Gothic UI", 1, 25)); // NOI18N
        L2.setForeground(new java.awt.Color(51, 255, 255));
        L2.setText("Limpiar");
        L2.setContentAreaFilled(false);
        L2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        L2.setFocusable(false);
        L2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        L2.setIconTextGap(15);
        L2.setPreferredSize(new java.awt.Dimension(229, 80));
        L2.setRequestFocusEnabled(false);
        L2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                L2ActionPerformed(evt);
            }
        });
        Panel.add(L2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1741, 13, 213, 37));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 1953, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AbrirFilesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AbrirFilesActionPerformed
        Controlador.Recibidor.Abrir_file();
    }//GEN-LAST:event_AbrirFilesActionPerformed

    private void AnalizarLexicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarLexicoActionPerformed
        Controlador.Recibidor.Analizador_lexico();
    }//GEN-LAST:event_AnalizarLexicoActionPerformed

    private void AnalizarSintacticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnalizarSintacticoActionPerformed
        Controlador.Recibidor.Analizador_sintactico();
    }//GEN-LAST:event_AnalizarSintacticoActionPerformed

    private void L1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L1ActionPerformed
        Entrada.setText("");
    }//GEN-LAST:event_L1ActionPerformed

    private void L2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L2ActionPerformed
        Lexico.setText("");
    }//GEN-LAST:event_L2ActionPerformed

    private void L3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_L3ActionPerformed
        Respuesta.setText("");
    }//GEN-LAST:event_L3ActionPerformed
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AbrirFiles;
    private javax.swing.JButton AnalizarLexico;
    private javax.swing.JButton AnalizarSintactico;
    private javax.swing.JTextArea Entrada;
    private javax.swing.JButton L1;
    private javax.swing.JButton L2;
    private javax.swing.JButton L3;
    private javax.swing.JTextArea Lexico;
    private javax.swing.JPanel Panel;
    private javax.swing.JButton Productos1;
    private javax.swing.JTextArea Respuesta;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    // End of variables declaration//GEN-END:variables

    public JTextArea getEntrada() {
        return Entrada;
    }
    public JTextArea getLexico() {
        return Lexico;
    }
    public JTextArea getRespuesta() {
        return Respuesta;
    }
}